package com.gp.strategies;


import com.gp.model.Data;
import com.gp.model.Country;
import com.gp.model.Document;
import com.gp.requirements.IdentificationRequirement;
import com.gp.requirements.Requirement;

import java.util.*;

public class Simple implements Strategy {

    private List<Requirement> requirements = new LinkedList<>();
    private Map<Document, Requirement> checks = new EnumMap<>(Document.class);
    
    public Simple() {
    	this.requirements.add(new IdentificationRequirement());
	}
    
    @Override
    public String[] checklist(Country country, Long userId) {
        Queue<String> list = new LinkedList<>();
        requirements.forEach(requirement -> {
            if (requirement.required(country) && !requirement.done(country,userId)) {
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
