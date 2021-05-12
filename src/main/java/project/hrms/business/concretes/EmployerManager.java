package project.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.EmployerService;
import project.hrms.dataAccess.abstracts.EmployorDao;
import project.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	private EmployorDao employorDao;

	public EmployerManager(EmployorDao employorDao) {
		super();
		this.employorDao = employorDao;
	}

	@Override
	public Employer addEmployer(Employer employer) {
		return employorDao.save(employer);
	}

	@Override
	public List<Employer> addAllEmployers(List<Employer> employers) {
		return employorDao.saveAll(employers);
	}
	
}