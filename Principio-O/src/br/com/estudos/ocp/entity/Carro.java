package br.com.estudos.ocp.entity;

public class Carro extends Veiculo{
	private Integer assentos;
	public Carro(String cor, String ano, double motor) {
		super(cor, ano, motor);
		
	}
	public Integer getAssentos() {
		return assentos;
	}
	public void setAssentos(Integer assentos) {
		this.assentos = assentos;
	}

	
}
