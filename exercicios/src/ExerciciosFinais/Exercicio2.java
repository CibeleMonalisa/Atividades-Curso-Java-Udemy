package ExerciciosFinais;
//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe uma temperatura em Celcius: ");
		double tempC = entrada.nextDouble();
		double resultF = tempC * 1.8 + 32;
		
		System.out.printf("%.2f graus Celcius = %.2f graus Fahrenheit", tempC, resultF);
		
		entrada.close();

	}

}
