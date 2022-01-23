package br.com.estudos.lsp;

import br.com.estudos.lsp.entity.CreditCard;
import br.com.estudos.lsp.entity.DebitCard;

public class Main {

	public static void main(String[] args) throws Exception {
		//CreditCard card = new CreditCard();
		DebitCard card = new DebitCard();
		
		card.validarCartao();
		card.coletarPagamento();

	}

}
