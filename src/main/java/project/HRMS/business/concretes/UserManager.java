package project.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.HRMS.business.abstarcts.UserService;
import project.HRMS.core.utilities.results.DataResult;
import project.HRMS.core.utilities.results.Result;
import project.HRMS.core.utilities.results.SuccessDataResult;
import project.HRMS.core.utilities.results.SuccessResult;
import project.HRMS.dataAccess.abstracts.UserDao;
import project.HRMS.entities.concretes.User;
@Service
public class UserManager implements UserService {
	private UserDao userDao;
    @Autowired
    public UserManager(UserDao userDao) {
    	super();
    	this.userDao=userDao;
    } 
	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("User has been added");
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll());
	}

	@Override
	public DataResult<User> getUserByEmail(String email) {
	   return new SuccessDataResult<User>(this.userDao.findUserByEmail(email));
	}

}
