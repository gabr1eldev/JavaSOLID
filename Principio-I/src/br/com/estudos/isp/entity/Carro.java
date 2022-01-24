package br.com.estudos.isp.entity;

import br.com.estudos.isp.utility.Iveiculo;
import br.com.estudos.isp.utility.IveiculoCarro;


public class Carro implements Iveiculo,IveiculoCarro {
	
	private String color;
	private String year;
	private int seats;
	private double engine;
	
	

	public Carro(String color, String year, int seats, double engine) {
		configureCar(color, seats, year, engine);
	}

	@Override
	public void configureCar(String color, int seats, String year, double engine) {
		this.color = color;
		this.seats = seats;
		this.year = year;
		this.engine = engine;
		System.out.println("Criando um carro " + engine + " " + color + " " + year + " " + seats);
		
	}

	@Override
	public void iniciarVeiculo() {
		// TODO Auto-generated method stub
		
	}

}
