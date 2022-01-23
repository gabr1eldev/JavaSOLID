package br.com.estudos.lsp.entity;

public class DebitCard extends CartaoNubank {
	
	@Override
	public void validarCartao() throws Exception {
		
		System.out.println("Verificando Saldo");
		System.out.println("Saldo disponível");
	}

}
