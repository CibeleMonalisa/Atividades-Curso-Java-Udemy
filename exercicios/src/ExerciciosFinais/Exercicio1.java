package ExerciciosFinais;

import java.util.Scanner;

//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe uma temperatura em Fahrenheit: ");
		double tempF = entrada.nextDouble();
		double resultC = (tempF - 32) / 1.8;
		
		System.out.printf("%.2f graus Fahrenheit = %.2f graus celcius", tempF, resultC);
		
		entrada.close();
		
	}
}
