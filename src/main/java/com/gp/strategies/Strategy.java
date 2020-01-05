package com.gp.strategies;

import com.gp.model.Country;
import com.gp.model.Data;

public interface Strategy {

    String[] checklist(Country country, Long userId);

    boolean run(Country country, long rppUserId,Object data,String operation);
    void process(Data user);
}
