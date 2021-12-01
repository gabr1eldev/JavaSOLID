package br.com.estudos.ocp.entity;

public class Moto extends Veiculo{
	private String tipoDeFreio;

	public Moto(String cor, String ano, double motor,String tipoDeFreio) {
		super(cor, ano, motor);
		this.tipoDeFreio = tipoDeFreio;
	}

	public String getTipoDeFreio() {
		return tipoDeFreio;
	}

	public void setTipoDeFreio(String tipoDeFreio) {
		this.tipoDeFreio = tipoDeFreio;
	}
	
	public void criarMoto() {
		System.out.println("Criando uma Moto Por Herança \n"
				+ "\tipo de Freio= " + tipoDeFreio
				+"\ncor= " + cor 
				+"\nano= " + ano 
				+"\nmotor= " + motor);
		ligarMotor();
	}

}
