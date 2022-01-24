package br.com.estudos.lsp;

import br.com.estudos.lsp.entity.CreditCard;
import br.com.estudos.lsp.entity.DebitCard;
import br.com.estudos.lsp.entity.NubankRewards;

public class Main {

	public static void main(String[] args) throws Exception {
		//CreditCard card = new CreditCard();
		//DebitCard card = new DebitCard();
		NubankRewards card = new NubankRewards();
		
		card.validarCartao();
		card.coletarPagamento();

	}

}
