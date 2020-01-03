package com.gp.strategies;


import com.gp.model.Data;
import com.gp.model.CountryType;
import com.gp.model.DocumentType;

import java.util.*;

public class StrategySingle implements Strategy {

    private List<Requirement> requirements = new LinkedList<>();
    private Map<DocumentType, Requirement> checks = new EnumMap<>(DocumentType.class);

    @Override
    public String[] checklist(CountryType country, Long userId) {
        Queue<String> list = new LinkedList<>();
        requirements.forEach(requirement -> {
            if (requirement.required(country) && !requirement.done(country)) {
                list.add(requirement.kind().name());
            }
        });
        return list.toArray(new String[list.size()]);
    }

    @Override
    public void run(Data user) {

    }

    @Override
    public void process(Data user) {

    }

}
