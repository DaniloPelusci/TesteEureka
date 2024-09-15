package br.com.portfoliopelusci.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portfoliopelusci.model.Cliente;
import br.com.portfoliopelusci.model.Roteiro;
import br.com.portfoliopelusci.service.ClienteServices;

@RestController
@RequestMapping("/api/cliente/v1")
public class ClienteController {
	
	@Autowired
	private ClienteServices service;
	
	@GetMapping(path = "/{id}")
	public List<Roteiro> findAll(@PathVariable(value = "id") Long id) {
		return service.findById(id).get().getRoteiros();
	}
	
	//@GetMapping
	public List<Cliente> findAll() {
		return service.findAll();
	}
	
	//@PostMapping(path = "/create")
	public Cliente create(@RequestBody Cliente cliente) {
		return service.create(cliente);
	}

}
