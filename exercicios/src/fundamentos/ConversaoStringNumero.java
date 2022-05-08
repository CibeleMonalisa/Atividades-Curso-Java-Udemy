package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		//mostrar para o usuário usando caixa de diálogo
		String v1 = JOptionPane.showInputDialog("Digite o primeiro número:");
		String v2 = JOptionPane.showInputDialog("Digite o segundo número:");
		
		System.out.println(v1 + v2);
		
		double n1 = Double.parseDouble(v1);
		double n2 = Double.parseDouble(v2);
		
		double soma = n1 + n2;
		System.out.println("A soma é:" + soma);
		System.out.println("A média é:" + soma/2);
		
		//Para se obter precisão absoluta nos resultados, o Bigdecimal tras essa opção
		
	}
}
