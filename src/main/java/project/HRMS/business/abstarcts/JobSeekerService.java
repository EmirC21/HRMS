package project.HRMS.business.abstarcts;

import java.util.List;

import project.HRMS.core.utilities.results.DataResult;
import project.HRMS.core.utilities.results.Result;
import project.HRMS.entities.concretes.JobSeeker;

public interface JobSeekerService {
	
	Result add(JobSeeker jobSeeker);
	DataResult <List<JobSeeker>> getAll();
	DataResult<JobSeeker> getJobSeekerByNationalId(String nationalId);
	

}
