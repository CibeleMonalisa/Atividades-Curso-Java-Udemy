package ExerciciosFinais;

import java.util.Scanner;

//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número: ");
		double n1 = entrada.nextDouble();
		
		double quadrado = Math.pow(n1, 2);
		
		double cubo = Math.pow(n1, 3);
		
		System.out.print("O valor ao quadrado é: " + quadrado + "\n O valor ao cubo é: " + cubo);
		
		entrada.close();
		
	}
}
