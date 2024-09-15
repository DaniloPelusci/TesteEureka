package br.com.portfoliopelusci.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portfoliopelusci.model.Cargo;
import br.com.portfoliopelusci.repository.CargoRepository;

@Service
public class CargoServices {
	@Autowired
	CargoRepository repository;
	
	public List<Cargo> findAll() {
		
		return repository.findAll();
	}

	public Optional<Cargo> findById(Long id) {
		
		return repository.findById(id);
	}
	
	public Cargo create(Cargo cargo) {
		return repository.save(cargo);
	}

	
	
	
}
