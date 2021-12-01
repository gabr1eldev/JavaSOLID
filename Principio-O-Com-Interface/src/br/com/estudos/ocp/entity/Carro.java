package br.com.estudos.ocp.entity;

import br.com.estudos.ocp.utility.InterCarro;

public class Carro implements InterCarro{
	
	private String cor;
	private String ano;
	private double motor;
	private Integer assentos;
	
	public Carro() {}

	public Carro(String cor, String ano, double motor, Integer assentos) {
		montarCarro(cor, ano, motor, assentos);
	}

	@Override
	public void montarCarro(String cor, String ano, double motor, Integer assentos) {
		this.cor = cor;
		this.ano = ano;
		this.motor = motor;
		this.assentos = assentos;
		
		exibindoCarro();
		ligarMotor();
		
	}
	

	
	public void exibindoCarro() {
		System.out.println( "Criando o Carro com Interface\n[cor=" + cor + ", ano=" + ano + ", motor=" + motor + ", assentos=" + assentos + "]");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	public Integer getAssentos() {
		return assentos;
	}

	public void setAssentos(Integer assentos) {
		this.assentos = assentos;
	}

	@Override
	public void ligarMotor() {
		System.out.println("Ligando o carro via Interface");
		
	}

}
