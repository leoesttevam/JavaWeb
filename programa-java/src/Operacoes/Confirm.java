package Operacoes;

import javax.swing.JOptionPane;

public class Confirm {

	public static void main(String[] args) {
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");
		
		double car = Double.parseDouble(carros);
		double person = Double.parseDouble(pessoas);
		
		int divisao = (int) (car / person);
		
		double resto = car % person;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o?");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisao para pessoas deu " + divisao);
		}else {
			System.out.println("N�o quis ver o resultado");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divis�o?");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divis�o " + resto);
		}else {
			System.out.println("N�o quis ver o resultado");
		}
		
	}
		
		
}
