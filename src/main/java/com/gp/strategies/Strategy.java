package com.gp.strategies;

import com.gp.model.Country;
import com.gp.model.Data;

public interface Strategy {

    boolean run(Country country, long rppUserId,Object data,String operation);

    void process(Country country, long rppUserId,Object data);

	String[] checklist(Country country, Long userId, String transaction);
}
