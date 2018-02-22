package br.com.maxigenios.website.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maxigenios.website.api.domain.Usuario;
import br.com.maxigenios.website.api.repository.UsuarioRepository;
import br.com.maxigenios.website.api.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public Optional<Usuario> findByEmail(String email) {
		return Optional.ofNullable(this.repository.findByEmail(email));
	}
}
