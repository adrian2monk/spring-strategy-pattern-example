package com.gp.strategies;

import com.gp.model.CountryType;
import com.gp.model.Data;

public interface Strategy {

    String[] checklist(CountryType country, Long userId);

    void run(Data user);
    void process(Data user);
}
