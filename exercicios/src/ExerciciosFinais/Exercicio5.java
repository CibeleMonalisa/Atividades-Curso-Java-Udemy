package ExerciciosFinais;
//Criar um programa que leia o valor da base e da altura de um tri�ngulo e calcule a �rea.

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a base: ");
		double base = entrada.nextDouble();
		
		System.out.print("Informe a altura: ");
		double altura = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.println("A �rea do tri�ngulo �:" + area + " cm�");
		
		entrada.close();

	}

}
