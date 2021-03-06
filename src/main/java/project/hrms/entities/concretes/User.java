package project.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.hrms.entities.abstracts.Entities;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User implements Entities {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "email")
	@Email(message = "Email is invalid")
	@NotBlank(message = "This field is required")
	@NotNull
    private String email;
	
	
    @Column(name = "password")
    @NotBlank(message = "This field is required")
    @Size(min = 6, max = 35, message = "Password need to be at least 6 character.")
	@NotNull
    private String password;

    @Column(name = "is_verified")
    private boolean isVerified=false;
   
    
}
