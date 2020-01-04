package com.gp.requirements;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.gp.model.Country;
import com.gp.model.Data;
import com.gp.model.RequirementType;
import com.gp.repository.DataIdentification;

public class IdentificationRequirement implements Requirement {
	
	@Autowired
	DataIdentification dataIdentification;
	
    @Override
    public RequirementType kind() {
        return RequirementType.ID;
    }

    @Override
    public void execute(Country country) {
    	//Pass the scan reference to jumio-ms
    }

    @Override
    public boolean validate(Data input) {
    	//validate the execute conection
        return false;
    }

    @Override
    public boolean required(Country country) {
    
    	if (Country.MX==country) {
    		return true;
		}
    	return false;
    }

    @Override
    public boolean done(Country country,long userId) {
    	
    	Optional<com.gp.model.Identification> user = dataIdentification.findByIdAndCountry(userId,country);
    	if(user.isPresent()) {

        	return true;
    	}
    	return false;
    }
}
