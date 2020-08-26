package org.serratec.backend2.empresa.services;

import java.util.ArrayList;
import java.util.List;

import org.serratec.backend2.empresa.domain.Empresa;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {
	List<Empresa> empresas;
	public EmpresaService() {
		empresas = new ArrayList<Empresa>();
		empresas.add(new Empresa("PetShop do Clóvis", "PetShop império", "9090"));
		empresas.add(new Empresa("Pizzaria das piriquetes", "Pizzaria top", "7070"));
	}
	
	public List<Empresa> listarEmpresas(){
		return empresas;
	}
	
	public Empresa pegaPorCnpj(String cnpj) {
		for(Empresa empresa: empresas) {
			if(cnpj.equals(empresa.getCnpj())) {
				return empresa;
			}
		}
		return null;
	}
	
}
