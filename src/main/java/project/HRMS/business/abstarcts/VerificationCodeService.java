package project.HRMS.business.abstarcts;

import java.util.List;


import project.HRMS.core.utilities.results.DataResult;
import project.HRMS.core.utilities.results.Result;
import project.HRMS.entities.concretes.VerificationCode;

public interface VerificationCodeService {
	
	Result add(VerificationCode verification);
	Result delete(VerificationCode verification);
    Result update(VerificationCode verification);
    
    DataResult<VerificationCode> getById(int id);
    DataResult<List<VerificationCode>> getAll();
}
