package com.gp.strategies;


import com.gp.model.Data;
import com.gp.model.Country;
import com.gp.model.Document;
import com.gp.model.SelfieMxValidate;
import com.gp.requirements.IdentificationRequirement;
import com.gp.requirements.RenapoRequirement;
import com.gp.requirements.Requirement;
import com.gp.requirements.SelfieRequirement;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;


public class Simple implements Strategy {

	@Autowired
	SelfieRequirement selfieRequirement;
	
	@Autowired
	RenapoRequirement renapoRequirement;
    
	private List<Requirement> requirements = new LinkedList<>();
    private Map<Document, Requirement> checks = new EnumMap<>(Document.class);
    
    public Simple() {
    	this.requirements.add(new IdentificationRequirement());
    	this.requirements.add(new SelfieRequirement());
	}
    
    @Override
    public String[] checklist(Country country, Long userId, String transaction) {
        Queue<String> list = new LinkedList<>();
        requirements.forEach(requirement -> {
            if (requirement.required(country) && !requirement.done(country,userId)) {
                list.add(requirement.kind().name());
            }
        });
        return list.toArray(new String[list.size()]);
    }
    
	@Override
	public boolean run(Country country, long rppUserId, Object data, String operation) {
		
			switch (operation) {
			case "selfie":
				if(selfieRequirement.validate(data, country)){
					selfieRequirement.execute(country, rppUserId, data);
				}
				return true;
			default:
				return false;	
			}

	}

	@Override
	public void process(Country country, long rppUserId, Object data) {
		
		//validate jumio response response if all is ok continue
		if(selfieRequirement.validate(data, country)) {
			//find before in database if is required
			renapoRequirement.execute(country, rppUserId, data);
		}
		
	}


}
