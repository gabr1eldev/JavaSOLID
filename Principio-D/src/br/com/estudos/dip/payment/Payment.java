package br.com.estudos.dip.payment;

import br.com.estudos.dip.entity.MySQLProduct;

public class Payment {
	
	//aqui s� como exemplo,� uma class de alto n�vel chamando uma class de baixo n�vel,para fazer a consulta
	
	
	
	public void pay(String productId) {
		MySQLProduct dbProduct = new MySQLProduct();
		String product = dbProduct.getProductById(productId);
		System.out.println(product);
	}

}
