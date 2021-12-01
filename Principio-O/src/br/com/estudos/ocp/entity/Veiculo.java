package br.com.estudos.ocp.entity;

abstract public class Veiculo {
	
	protected String cor;
	protected String ano;
	protected double motor;
	
	public Veiculo(String cor, String ano, double motor) {
		this.cor = cor;
		this.ano = ano;
		this.motor = motor;
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
	
	

}
