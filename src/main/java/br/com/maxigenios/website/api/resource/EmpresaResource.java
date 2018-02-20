package br.com.maxigenios.website.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maxigenios.website.api.domain.Empresa;
import br.com.maxigenios.website.api.service.EmpresaService;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaResource {

	@Autowired
	public EmpresaService service;
	
	@GetMapping
	public List<Empresa> empresas() {
		return service.repository.findAll();
	}
	
	@GetMapping(value = "/{cnpj}")
	public Empresa empresas(@PathVariable("cnpj") String cnpj) {
		return service.repository.findByCnpj(cnpj);
	}
}
