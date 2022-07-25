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
import Terminplaner.Kalender
import Terminplaner.Nutzer

class SimpleGenerator {
	
	/**
	 * The path where to generate the Java files.
	 */
	public static final String SOURCE_FOLDER_PATH = "src-gen/";

	/**
	 * The base package name.
	 */
	public static final String PACKAGE = "de.thm.xtendEMF.";
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
			folder = project.getFolder(SOURCE_FOLDER_PATH + "/de/thm/xtendEMF");
			if (!folder.exists()) {
				folder.create(true, true, new NullProgressMonitor());
			}

			// create entity package folder
			folder = project.getFolder(SOURCE_FOLDER_PATH + PACKAGE_PATH + "entities");
			if (!folder.exists()) {
				folder.create(true, true, new NullProgressMonitor());
			}

			/*
			 * We start to generate the classes for our application. First we create the *Gen classes, then die classes which extends the *Gen classes, in which the
			 * user can to customizations.
			 */
			// create Entities
			var IFolder entityFolder = project.getFolder(SOURCE_FOLDER_PATH + PACKAGE_PATH + "entities");
			progressMonitor.subTask("Generating Entities");
			for (Kalender e : resourceEcore.allContents.toIterable.filter(typeof(Kalender))) {

				for (Nutzer p : e.nutzer) {
					
						// create Entity
						var content = compileEntities(p)
						createFile(
							entityFolder,
							p.termine + ".txt",
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

	def compileEntities(Nutzer e) {
		'''
			Hier steht einiges �ber ITems muss ich sagen:
			
			Konkret geht es um dieses ITem: �e.productName� Da
			bin ich mir wirklich sicher!
		'''
	}

	def isString(EAttribute a) {
		a.EAttributeType.classifierID == EcorePackage.ESTRING
	}

	/**
	 * Creates a file (containing the content-CharSequence) within the given IFolder.
	 */
	def void createFile(IFolder folder, String fileName, boolean overrideFile, CharSequence content,
		IProgressMonitor progressMonitor) {
		if (progressMonitor.canceled) {
			throw new RuntimeException("Progress canceled");
		}
		if (!folder.exists()) {
			folder.create(true, true, null);
		}
		var IFile iFile = folder.getFile(fileName);
		// TODO, nur in der Testphase
		if (iFile.exists && true /*overrideFile*/ ) {
			iFile.delete(true, null);
		}
		if (!iFile.exists) {
			// process the code
			var String formattedCode = content.toString

			var byte[] bytes
			if (formattedCode !== null) { // has the code been formatted?
				bytes = formattedCode.getBytes();
			} else { // code could not be formatted
				bytes = content.toString.bytes;
				System.err.println("File " + fileName + " could not be formatted.")
			}
			// save the file
			var InputStream source = new ByteArrayInputStream(bytes);
			iFile.create(source, true, null);
		}
	}

}
