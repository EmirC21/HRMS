package project.HRMS.core.verification;

public interface VerificationService {
	
	void sendMailLink(String email);
	String sendVerificationCode();

}
