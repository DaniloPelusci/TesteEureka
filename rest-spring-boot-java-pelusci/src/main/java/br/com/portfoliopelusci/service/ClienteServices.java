package br.com.portfoliopelusci.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portfoliopelusci.model.Cliente;
import br.com.portfoliopelusci.repository.ClienteRepository;

@Service
public class ClienteServices {
	@Autowired
	ClienteRepository repository;
	
	public List<Cliente> findAll() {
		
		return repository.findAll();
	}

	public Optional<Cliente> findById(Long id) {
		Optional<Cliente>cliente = repository.findById(id);
		return cliente;
	}

	public Cliente create(Cliente cliente) {

		return repository.save(cliente);
	}

	
	
}
