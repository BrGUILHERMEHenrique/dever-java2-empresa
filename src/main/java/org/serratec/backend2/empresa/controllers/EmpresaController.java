package org.serratec.backend2.empresa.controllers;

import java.util.List;

import org.serratec.backend2.empresa.domain.Empresa;
import org.serratec.backend2.empresa.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/empresa"})
public class EmpresaController {
	
	@Autowired
	private EmpresaService empresaService;
	
	@GetMapping
	public List<Empresa> listarEmpresas(){
		return empresaService.listarEmpresas();
	}
	
	@GetMapping("/{cnpj}")
	public Empresa pegarPorCnpj(@PathVariable String cnpj) {
		return empresaService.pegaPorCnpj(cnpj);
	}
}
