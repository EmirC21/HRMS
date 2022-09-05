package project.HRMS.business.abstarcts;

import java.util.List;

import project.HRMS.core.utilities.results.DataResult;

import project.HRMS.entities.concretes.Employee;

public interface EmployeeService {
	
	DataResult<List<Employee>> getAll();
	
	
	
	

}
