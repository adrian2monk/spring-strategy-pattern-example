package com.gp.service;

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

    public Data get(long userId) {
        return repository.findById(userId).orElse(null);
    }

    public List<Data> list() {
        Iterable<Data> users = repository.findAll();
        List<Data> list = new ArrayList<>();
        users.forEach(list::add);
        return list;
    }

    public Data create(Data user) {
        Strategy strategy = strategyFactory.getStrategy(Document.NORMAL);
        strategy.changeLimit(user);
        return repository.save(user);
    }


    public Data changeType(long id, Document type) {
        Strategy strategy = strategyFactory.getStrategy(type);
        Data user = repository.findById(id).orElse(null);
        strategy.changeLimit(user);
        return repository.save(user);
    }

}
