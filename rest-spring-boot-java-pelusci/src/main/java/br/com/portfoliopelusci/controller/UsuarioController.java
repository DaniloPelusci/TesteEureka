package br.com.portfoliopelusci.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portfoliopelusci.model.Usuario;
import br.com.portfoliopelusci.service.UsuarioServices;

@RestController
@RequestMapping("/api/usuario/v1")
public class UsuarioController {
	
	@Autowired
	private UsuarioServices service;
	
	@GetMapping
	public List<Usuario> findAll() {
		return service.findAll();
	}
	
	@PostMapping
	public Usuario create(@RequestBody Usuario usuario) {
		return service.create(usuario);
	}
	

}
