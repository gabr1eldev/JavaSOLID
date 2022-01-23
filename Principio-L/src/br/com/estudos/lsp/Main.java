package br.com.estudos.lsp;

import br.com.estudos.lsp.entity.CreditCard;

public class Main {

	public static void main(String[] args) throws Exception {
		CreditCard card = new CreditCard();
		
		card.validarCartao();
		card.coletarPagamento();

	}

}
