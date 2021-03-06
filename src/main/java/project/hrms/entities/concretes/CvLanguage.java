package project.hrms.entities.concretes;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "cv_languages")
@AllArgsConstructor
@NoArgsConstructor
public class CvLanguage{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cv_language_id", nullable = false)
	private int cvLanguageId;
	
	@NotBlank(message = "This field is required")
	@Column(name = "cv_language_name")
	private String cvLanguageName;
	
	@NotBlank(message = "This field is required")
	@Min(1)
	@Max(5)
	@Column(name = "cv_language_level")
	private String cvLanguageLevel;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "cv_id", referencedColumnName = "cv_id")
    private Cv cv;
}
