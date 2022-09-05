package project.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.HRMS.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	
	
	
	
	
}
