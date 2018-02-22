package br.com.maxigenios.website.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.maxigenios.website.api.domain.Usuario;
import br.com.maxigenios.website.api.security.JwtUserFactory;
import br.com.maxigenios.website.api.service.UsuarioService;

@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsuarioService service;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Usuario> usuario = service.findByEmail(username);
		
		if (usuario.isPresent()) {
			return JwtUserFactory.create(usuario.get());
		}
		
		throw new UsernameNotFoundException("Email not founded.");
	}
}
