package project.HRMS.business.abstarcts;

import java.util.List;

import project.HRMS.core.utilities.results.DataResult;
import project.HRMS.core.utilities.results.Result;
import project.HRMS.entities.concretes.User;

public interface UserService {
	
	Result add(User user);
	
    DataResult<List<User>> getAll();
    DataResult<User>getUserByEmail(String email);
}
