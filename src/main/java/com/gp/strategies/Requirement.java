package com.gp.strategies;

import com.gp.model.CountryType;
import com.gp.model.Data;
import com.gp.model.RequirementType;

public interface Requirement {

    RequirementType kind();

    void execute(CountryType country);

    boolean validate(Data input);
    boolean required(CountryType country);
    boolean done(CountryType country);
}
