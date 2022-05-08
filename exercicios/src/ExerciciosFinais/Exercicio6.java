package ExerciciosFinais;

import java.util.Scanner;

//Criar um programa que resolve equa��es do segundo grau
//(ax2 + bx + c = 0) utilizando a f�rmula de Bhaskara. 
//Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Equa��o: ax� + bx + c = 0");

		System.out.println("\nDigite o valor de A: ");
		int a = scanner.nextInt();

		System.out.println("\nDigite o valor de B: ");
		int b = scanner.nextInt();

		System.out.println("\nDigite o valor de C: ");
		int c = scanner.nextInt();

		int delta = (b * b) - (4 * a * c);
		
		System.out.println("Valor de delta:" + delta);
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("x1 = " +x1);
		System.out.println("x2 = " +x2);

		scanner.close();

	}

}
