package project.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.HRMS.business.abstarcts.EmployeeService;
import project.HRMS.core.utilities.results.DataResult;
import project.HRMS.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
	private EmployeeService employeeService;
    @Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employee>> getAll(){
		return this.employeeService.getAll();
		
	}
	
	
	
	

}
