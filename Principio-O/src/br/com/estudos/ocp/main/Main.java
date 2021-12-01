package br.com.estudos.ocp.main;

import javax.swing.JOptionPane;

import br.com.estudos.ocp.utility.TipoDeVeiculo;

public class Main {
	private static TipoDeVeiculo tpVeiculo;
	public static void main(String[] args) {
		String veiculo = JOptionPane.showInputDialog("Escolha entre Moto e Carro");
		String ano = JOptionPane.showInputDialog("qual o Ano");				
		String cor = JOptionPane.showInputDialog("Escolha a Cor");
		String motorCarro = JOptionPane.showInputDialog("Quantos Cavalos");
		String portas = JOptionPane.showInputDialog("Quantas Portas");
		String freio = JOptionPane.showInputDialog("Qual o tipo de Freio");
		String motorMoto = JOptionPane.showInputDialog("Quantas cilindradas");
		
		tpVeiculo = TipoDeVeiculo.valueOf(veiculo);
		

	}

}
