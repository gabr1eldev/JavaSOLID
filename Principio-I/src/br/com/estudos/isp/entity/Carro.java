package br.com.estudos.isp.entity;

import br.com.estudos.isp.utility.Iveiculo;


public class Carro implements Iveiculo {
	
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
		System.out.println("Criando um carro" + engine + " " + color + " " + year + " " + seats);
		
	}

	@Override
	public void configureMoto(String color, String year, double engine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarVeiculo() {
		// TODO Auto-generated method stub
		
	}

}
