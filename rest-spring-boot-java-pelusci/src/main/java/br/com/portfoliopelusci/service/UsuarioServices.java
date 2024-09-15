package br.com.portfoliopelusci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portfoliopelusci.model.Usuario;
import br.com.portfoliopelusci.repository.UsuarioRepository;

@Service
public class UsuarioServices {
	@Autowired
	UsuarioRepository repository;
	
	public List<Usuario> findAll() {
		
		return repository.findAll();
	}

	public Usuario create(Usuario usuario) {
		
		return repository.save(usuario);
	}
	
	
}
