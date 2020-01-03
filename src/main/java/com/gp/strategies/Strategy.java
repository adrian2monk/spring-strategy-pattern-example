package com.gp.strategies;

import com.gp.model.Country;
import com.gp.model.Data;

public interface Strategy {

    String[] checklist(Country country, Long userId);

    void run(Data user);
    void process(Data user);
}
