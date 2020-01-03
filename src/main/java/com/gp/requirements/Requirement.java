package com.gp.requirements;

import com.gp.model.Country;
import com.gp.model.Data;

public interface Requirement {

    com.gp.model.Requirement kind();

    void execute(Country country);

    boolean validate(Data input);
    boolean required(Country country);
    boolean done(Country country);
}
