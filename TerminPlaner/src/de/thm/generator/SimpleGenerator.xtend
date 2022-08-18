package de.thm.generator

import java.io.ByteArrayInputStream
import java.io.InputStream
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import Terminplaner.Nutzer
import Terminplaner.Projekt
import Terminplaner.Termin
import Terminplaner.Verwaltungssystem
import org.eclipse.emf.common.util.EList
import java.util.Map
import java.util.HashMap
import java.util.List
import java.util.ArrayList
import java.util.Set
import java.util.Map.Entry
import java.util.HashSet
import Terminplaner.impl.TerminImpl
import java.util.Date
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EOperation
import java.lang.reflect.InvocationTargetException
import org.eclipse.emf.common.notify.Notification
import java.util.EventListener
import java.util.logging.Handler
import java.util.Iterator
import java.lang.reflect.Array
import java.text.SimpleDateFormat
import java.util.Calendar
import java.nio.file.Paths
import java.nio.file.FileSystems

class SimpleGenerator {
	
	/**
	 * The path where to generate the Java files.
	 */
	public static final String SOURCE_FOLDER_PATH = "src-gen/";

	/**
	 * The base package name.
	 */
	public static final String PACKAGE = "de.thm.";
	public static final String PACKAGE_PATH = "/" + PACKAGE.replaceAll("\\.", "/");
	public static final List<String> MEETING_COLORS = List.of("meeting-green", "meeting-blue", "meeting-orange", "meeting-red", "meeting-purple", "meeting-purple")
	public static final String MEETING_FILL_CSS = "meeting-fill"
	private static final String CSS_FOLDER_IN_WEEK = "../../../css/"
	private static final String CSS_FOLDER = "../css/"
	private static final String IMAGES_FOLDER_IN_WEEK = "../../../images/"
	private static final String IMAGES_FOLDER = "../images/"

	def void doGenerate(Resource resourceEcore, IProject project, IProgressMonitor progressMonitor) {

		try {
			// begin the task with the amount of work
			progressMonitor.beginTask("Generating Java code", 2);

			progressMonitor.subTask("Creating folders");

			// create deeper folders
			var IFolder folder = project.getFolder(SOURCE_FOLDER_PATH);
			if (!folder.exists()) {
				folder.create(true, true, new NullProgressMonitor());
			}
			
			folder = project.getFolder(SOURCE_FOLDER_PATH + "de");
			if (!folder.exists()) {
				folder.create(true, true, new NullProgressMonitor());
			}
			folder = project.getFolder(SOURCE_FOLDER_PATH + "/de/thm");
			if (!folder.exists()) {
				folder.create(true, true, new NullProgressMonitor());
			}
			
			

			var IFolder userFolder = project.getFolder(SOURCE_FOLDER_PATH + PACKAGE_PATH + "nutzer");
			if (!userFolder.exists()) {
				userFolder.create(true, true, new NullProgressMonitor());
			}
			
			var IFolder projectsFolder = project.getFolder(SOURCE_FOLDER_PATH + PACKAGE_PATH + "projekte");
			if (!projectsFolder.exists()) {
				projectsFolder.create(true, true, new NullProgressMonitor());
			}
			
			var IFolder meetingsFolder = project.getFolder(SOURCE_FOLDER_PATH + PACKAGE_PATH + "termine");
			if (!meetingsFolder.exists()) {
				meetingsFolder.create(true, true, new NullProgressMonitor());
			}
			
			
			for (Verwaltungssystem vs : resourceEcore.allContents.toIterable.filter(typeof(Verwaltungssystem))
			) {
				var meetings = new HashMap<Integer, HashMap<Integer, ArrayList<Termin>>>
				for (termin : vs.termine) {
					if (!meetings.containsKey(termin.startDatum.year)) {
						meetings.put(termin.startDatum.year, new HashMap)
					}
					if (!meetings.get(termin.startDatum.year).containsKey(termin.startDatum.week)) {
						meetings.get(termin.startDatum.year).put(termin.startDatum.week, new ArrayList)
					}
					
					meetings.get(termin.startDatum.year).get(termin.startDatum.week).add(termin)
				}
				
				for (year : meetings.keySet) {
					var IFolder yearFolder = project.getFolder('''«SOURCE_FOLDER_PATH»«PACKAGE_PATH»termine/jahr «year+1900»''');
					if (!yearFolder.exists()) {
						yearFolder.create(true, true, new NullProgressMonitor());
					}
					for (week : meetings.get(year).keySet) {
						var IFolder weekFolder = project.getFolder('''«SOURCE_FOLDER_PATH»«PACKAGE_PATH»termine/jahr «year+1900»/woche «week»''');
						if (!weekFolder.exists()) {
							weekFolder.create(true, true, new NullProgressMonitor());
						}
						progressMonitor.subTask('''Generating Meetings Year: «1970+year», Week: «week»''');
						for (Termin t : meetings.get(year).get(week)) {
							var content = compileMeetings(t)
							createFile(
								weekFolder,
								'''«t.name.replaceAll(" ", "")».html''',
								false,
								content,
								progressMonitor
							);	
						}
					}
				}
				
				
				for (n : vs.nutzer) {
					var meetingsForUser = new HashMap<Integer, HashMap<Integer, ArrayList<Termin>>>
					for (termin : n.termine) {
						if (!meetingsForUser.containsKey(termin.startDatum.year)) {
							meetingsForUser.put(termin.startDatum.year, new HashMap)
						}
						if (!meetingsForUser.get(termin.startDatum.year).containsKey(termin.startDatum.week)) {
							meetingsForUser.get(termin.startDatum.year).put(termin.startDatum.week, new ArrayList)
						}
						
						meetingsForUser.get(termin.startDatum.year).get(termin.startDatum.week).add(termin)
					}
					
					if (meetingsForUser.keySet.nullOrEmpty) {
						progressMonitor.subTask('''Generating User: «n.fullName»''');
						var content = compileUser(n, new ArrayList)
						createFile(
							userFolder,
							'''«n.fullName.replaceAll(" ", "")».html''',
							false,
							content,
							progressMonitor
						);	
					} else {
						for (Integer year : meetingsForUser.keySet) {
							var IFolder yearFolder = project.getFolder('''«SOURCE_FOLDER_PATH»«PACKAGE_PATH»nutzer/jahr «year+1900»''');
							if (!yearFolder.exists()) {
								yearFolder.create(true, true, new NullProgressMonitor());
							}
							for (week : meetingsForUser.get(year).keySet) {
								var IFolder weekFolder = project.getFolder('''«SOURCE_FOLDER_PATH»«PACKAGE_PATH»nutzer/jahr «year+1900»/woche «week»''');
								if (!weekFolder.exists()) {
									weekFolder.create(true, true, new NullProgressMonitor());
								}
								progressMonitor.subTask('''Generating User: «n.fullName» Year: «1970+year», Week: «week»''');
								var content = compileUser(n, meetingsForUser.get(year).get(week))
								createFile(
									weekFolder,
									'''«n.fullName.replaceAll(" ", "")».html''',
									false,
									content,
									progressMonitor
								);	
							}
						}
					}
				}
				
				
				for (p : vs.projekte) {
					var meetingsForProjects = new HashMap<Integer, HashMap<Integer, ArrayList<Termin>>>
					for (termin : p.termine) {
						if (!meetingsForProjects.containsKey(termin.startDatum.year)) {
							meetingsForProjects.put(termin.startDatum.year, new HashMap)
						}
						if (!meetingsForProjects.get(termin.startDatum.year).containsKey(termin.startDatum.week)) {
							meetingsForProjects.get(termin.startDatum.year).put(termin.startDatum.week, new ArrayList)
						}
						
						meetingsForProjects.get(termin.startDatum.year).get(termin.startDatum.week).add(termin)
					}
					
					if (meetingsForProjects.keySet.nullOrEmpty) {
						progressMonitor.subTask('''Generating Project: «p.name»''');
						var content = compileProjects(p, new ArrayList)
						createFile(
							projectsFolder,
							'''«p.name.replaceAll(" ", "")».html''',
							false,
							content,
							progressMonitor
						);	
					} else {
						for (Integer year : meetingsForProjects.keySet) {
							var IFolder yearFolder = project.getFolder('''«SOURCE_FOLDER_PATH»«PACKAGE_PATH»projekte/jahr «year+1900»''');
							if (!yearFolder.exists()) {
								yearFolder.create(true, true, new NullProgressMonitor());
							}
							for (week : meetingsForProjects.get(year).keySet) {
								var IFolder weekFolder = project.getFolder('''«SOURCE_FOLDER_PATH»«PACKAGE_PATH»projekte/jahr «year+1900»/woche «week»''');
								if (!weekFolder.exists()) {
									weekFolder.create(true, true, new NullProgressMonitor());
								}
								progressMonitor.subTask('''Generating User: «p.name» Year: «1970+year», Week: «week»''');
								var content = compileProjects(p, meetingsForProjects.get(year).get(week))
								createFile(
									weekFolder,
									'''«p.name.replaceAll(" ", "")».html''',
									false,
									content,
									progressMonitor
								);	
							}
						}
					}
				}
			}

			// finish the progress monitor
			progressMonitor.done;

		} catch (Exception ex) {
			ex.printStackTrace;
		}

	}

	def compileUser(Nutzer n, ArrayList<Termin> termine) {
		'''
		<!DOCTYPE html>
		<html lang="en">
		  <head>
		    <meta charset="UTF-8" />
		    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
		    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		    «IF termine.nullOrEmpty»
		    <link rel="stylesheet" href="«CSS_FOLDER»benutzer.css" />
		    <link rel="stylesheet" href="«CSS_FOLDER»kalender.css" />
		    «ELSE»
		    <link rel="stylesheet" href="«CSS_FOLDER_IN_WEEK»benutzer.css" />
		    <link rel="stylesheet" href="«CSS_FOLDER_IN_WEEK»kalender.css" />
		    «ENDIF»
		    <title>«n.fullName»</title>
		  </head>
		  <body>
		    <div class="head">
		      <div class="name"><b>«n.fullName»</b></div>
		    </div>
		    <div class="bottom">
		      <div class="projekte">
		     	«IF termine.nullOrEmpty»
				<img class="image" src="«IMAGES_FOLDER»projekt.png" alt="IMG" />
	  		    «ELSE»
				<img class="image" src="«IMAGES_FOLDER_IN_WEEK»projekt.png" alt="IMG" />
	  		    «ENDIF»
		        <b>Projekte:</b>
		        <div class="liste">
		        	«FOR p : n.projekte»
		        	«p.name»<br />
			        «ENDFOR»
		        </div>
		      </div>
		      «compileCalendar(toHourMap(bla(termine)))»
	        </div>
		  </body>
		</html>
		'''
	}
	
	def compileProjects(Projekt p, ArrayList<Termin> termine) {
		'''
		<!DOCTYPE html>
		<html lang="en">
		  <head>
		    <meta charset="UTF-8" />
		    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
		    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		    «IF termine.nullOrEmpty»
		    <link rel="stylesheet" href="«CSS_FOLDER»projekt.css" />
		    <link rel="stylesheet" href="«CSS_FOLDER»kalender.css" />
		    «ELSE»
		    <link rel="stylesheet" href="«CSS_FOLDER_IN_WEEK»projekt.css" />
		    <link rel="stylesheet" href="«CSS_FOLDER_IN_WEEK»kalender.css" />
		    «ENDIF»
		    <title>«p.name»</title>
		  </head>
		  <body>
		    <div class="head">
		      <div class="name"><b>Geschäftsessen</b></div>
		      <div class="beschreibung">
		        «p.beschreibung»
		      </div>
		    </div>
		    <div class="bottom">
		      <div class="teilnehmer">
  		     	«IF termine.nullOrEmpty»
  				<img class="image" src="«IMAGES_FOLDER»people.png" alt="IMG" />
  	  		    «ELSE»
  				<img class="image" src="«IMAGES_FOLDER_IN_WEEK»people.png" alt="IMG" />
  	  		    «ENDIF»
		        <b>Teilnehmer:</b>
		        <div class="liste">
		        	«FOR n : p.nutzer»
		        	«n.fullName»
		        	«ENDFOR»
		        </div>
		      </div>
		      <div class="ort">
		     	«IF termine.nullOrEmpty»
				<img class="image" src="«IMAGES_FOLDER»location.png" alt="IMG" />
				«ELSE»
				<img class="image" src="«IMAGES_FOLDER_IN_WEEK»location.png" alt="IMG" />
	  		    «ENDIF»
		        <b>Orte:</b>
		        <div class="liste">
		        	«FOR ort : p.termine.allLocations»
		        	«ort»
		        	«ENDFOR»
		        </div>
		      </div>
		       «compileCalendar(toHourMap(bla(termine)))»
		    </div>
		  </body>
		</html>
		
		'''
	}
	
	def compileMeetings(Termin t) {
		'''
		<!DOCTYPE html>
		<html lang="en">
		  <head>
		    <meta charset="UTF-8" />
		    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
		    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		    <link rel="stylesheet" href="«CSS_FOLDER_IN_WEEK»termin.css" />
		    <title>«t.name»</title>
		  </head>
		  <body>
		    <div class="head">
		      <div class="name"><b>«t.name»</b></div>
		      <div class="beschreibung">
		        «t.beschreibung»
		      </div>
		    </div>
		    <div class="bottom">
		      <div class="teilnehmer">
		        <img class="image" src="«IMAGES_FOLDER_IN_WEEK»people.png" alt="IMG" />
		        <b>Teilnehmer:</b>
		        <div class="liste">
		        «FOR n : t.nutzer»
		       	  «n.fullName» <br />
		        «ENDFOR»
		        </div>
		      </div>
		      <div class="ort">
		        <img class="image" src="«IMAGES_FOLDER_IN_WEEK»location.png" alt="IMG" />
		        <b>Ort:</b>
		        <div class="name">«t.ort»</div>
		      </div>
		      <div class="zeit">
		        <img class="image" src="«IMAGES_FOLDER_IN_WEEK»clock.png" alt="IMG" />
		        <b>Uhrzeit:</b>
		        <div class="liste">
		          «t.startDatum.dateToDateString»
		          
		          «t.startDatum.dateToTimeString»
		        </div>
		      </div>
		    </div>
		  </body>
		</html>
		
		'''
	}
	
	def compileCalendar(HashMap<Integer, List<Termin>> map) {
		'''
	    <div class="month">
	      <ul>
	        <li class="prev">&#10094;</li>
	        <li class="next">&#10095;</li>
	        <li>
	          Jahr<br /><span style="font-size: 18px">Monat</span><br /><span style="font-size: 12px">Kalenderwoche</span>
	        </li>
	      </ul>
	    </div>
	    <div class="weekdays">
	      <p>Zeit</p>
	      <p>Mo</p>
	      <p>Di</p>
	      <p>Mi</p>
	      <p>Do</p>
	      <p>Fr</p>
	      <p>Sa</p>
	      <p>So</p>
	    </div>
	    <div class="times">
	    «FOR time : (8..19)»
	    <div class="row">
	    <div class="cell">«time»:00 - «time+1»:00</div>
          «FOR day : (1..7)»
	          «IF map.containsKey(time) && map.get(time).map[startDatum.day].contains(day)»
	          «var map2 = map.get(time).filter[startDatum.day == day].sortBy[order]»
	          <div class="meetings">
	          «FOR i: (0..<map2.size)»
	          	«IF map2.get(i) instanceof TerminFill»
	          		<div class="«MEETING_FILL_CSS»"></div>
	          	«ELSE»
                	<div class="«MEETING_COLORS.get(i)»"><a href="../../termine/«map2.get(i).name.replaceAll(" ", "")».html" class="fill-div"></a></div>
            	«ENDIF»
              «ENDFOR»
              </div>
	          «ELSE»
	          <div class="cell"></div>
	          «ENDIF»
          «ENDFOR»
	    </div>
	    «ENDFOR»
		'''
	}

	def isString(EAttribute a) {
		a.EAttributeType.classifierID == EcorePackage.ESTRING
	}

	/**
	 * Creates a file (containing the content-CharSequence) within the given IFolder.
	 */
	def void createFile(IFolder folder, String fileName, boolean overrideFile, CharSequence content, IProgressMonitor progressMonitor) {
		if (progressMonitor.canceled) {
			throw new RuntimeException("Progress canceled");
		}
		if (!folder.exists()) {
			folder.create(true, true, null);
		}
		var IFile iFile = folder.getFile(fileName);
		if (iFile.exists && true /*overrideFile*/ ) {
			iFile.delete(true, null);
		}
		if (!iFile.exists) {
			var String formattedCode = content.toString

			var byte[] bytes
			if (formattedCode !== null) { 
				bytes = formattedCode.getBytes();
			} else {
				bytes = content.toString.bytes;
				System.err.println("File " + fileName + " could not be formatted.")
			}
			var InputStream source = new ByteArrayInputStream(bytes);
			iFile.create(source, true, null);
		}
	}
	
	def String getFullName(Nutzer n) {
		'''«n.vorname.toLowerCase.toFirstUpper» «n.nachname.toLowerCase.toFirstUpper»'''
	}
	
	def HashMap<Integer, List<Termin>> getTermine(EList<Termin> list) {
		if(list.size == 0) {
			return new HashMap
		}
		var week = new HashMap<Integer, List<Termin>>
		for (termin : list) {
			//TODO tagesübergreifend
			for (i : (termin.startDatum.hours..<termin.endDatum.hours)) {
				if (week.get(i).isNullOrEmpty) {
					week.put(i, new ArrayList)
				}
				week.get(i).add(termin)
			}
		}
		println(week)
		return week
	}
	
	def HashMap<Integer, HashMap<Integer, List<Termin>>> bla(ArrayList<Termin> list) {
		var map = new HashMap<Integer, HashMap<Integer, List<Termin>>>
		if(list.size == 0) {
			return map
		}
		
		var order = 0
		for (termin : list) {
			termin.order = order
			order++
			var day = termin.startDatum.day
			if (map.get(day) === null) {
				map.put(day, new HashMap<Integer, List<Termin>>)
			}			
			for (hours : (termin.startDatum.hours..<termin.endDatum.hours)) {
				if (map.get(day).get(hours).isNullOrEmpty) {
					map.get(day).put(hours, new ArrayList)
				}
				map.get(day).get(hours).add(termin)
			}
		}
		
		println("MAP: " + map)
		var duplicates = new ArrayList<List<Termin>>
		for (item : map.values) {
			for (item2 : item.values) {
				if (item2.size > 1) {
					duplicates.add(item2)
				}
			}
		}
		
		println("Duplikate: " + duplicates)
		
		var listToReplace = new ArrayList
		var listToInsert = new ArrayList
		for (i : (0..<duplicates.size-1)) {
			var tmp = fixDuplicates(duplicates.get(i), duplicates.get(i+1))
			if (tmp !== null) {
				listToInsert.add(tmp)
				listToReplace.add(duplicates.get(i))
				listToReplace.add(duplicates.get(i+1))
			}
		}
		
		var count = 0
		for (i : (0..<listToReplace.size)) {
			duplicates.remove(listToReplace.get(i))
			if (i % 2 == 0) {
				duplicates.add(listToInsert.get(count))
				count++
			}
		}

		println("FIXED Duplikate: " + duplicates)
		
		for (duplicate : duplicates) {
			for (i : (0..<duplicate.size)) {
				var iterator = map.get(duplicate.get(0).startDatum.day).values.iterator
				while (iterator.hasNext) {
					var value = iterator.next
					if(value.contains(duplicate.get(i)) && value.size < duplicate.size) {
						for (x : (0..<duplicate.size)) {
							if (!value.contains(duplicate.get(x))) {
								value.add(new TerminFill(duplicate.get(x).startDatum, duplicate.get(x).order))
							}
						}
					}
				}
			}
		}
		
		/*
		for (day : (1..7)) {
			var listToReplace2 = new HashMap<Integer, List<Termin>>
			var listToInsert2 = new HashMap<Integer, List<Termin>>
			if (map.get(day) !== null) {
				for (hour : (8..19)) {
					if (!map.get(day).get(hour).nullOrEmpty && !map.get(day).get(hour+1).nullOrEmpty) {
						var tmp = fixDuplicates2(map.get(day).get(hour), map.get(day).get(hour+1))
						if (tmp !== null) {
							println("DAY: " + day + " HOUR: " + hour + " Insert: " + tmp + ", Replace: " + map.get(day).get(hour) + ", " + map.get(day).get(hour+1))
							if (listToInsert2.get(hour).nullOrEmpty) {
								listToInsert2.put(hour, tmp)
							} else {
								listToInsert2.get(hour).addAll(tmp)
							}
							
							if (listToReplace2.get(hour).nullOrEmpty) {
								listToReplace2.put(hour, map.get(day).get(hour))
							} else {
								listToReplace2.get(hour).addAll(map.get(day).get(hour))
							}
							
							if (listToReplace2.get(hour+1).nullOrEmpty) {
								listToReplace2.put(hour+1, map.get(day).get(hour+1))
							} else {
								listToReplace2.get(hour+1).addAll(map.get(day).get(hour+1))
							}
						}
					}
				}
			}
			
			count = 0
			for (i : (8..19)) {
				if (!listToReplace2.get(i).nullOrEmpty) {
					map.get(day).get(i).remove(listToReplace2.get(i))
					if (i % 2 == 0) {
						println(count)
						map.get(day).get(i).addAll(listToInsert2.get(i))
						count++
					}
				}

			}
		}
		*/
		
		
		println("FIXED LIST: " + map)
		return map
	}
	
	def fixDuplicates(List<Termin> a, List<Termin> b) {
		var abc = new ArrayList<Termin>(b)
		for (x : a) {
			if (abc.contains(x)) {
				abc.addAll(a)
				return abc.toSet.toList
			}
		}
		return null
	}
	
	def toHourMap(HashMap<Integer, HashMap<Integer, List<Termin>>> map) {
		var bigMap = new HashMap<Integer, List<Termin>>
		for (newMap : map.values) {
			for (key : newMap.keySet) {
				if (bigMap.get(key).isNullOrEmpty) {
					bigMap.put(key, newMap.get(key))
				} else {
					bigMap.get(key).addAll(newMap.get(key))
				}
			}
		}
		println("BIGMAP: " + bigMap)
		return bigMap
	}
	
	def String dateToDateString(Date date) {
		var day = ""
		switch (date.day) {
			case 1:
				day = "Montag"
			case 2:
				day = "Dienstag"
			case 3:
				day = "Mittwoch"
			case 4:
				day = "Donnerstag"
			case 5:
				day = "Freitag"
			case 6:
				day = "Samstag"
			case 7:
				day = "Sonntag"			
		}
		var formatDate = new SimpleDateFormat("dd.MM.yyyy")
		
		'''
		«day», «formatDate.format(date)»
		'''
	}
	
	def String dateToTimeString(Date date) {
		var formatTime = new SimpleDateFormat("HH:mm")
		
		'''
		«formatTime.format(date)» Uhr
		'''
	}
	
	def getAllLocations(EList<Termin> list) {
		var set = new HashSet
		for (termin : list) {
			set.add(termin.ort)
		}
		return set
	}
	
	def int getWeek(Date date) {
		var c = Calendar.getInstance()
		c.time = date
		println('''Jahr: «date.year» WOCHE: « c.get(Calendar.WEEK_OF_YEAR)»''')
		return c.get(Calendar.WEEK_OF_YEAR);
	}
	
}

class TerminFill extends TerminImpl {
	
	var Date startDatum = null
	
	new(Date startDatum, int order) {
		this.startDatum = startDatum
		this.order = order
	}
	
	override getStartDatum() {
		return startDatum
	}
	
	override toString() {
		return "MeetingFill"
	}
	
}
