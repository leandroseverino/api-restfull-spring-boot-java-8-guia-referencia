package br.com.maxigenios.website.api.service;

import java.util.Optional;

import br.com.maxigenios.website.api.domain.Usuario;

public interface UsuarioService {

	Optional<Usuario> findByEmail(String email)	;
	
	
}
