package com.gp.requirements;

import com.gp.model.Country;
import com.gp.model.Data;
import com.gp.model.RequirementType;

public interface Requirement {

    RequirementType kind();

    void execute(Country country);

    boolean validate(Data input);
    boolean required(Country country);
    boolean done(Country country,long userId);
}
