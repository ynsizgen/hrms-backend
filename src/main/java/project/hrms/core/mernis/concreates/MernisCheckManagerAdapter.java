package project.hrms.core.mernis.concreates;

import java.util.Locale;

import org.springframework.stereotype.Service;


import project.hrms.entities.concretes.Seeker;
import project.hrms.mernisService.KAWKPSPublicSoap;

@Service
public class MernisCheckManagerAdapter implements project.hrms.core.mernis.abstracts.MernisCheckService {
	
	private KAWKPSPublicSoap kawkpsPublicSoap = new KAWKPSPublicSoap();
	
	@Override
	public boolean userCheck(Seeker seeker) {
		 try {
	            return this.kawkpsPublicSoap.TCKimlikNoDogrula(
	                    Long.parseLong(seeker.getNationalityNumber()),
	                    seeker.getFirstName().toUpperCase(new Locale("tr", "TR")),
	                    seeker.getLastName().toUpperCase(new Locale("tr", "TR")),
	                    seeker.getDateOfBirth().getYear());
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	}

}
