package com.gp.requirements;

import com.gp.model.Country;
import com.gp.model.RequirementType;

public class RenapoRequirement implements Requirement {

	@Override
	public RequirementType kind() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void execute(Country country, long rppUserId, Object data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean validate(Object input, Country country) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean required(Country country) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean done(Country country, long userId) {
		// TODO Auto-generated method stub
		return false;
	}

}
