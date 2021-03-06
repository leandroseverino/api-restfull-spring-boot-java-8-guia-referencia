package br.com.maxigenios.website.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import br.com.maxigenios.website.api.domain.Empresa;
import br.com.maxigenios.website.api.repository.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	public EmpresaRepository repository;

	@Cacheable("empresaListCache")
	public List<Empresa> findAll() {
		return this.repository.findAll();
	}	
	
	
}
