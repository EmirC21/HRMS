package project.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import project.HRMS.entities.concretes.VerificationCode;

public interface VerificationCodeDao extends JpaRepository<VerificationCode, Integer> {

	
	
	
	
}
