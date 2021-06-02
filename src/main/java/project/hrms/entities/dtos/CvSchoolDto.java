package project.hrms.entities.dtos;

import java.time.LocalDate;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvSchoolDto {
	private int cvId;
	private int cvSchoolId;
//	private String cvSchoolName;
//	private String cvSchoolDepartment;
//	private LocalDate admissionDate;
//	private LocalDate completionDate; 
}