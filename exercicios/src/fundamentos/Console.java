package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.printf("Valores megasena: %d %d %d %d", 1, 2, 3, 4);
		System.out.println("linha com quebra de linha");
		System.out.print("linha sem quebra de linha");
		System.out.print("linha sem quebra de linha");
		System.out.print("\nlinha com quebra de linha induzida");
		
		//capturar informações 
		Scanner entrada = new Scanner (System.in);
		System.out.println("\nInforme seu nome:");
		String nome = entrada.nextLine();
		System.out.println("Informe seu sobrenome:");
		String sobrenome = entrada.nextLine();
		System.out.println("Informe sua idade:");
		int idade = entrada.nextInt();
		
		System.out.println("Nome:" + nome + " " + sobrenome + "\nIdade:" + idade);
		
		//para fechar o scanner:
		entrada.close();

	}

}
