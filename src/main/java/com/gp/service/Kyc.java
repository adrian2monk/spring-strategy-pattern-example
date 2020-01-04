package com.gp.service;

import com.gp.model.Country;
import com.gp.model.Data;
import com.gp.model.Document;
import com.gp.repository.DataRepository;
import com.gp.strategies.Strategy;
import com.gp.strategies.StrategyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Kyc {

    private final StrategyFactory strategyFactory;
    private final DataRepository repository;

    @Autowired
    public Kyc(DataRepository repository, StrategyFactory strategyFactory) {
        this.repository = repository;
        this.strategyFactory = strategyFactory;
    }

    public String[] list(Country country,long rppUserId) {
    	
      Strategy strategy = strategyFactory.getStrategy(country);
    	return strategy.checklist(country, rppUserId);
    }
}
