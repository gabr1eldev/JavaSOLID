package br.com.estudos.ocp.entity;

import br.com.estudos.ocp.utility.InterCarro;

public class Carro implements InterCarro{

	@Override
	public void montarCarro(String cor, String ano, double motor, Integer assentos) {
		
		
	}

	@Override
	public void ligarMotor() {
		System.out.println("Ligando o carro via Interface");
		
	}

}
