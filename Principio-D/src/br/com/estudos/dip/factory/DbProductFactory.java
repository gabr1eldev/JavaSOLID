package br.com.estudos.dip.factory;

import br.com.estudos.dip.entity.MongoDBProduct;
import br.com.estudos.dip.entity.MySQLProduct;
import br.com.estudos.dip.utility.Db;
import br.com.estudos.dip.utility.IDbProduct;

public class DbProductFactory {
	
	public static IDbProduct create(Db type) {
		if (type == Db.MYSQL) {
			return new MySQLProduct();
		} else {
			return new MongoDBProduct();
		}
	}

}
