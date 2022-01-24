package br.com.estudos.dip;

import br.com.estudos.dip.payment.Payment;

public class Main {

	public static void main(String[] args) {
		
		Payment payment = new Payment();
		payment.pay("500");

	}

}
