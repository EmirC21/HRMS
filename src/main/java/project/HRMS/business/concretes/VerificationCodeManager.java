package project.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.HRMS.business.abstarcts.VerificationCodeService;
import project.HRMS.core.utilities.results.DataResult;
import project.HRMS.core.utilities.results.ErrorResult;
import project.HRMS.core.utilities.results.Result;
import project.HRMS.core.utilities.results.SuccessDataResult;
import project.HRMS.core.utilities.results.SuccessResult;
import project.HRMS.dataAccess.abstracts.VerificationCodeDao;
import project.HRMS.entities.concretes.VerificationCode;
@Service
public class VerificationCodeManager implements VerificationCodeService {
	private VerificationCodeDao verificationCodeDao;
     @Autowired
     public VerificationCodeManager (VerificationCodeDao verificationCodeDao) {
    	 super();
    	 this.verificationCodeDao=verificationCodeDao;
     }
	@Override
	public Result add(VerificationCode verificitionCode) {
		this.verificationCodeDao.save(verificitionCode);
		return new SuccessResult("code has been saved");
	}

	@Override
	public Result delete(VerificationCode verificitionCode) {
		this.verificationCodeDao.delete(verificitionCode);
		return new ErrorResult("code has been deleted");
	}

	@Override
	public Result update(VerificationCode verificitionCode) {
		this.verificationCodeDao.save(verificitionCode);
		return new SuccessResult("code has been updated");
	}

	@Override
	public DataResult<VerificationCode> getById(int id) {
		return new SuccessDataResult<VerificationCode>(this.verificationCodeDao.getById(id));
	}

	@Override
	public DataResult<List<VerificationCode>> getAll() {
		return new SuccessDataResult<List<VerificationCode>>(this.verificationCodeDao.findAll());
	}

}
