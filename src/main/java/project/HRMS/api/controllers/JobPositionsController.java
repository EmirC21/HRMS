package project.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.HRMS.business.abstarcts.JobPositionService;
import project.HRMS.core.utilities.results.DataResult;
import project.HRMS.core.utilities.results.Result;
import project.HRMS.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/JobPositions")
public class JobPositionsController {
	private JobPositionService jobPositionService;
	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService=jobPositionService;
	}
	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
		
		return this.jobPositionService.getAll();
		
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody  JobPosition jobPosition) {
		return this.jobPositionService.add(jobPosition);
		
	}
	
	
	
	
	
	
	

}
