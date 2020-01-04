package com.gp.strategies;

import com.gp.model.Country;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;

@Component
public class StrategyFactory {

    private Map<Country, Strategy> strategies = new EnumMap<>(Country.class);

    public StrategyFactory() {
        initStrategies();
    }

    public Strategy getStrategy(Country country) {
        if (country == null || !strategies.containsKey(country)) {
            // Fallback default to MX
            return strategies.get(Country.MX);
        }
        
        // consultar qu� servicios son requeridos para pa�s
        
        return strategies.get(country);
    }

    private void initStrategies() {
        strategies.put(Country.MX, new Simple());
        strategies.put(Country.PE, new Simple());
    }

}
