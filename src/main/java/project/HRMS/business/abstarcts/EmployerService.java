package project.HRMS.business.abstarcts;

import java.util.List;

import project.HRMS.core.utilities.results.DataResult;
import project.HRMS.core.utilities.results.Result;
import project.HRMS.entities.concretes.Employer;

public interface EmployerService {
	
	Result add(Employer employer);
	DataResult<List<Employer>> getAll();
	
	
	

}
