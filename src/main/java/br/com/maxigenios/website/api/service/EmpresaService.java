package br.com.maxigenios.website.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.maxigenios.website.api.repository.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	public EmpresaRepository repository;	
	
	
}
