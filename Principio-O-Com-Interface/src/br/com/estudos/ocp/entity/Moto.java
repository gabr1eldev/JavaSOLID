package br.com.estudos.ocp.entity;

import br.com.estudos.ocp.utility.InterMoto;

public class Moto implements InterMoto {
	
	private String cor;
	private String ano;
	private double motor;
	private String tipoDeFreio;
	
	

	public Moto(String cor, String ano, double motor, String tipoDeFreio) {
		montarMoto(cor, ano, motor, tipoDeFreio);
		
	}

	@Override
	public void montarMoto(String cor, String ano, double motor, String tipoDeFreio) {
		this.cor = cor;
		this.ano = ano;
		this.motor = motor;
		this.tipoDeFreio = tipoDeFreio;
		
		toString();
		ligarMotor();
	}
	
	

	@Override
	public String toString() {
		return "Moto [cor=" + cor + ", ano=" + ano + ", motor=" + motor + ", tipoDeFreio=" + tipoDeFreio + "]";
	}

	@Override
	public void ligarMotor() {
		System.out.println("Ligando o motor com Interface");
		
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

	public String getTipoDeFreio() {
		return tipoDeFreio;
	}

	public void setTipoDeFreio(String tipoDeFreio) {
		this.tipoDeFreio = tipoDeFreio;
	}
	
	

}
