package org.serratec.backend2.empresa.domain;

public class Funcionario {
	
	private String nome;
	private String nomeCargo;
	private Cargo cargo;
	private Double salario;
	public Funcionario() {
		super();
	}
	public Funcionario(String nome, String nomeCargo, Cargo cargo, Double salario) {
		super();
		this.nome = nome;
		this.nomeCargo = nomeCargo;
		this.cargo = cargo;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeCargo() {
		return nomeCargo;
	}
	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
}
