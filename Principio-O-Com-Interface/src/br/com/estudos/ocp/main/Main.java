package br.com.estudos.ocp.main;

import javax.swing.JOptionPane;

import br.com.estudos.ocp.entity.Carro;
import br.com.estudos.ocp.entity.Moto;
import br.com.estudos.ocp.utility.TipoDeVeiculo;

public class Main {
	private static TipoDeVeiculo tpVeiculo;

	public static void main(String[] args) {
		String veiculo = JOptionPane.showInputDialog("Escolha entre Moto e Carro");
		String ano = JOptionPane.showInputDialog("qual o Ano");
		String cor = JOptionPane.showInputDialog("Escolha a Cor");

		tpVeiculo = TipoDeVeiculo.valueOf(veiculo.toUpperCase());

		if (tpVeiculo == TipoDeVeiculo.CARRO) {
			String motorCarro = JOptionPane.showInputDialog("Quantos Cavalos");
			String portas = JOptionPane.showInputDialog("Quantas Portas");
			new Carro(cor, ano, Double.parseDouble(motorCarro), Integer.parseInt(portas));

		} else if (tpVeiculo == TipoDeVeiculo.MOTO) {
			String freio = JOptionPane.showInputDialog("Qual o tipo de Freio");
			String motorMoto = JOptionPane.showInputDialog("Quantas cilindradas");
			new Moto(cor, ano, Double.parseDouble(motorMoto), freio);

		}

	}

}
