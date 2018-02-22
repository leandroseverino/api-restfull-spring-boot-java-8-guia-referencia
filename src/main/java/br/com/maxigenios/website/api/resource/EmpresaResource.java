package br.com.maxigenios.website.api.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.maxigenios.website.api.domain.Empresa;
import br.com.maxigenios.website.api.dto.EmpresaDTO;
import br.com.maxigenios.website.api.service.EmpresaService;
import br.com.maxigenios.website.api.util.Response;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaResource {

	@Autowired
	public EmpresaService service;
	
	@GetMapping
	@PreAuthorize("hasAnyRole('ADMIN')")
	public List<Empresa> empresas() {
		//return service.repository.findAll();
		return service.findAll();
	}
	
	@GetMapping(value = "/{cnpj}")
	public Empresa empresas(@PathVariable("cnpj") String cnpj) {
		return service.repository.findByCnpj(cnpj);
	}
	
	@PostMapping
	public ResponseEntity<Response<EmpresaDTO>> cadastrar(@Valid @RequestBody EmpresaDTO empresaDTO, BindingResult result) {
		Response<EmpresaDTO> response = new Response<EmpresaDTO>();
		
		if (result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}
		
		empresaDTO.setId(2L);
		return ResponseEntity.ok(response);
	}
}
