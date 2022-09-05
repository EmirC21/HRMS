package project.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.HRMS.business.abstarcts.JobPositionService;
import project.HRMS.core.utilities.results.DataResult;
import project.HRMS.core.utilities.results.Result;
import project.HRMS.core.utilities.results.SuccessDataResult;
import project.HRMS.core.utilities.results.SuccessResult;
import project.HRMS.dataAccess.abstracts.JobPositionDao;
import project.HRMS.entities.concretes.JobPosition;
@Service
public class JobPositionManager implements JobPositionService {

	
	private JobPositionDao jobPositionDao;
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao=jobPositionDao;
	}
	
	@Override
	public DataResult<List<JobPosition>> getAll() {
	
		return new SuccessDataResult<List<JobPosition>>
		(this.jobPositionDao.findAll(),"job positions have been listed");
	}

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("job position has been added");
	}

}
