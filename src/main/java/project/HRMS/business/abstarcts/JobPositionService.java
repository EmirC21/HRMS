package project.HRMS.business.abstarcts;

import java.util.List;

import project.HRMS.core.utilities.results.DataResult;
import project.HRMS.core.utilities.results.Result;
import project.HRMS.entities.concretes.JobPosition;

public interface JobPositionService {
	
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
	
	

}
