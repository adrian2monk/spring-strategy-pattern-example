package com.gp.requirements;

import com.gp.model.Country;
import com.gp.model.Data;
import com.gp.model.RequirementType;

public interface Requirement {

    RequirementType kind();
    void execute(Country country,long rppUserId,Object data);
    boolean validate(Object input,Country country);
    boolean required(Country country);
    boolean done(Country country,long userId);
}
