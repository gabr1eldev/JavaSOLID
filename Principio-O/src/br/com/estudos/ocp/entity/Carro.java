package br.com.estudos.ocp.entity;

public class Carro extends Veiculo{
	private Integer assentos;
	public Carro(String cor, String ano, double motor,Integer assentos) {
		super(cor, ano, motor);
		this.assentos = assentos;
	}
	public Integer getAssentos() {
		return assentos;
	}
	public void setAssentos(Integer assentos) {
		this.assentos = assentos;
	}
	
	public void criarCarro() {
		System.out.println("Criando um carro Por Herança "
				+ "\nassentos= " + assentos 
				+"\ncor= " + cor 
				+"\nano= " + ano 
				+"\nmotor= " + motor);
	}

	
}
