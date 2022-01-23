package br.com.estudos.isp;

import br.com.estudos.isp.entity.Carro;
import br.com.estudos.isp.entity.Moto;

public class Main {
	
	private static String type;
	public static void main(String[] args) {
		
		type = "Car";
		if(type == "Car") {
			new Carro("Azul", "1970", 5, 2.0);
		} else {
			new Moto("Preta", "2020", 350);
		}
	}

}
