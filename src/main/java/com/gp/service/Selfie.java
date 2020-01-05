package com.gp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.gp.model.Country;
import com.gp.repository.DataRepository;
import com.gp.strategies.Strategy;
import com.gp.strategies.StrategyFactory;

public class Selfie {
	
	private final StrategyFactory strategyFactory;
	
	@Autowired
    public Selfie(StrategyFactory strategyFactory) {
       
        this.strategyFactory = strategyFactory;
    }
	
	public void selfieResponse(Country country,long rppUserId,Object data) {
		
		Strategy strategy = strategyFactory.getStrategy(country);
      	strategy.process(country, rppUserId, data);
		
    }
}
