package br.com.portfoliopelusci.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portfoliopelusci.model.Cargo;
import br.com.portfoliopelusci.service.CargoServices;

@RestController
@RequestMapping("/api/cooperfilme/v1")
public class CooperFilmeController {
	
	@Autowired
	private CargoServices service;
	
	@GetMapping
	public List<Cargo> findAll() {
		return service.findAll();
	}
	
	

}
