package br.com.maxigenios.website.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maxigenios.website.api.domain.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	Empresa findByCnpj(String cnpj);
	

}
