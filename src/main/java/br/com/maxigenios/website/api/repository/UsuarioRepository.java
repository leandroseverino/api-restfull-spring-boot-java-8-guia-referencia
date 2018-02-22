package br.com.maxigenios.website.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maxigenios.website.api.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Usuario findByEmail(String email);
	

}
