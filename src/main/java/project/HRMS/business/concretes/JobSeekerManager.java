package project.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.HRMS.business.abstarcts.JobSeekerService;
import project.HRMS.core.utilities.results.DataResult;
import project.HRMS.core.utilities.results.Result;
import project.HRMS.core.utilities.results.SuccessDataResult;
import project.HRMS.core.utilities.results.SuccessResult;
import project.HRMS.dataAccess.abstracts.JobSeekerDao;
import project.HRMS.entities.concretes.JobSeeker;
@Service
public class JobSeekerManager implements JobSeekerService {
	
    private JobSeekerDao jobSeekerDao;
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao=jobSeekerDao;
		
	}
	@Override
	public Result add(JobSeeker jobSeeker) {
	    this.jobSeekerDao.save(jobSeeker);
	    return new SuccessResult("jobseeker has been added");
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"jobseekers have been listed");
		
	}

	@Override
	public DataResult<JobSeeker> getJobSeekerByNationalId(String nationalId) {
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.findJobSeekerByNationalId(nationalId));
	}

}
