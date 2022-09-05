package project.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="job_position")
@Entity
public class JobPosition {
	@Id
	@GeneratedValue
	@Column(name="job_id")
	private int id;
	@Column(name="position_name")
	private String position_name;
	
	
	public JobPosition() {}

}
