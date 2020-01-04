package com.gp.strategies;

import com.gp.model.Country;
import com.gp.model.Data;

public interface Strategy {

    void run(Data user);
    void process(Data user);

	String[] checklist(Country country, Long userId, String transaction);
}
