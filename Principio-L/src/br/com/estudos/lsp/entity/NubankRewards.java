package br.com.estudos.lsp.entity;

import br.com.estudos.lsp.utility.Pagamento;

public class NubankRewards implements Pagamento{

	@Override
	public void validarCartao() throws Exception {
		//valida��es
		System.out.println("Limites Ok, Rewards OK!");
		
	}

	@Override
	public void coletarPagamento() {
		
		System.out.println("Pagamento realizado com sucesso!");
		System.out.println("Pontua��o creditada no programa Rewards!");
		
	}

}
