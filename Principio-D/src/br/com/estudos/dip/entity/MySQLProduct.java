package br.com.estudos.dip.entity;

import br.com.estudos.dip.utility.IDbProduct;

public class MySQLProduct implements IDbProduct{
	
	//apenas como exemplo,essa seria uma class de baixo n�vel
	
	public String getProductById(String id) {
		return "MSQL: Exibindo os dados do produto " + id;
	}

}
