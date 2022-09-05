package project.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.HRMS.business.abstarcts.JobPositionService;
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
	public List<JobPosition> getAll() {
	
		return this.jobPositionDao.findAll();
	}

}
