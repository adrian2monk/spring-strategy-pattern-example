package com.gp.requirements;

import java.util.Optional;

import com.gp.model.Country;
import com.gp.model.Data;
import com.gp.model.RequirementType;

public class TermsOfUseRequirement implements Requirement {

	@Override
	public RequirementType kind() {
		return RequirementType.TERMS_OF_USE;
	}

	@Override
	public void execute(Country country) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean validate(Data input) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean required(Country country) {
				
		return true;
	}

	@Override
	public boolean done(Country country, long userId) {
		//consultar a tabla kyc para cjhecar si ya est�
//		Optional<com.gp.model.Identification> user = dataIdentification.findByIdAndCountry(userId,country);
//    	if(user.isPresent()) {
//
//        	return true;
//    	}
    	return false;
	}

}
