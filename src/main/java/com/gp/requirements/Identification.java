package com.gp.requirements;

import com.gp.model.Country;
import com.gp.model.Data;
import com.gp.model.RequirementType;

public class Identification implements Requirement {
    @Override
    public RequirementType kind() {
        return RequirementType.ID;
    }

    @Override
    public void execute(Country country) {

    }

    @Override
    public boolean validate(Data input) {
        return false;
    }

    @Override
    public boolean required(Country country) {
        return false;
    }

    @Override
    public boolean done(Country country) {
        return false;
    }
}
