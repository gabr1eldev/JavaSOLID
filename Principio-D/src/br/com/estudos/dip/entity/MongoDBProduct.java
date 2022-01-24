package br.com.estudos.dip.entity;

import br.com.estudos.dip.utility.IDbProduct;

public class MongoDBProduct implements IDbProduct{
	
	public String getProductById(String id) {
		return "MongoDB: Exibindo os dados do produto " + id;
	}

}
