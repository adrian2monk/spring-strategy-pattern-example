package com.gp.strategies;

import com.gp.model.CountryType;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;

@Component
public class StrategyFactory {

    private Map<CountryType, Strategy> strategies = new EnumMap<>(CountryType.class);

    public StrategyFactory() {
        initStrategies();
    }

    public Strategy getStrategy(CountryType country) {
        if (country == null || !strategies.containsKey(country)) {
            // Fallback default to MX
            return strategies.get(CountryType.MX);
        }
        return strategies.get(country);
    }

    private void initStrategies() {
        strategies.put(CountryType.MX, new StrategySingle());
        strategies.put(CountryType.PE, new StrategySingle());
    }

}
