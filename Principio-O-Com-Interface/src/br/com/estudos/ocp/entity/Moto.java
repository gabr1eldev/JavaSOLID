package br.com.estudos.ocp.entity;

import br.com.estudos.ocp.utility.InterMoto;

public class Moto implements InterMoto {

	@Override
	public void montarMoto(String cor, String ano, double motor, String tipoDeFreio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ligarMotor() {
		System.out.println("Ligando o motor com Interface");
		
	}

}
