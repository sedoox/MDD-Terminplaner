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
			if (!folder.exists()) {
				folder.create(true, true, new NullProgressMonitor());
			}
			
			var IFolder projectsFolder = project.getFolder(SOURCE_FOLDER_PATH + PACKAGE_PATH + "projekte");
			if (!folder.exists()) {
				folder.create(true, true, new NullProgressMonitor());
			}
			
			var IFolder meetingFolder = project.getFolder(SOURCE_FOLDER_PATH + PACKAGE_PATH + "termine");
			if (!folder.exists()) {
				folder.create(true, true, new NullProgressMonitor());
			}
			
			
			for (Verwaltungssystem vs : resourceEcore.allContents.toIterable.filter(typeof(Verwaltungssystem))
			) {
				progressMonitor.subTask("Generating User");
				for (Nutzer n : vs.nutzer) {
					var content = compileUser(n)
					createFile(
						userFolder,
						'''«n.fullName.replaceAll(" ", "")».html''',
						false,
						content,
						progressMonitor
					);
				}
				progressMonitor.subTask("Generating Projects");
				for (Projekt p : vs.projekte) {
					var content = compileProjects(p)
					createFile(
						projectsFolder,
						'''«p.name.replaceAll(" ", "")».html''',
						false,
						content,
						progressMonitor
					);	
				}
			}

			// finish the progress monitor
			progressMonitor.done;

		} catch (Exception ex) {
			ex.printStackTrace;
		}

	}

	def compileUser(Nutzer n) {
		'''
		<!DOCTYPE html>
		<html lang="en">
		  <head>
		    <meta charset="UTF-8" />
		    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
		    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		    <link rel="stylesheet" href="../css/benutzer.css" />
		    <link rel="stylesheet" href="../css/kalender.css" />
		    <title>«n.fullName»</title>
		  </head>
		  <body>
		    <div class="top">
		      <div class="name"><b>«n.fullName»</b></div>
		    </div>
		    <div class="bottom">
		      <div class="projekte">
		        <img class="image" src="../images/projekt.png" alt="IMG" />
		        <b>Projekte:</b>
		        <div class="liste">
		        	«FOR p : n.projekte»
		        	«p.name»<br />
			        «ENDFOR»
		        </div>
		      </div>
		      «compileCalendar(getTermine(n.termine))»
	        </div>
		  </body>
		</html>
		'''
	}
	
	def compileProjects(Projekt p) {
		'''
		<!DOCTYPE html>
		<html lang="en">
		  <head>
		    <meta charset="UTF-8" />
		    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
		    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		    <link rel="stylesheet" href="../css/projekt.css" />
		    <link rel="stylesheet" href="../css/kalender.css" />
		    <title>«p.name»</title>
		  </head>
		  <body>
		    <div class="top">
		      <div class="name"><b>Geschäftsessen</b></div>
		      <div class="beschreibung">
		        «p.beschreibung»
		      </div>
		    </div>
		    <div class="bottom">
		      <div class="teilnehmer">
		        <img class="image" src="../images/people.png" alt="IMG" />
		        <b>Teilnehmer:</b>
		        <div class="liste">
		        	«FOR n : p.nutzer»
		        	«n.fullName»
		        	«ENDFOR»
		        </div>
		      </div>
		      <div class="ort">
		        <img class="image" src="../images/location.png" alt="IMG" />
		        <b>Ort:</b>
		        <div class="name">Moriki Frankfurt</div>
		      </div>
		
		      <div class="month">
		        <ul>
		          <li class="prev">&#10094;</li>
		          <li class="next">&#10095;</li>
		          <li>
		            Jahr<br /><span style="font-size: 18px">Monat</span><br /><span
		              style="font-size: 12px"
		              >Kalenderwoche</span
		            >
		          </li>
		        </ul>
		      </div>
		      <ul class="weekdays">
		        <li>Zeit</li>
		        <li>Mo</li>
		        <li>Di</li>
		        <li>Mi</li>
		        <li>Do</li>
		        <li>Fr</li>
		        <li>Sa</li>
		        <li>So</li>
		      </ul>
		      <ul class="times">
		        <div class="time">
		          <div>
		            <li>8:00 - 9:00</li>
		            <li>Termin 1</li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		          </div>
		          <div>
		            <li>9:00 - 10:00</li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li>Termin 2</li>
		            <li></li>
		            <li></li>
		            <li></li>
		          </div>
		          <div>
		            <li>10:00 - 11:00</li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		          </div>
		          <div>
		            <li>11:00 - 12:00</li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		          </div>
		          <div>
		            <li>12:00 - 13:00</li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		          </div>
		          <div>
		            <li>13:00 - 14:00</li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		          </div>
		          <div>
		            <li>14:00 - 15:00</li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		          </div>
		          <div>
		            <li>15:00 - 16:00</li>
		            <li>Termin 3</li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		          </div>
		          <div>
		            <li>16:00 - 17:00</li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		          </div>
		          <div>
		            <li>17:00 - 18:00</li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		          </div>
		          <div>
		            <li>18:00 - 19:00</li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li>Termin 4</li>
		          </div>
		          <div>
		            <li>19:00 - 20:00</li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		            <li></li>
		          </div>
		        </div>
		      </ul>
		    </div>
		  </body>
		</html>
		
		'''
	}
	
	def compileCalendar(HashMap<Integer, List<Integer>> map) {
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
	    <p>«time»:00 - «time+1»:00</p>
          «FOR day : (1..7)»
	          «IF map.containsKey(time) && map.get(time).contains(day)»
	          <p class="meeting"></p>
	          «ELSE»
	          <p></p>
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
	
	def HashMap<Integer, List<Integer>> getTermine(EList<Termin> list) {
		if(list.size == 0) {
			return new HashMap
		}
		var week = new HashMap<Integer, List<Integer>>
		for (termin : list) {
			//TODO tagesübergreifend
			for (i : (termin.startDatum.hours..<termin.endDatum.hours)) {
				if (week.get(i).isNullOrEmpty) {
					week.put(i, new ArrayList)
				}
				week.get(i).add(termin.startDatum.day)
			}
		}
		return week
	}
}
