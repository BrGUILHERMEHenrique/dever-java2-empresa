package org.serratec.backend2.empresa.domain;

public enum Cargo {
	PRESIDENTE(100000.00), DIRETOR(60000.00), GERENTE(30000.00);
	
	private Double salario;

	private Cargo(Double salario) {
		this.salario = salario;
	}
	
}
