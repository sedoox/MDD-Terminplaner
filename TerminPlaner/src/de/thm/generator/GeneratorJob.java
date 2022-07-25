package de.thm.generator;


import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;



public class GeneratorJob extends Job implements IJobChangeListener{
	
	private long jobBegin;
	private Resource resEcoreFile;
	private IProject project;

	public GeneratorJob(String name, Resource resEcoreFile, IProject project) {
		super(name);
		this.resEcoreFile = resEcoreFile;
		this.project = project;
		addJobChangeListener(this);
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		// start the generation
		jobBegin = System.currentTimeMillis();
		SimpleGenerator generator = new SimpleGenerator();
		generator.doGenerate(resEcoreFile, project, monitor);
		return Status.OK_STATUS;
	}

	@Override
	public void aboutToRun(IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void awake(IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void done(IJobChangeEvent event) {
		long jobEnd = System.currentTimeMillis();
		if (event.getResult().isOK()) {
			System.out.println("Generating Java code has finished (took "
					+ (jobEnd - jobBegin) + " ms).");
		} else if (event.getResult().matches(Status.CANCEL)) {
			System.out
					.println("Generating Java code has been cancelled (took "
							+ (jobEnd - jobBegin) + " ms).");
		}

	}

	@Override
	public void running(IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void scheduled(IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sleeping(IJobChangeEvent event) {
		// TODO Auto-generated method stub

	}

}
