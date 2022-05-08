//calculadora simples usando apenas operadores
package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o primeiro número");
		double n1 = entrada.nextInt(); 
		System.out.println("Informe a operação (+ - * /)");
		String op = entrada.next();
		System.out.println("Informe o segundo número");
		double n2 = entrada.nextInt();
		
		System.out.printf("%.2f %s %.2f = ? \n", n1, op, n2);
		
		double resultado = "+".equals(op) ? n1 + n2 : 0; 
		resultado = "-".equals(op) ? n1 - n2 : resultado;
		resultado = "*".equals(op) ? n1 * n2 : resultado;
		resultado = "/".equals(op) ? n1 / n2 : resultado;
				
		System.out.printf("%.2f %s %.2f = %.2f", n1, op, n2, resultado);
		
		entrada.close();

	}

}
