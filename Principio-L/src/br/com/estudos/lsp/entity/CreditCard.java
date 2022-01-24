package br.com.estudos.lsp.entity;

public class CreditCard extends CartaoNubank {
	
	@Override
	public void validarCartao() throws Exception {

		//Apenas como exemplo
		System.out.println("Validando Limite");
		System.out.println("Limite Ok");
	}

}
