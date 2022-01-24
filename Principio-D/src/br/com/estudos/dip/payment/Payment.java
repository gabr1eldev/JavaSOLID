package br.com.estudos.dip.payment;

import br.com.estudos.dip.entity.MySQLProduct;
import br.com.estudos.dip.factory.DbProductFactory;
import br.com.estudos.dip.utility.Db;
import br.com.estudos.dip.utility.IDbProduct;

public class Payment {
	
	//aqui só como exemplo,é uma class de alto nível chamando uma class de baixo nível,para fazer a consulta
	
	
	
	public void pay(String productId) {
		//MySQLProduct dbProduct = new MySQLProduct();
		IDbProduct dbProduct = DbProductFactory.create(Db.MYSQL);
		String product = dbProduct.getProductById(productId);
		System.out.println(product);
	}

}
