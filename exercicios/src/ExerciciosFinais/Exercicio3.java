package ExerciciosFinais;
//Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe seu peso (em kg): ");
		String peso = entrada.next();
		double peso2 = Double.parseDouble(peso.replace(",", "."));
		
		System.out.print("Informe sua altura (em metros): ");
		String altura = entrada.next();
		double altura2 = Double.parseDouble(altura.replace(",", "."));

		//peso / altura elevado a 2
		double imc = peso2 / Math.pow(altura2, 2);;
		System.out.printf("Seu IMC é %.2f", imc);
		
		entrada.close();
		
	}

}
