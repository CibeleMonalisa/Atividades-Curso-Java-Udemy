package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		//mostrar para o usu�rio usando caixa de di�logo
		String v1 = JOptionPane.showInputDialog("Digite o primeiro n�mero:");
		String v2 = JOptionPane.showInputDialog("Digite o segundo n�mero:");
		
		System.out.println(v1 + v2);
		
		double n1 = Double.parseDouble(v1);
		double n2 = Double.parseDouble(v2);
		
		double soma = n1 + n2;
		System.out.println("A soma �:" + soma);
		System.out.println("A m�dia �:" + soma/2);
		
		//Para se obter precis�o absoluta nos resultados, o Bigdecimal tras essa op��o
		
	}
}
