package project.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.HRMS.business.abstarcts.EmployerService;
import project.HRMS.core.utilities.results.DataResult;
import project.HRMS.core.utilities.results.Result;
import project.HRMS.core.utilities.results.SuccessDataResult;
import project.HRMS.core.utilities.results.SuccessResult;
import project.HRMS.dataAccess.abstracts.EmployerDao;
import project.HRMS.entities.concretes.Employer;
@Service
public class EmployerManager implements EmployerService {

	
	private EmployerDao employerDao;
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
	    super();
		this.employerDao=employerDao;
	}
	@Override
	public Result add(Employer employer) {
		employerDao.save(employer);
		return new SuccessResult("employer has been added");
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"employer information has been listed");
	}

	

}
