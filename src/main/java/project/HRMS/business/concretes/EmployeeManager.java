package project.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.HRMS.business.abstarcts.EmployeeService;
import project.HRMS.core.utilities.results.DataResult;
import project.HRMS.core.utilities.results.SuccessDataResult;
import project.HRMS.entities.concretes.Employee;
import project.HRMS.dataAccess.abstracts.EmployeeDao;

@Service
public class EmployeeManager implements EmployeeService{

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		this.employeeDao=employeeDao;
	}
	
	
	@Override
	public DataResult<List<Employee>> getAll() {
	return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(),"personnel information has been listed");
	}

}
