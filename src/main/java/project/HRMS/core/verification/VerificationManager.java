package project.HRMS.core.verification;

import java.util.UUID;

public class VerificationManager implements VerificationService {

	@Override
	public void sendMailLink(String email) {
		
		UUID uuid=UUID.randomUUID();
		String verificationLink="https://hrmsverificationmail/"+ uuid.toString();
		System.out.println(" verification link has been sent " + email );
		System.out.println(verificationLink);
		
	}

	@Override
	public String sendVerificationCode() {
		UUID uuid = UUID.randomUUID();
		String verificationCode = uuid.toString();
		System.out.println("Your activation code:  " + verificationCode );
		return verificationCode;
		
	}

}
