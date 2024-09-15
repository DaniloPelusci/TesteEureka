package br.com.portfoliopelusci.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portfoliopelusci.model.Cargo;
import br.com.portfoliopelusci.service.CargoServices;

@RestController
@RequestMapping("/api/cargo/v1")
public class CargoController {
	
	@Autowired
	private CargoServices service;
	
	@GetMapping
	public List<Cargo> findAll() {
		return service.findAll();
	}
	
	@PostMapping(path = "/create")
	public Cargo create(@RequestBody Cargo cargo) {
		return service.create(cargo);
	}
	
	

}
