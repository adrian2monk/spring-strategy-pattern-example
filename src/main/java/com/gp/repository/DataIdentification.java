package com.gp.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.gp.model.Country;

public interface DataIdentification extends CrudRepository<com.gp.model.Identification, Long> {

	public Optional<com.gp.model.Identification> findByIdAndCountry(long userId, Country country);

}
