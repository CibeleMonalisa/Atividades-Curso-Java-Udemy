//c�digo que recebe 3 sal�rios em formato string (podendo-se usar v�rgula ou ponto)
//e retorna a m�dia
package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe o primeiro sal�rio: ");
		String s1 = entrada.nextLine();
		
		System.out.print("Informe o segundo sal�rio: ");
		String s2 = entrada.nextLine();
		
		System.out.print("Informe o terceiro sal�rio: ");
		String s3 = entrada.nextLine();
		
		double c1 = Double.parseDouble(s1.replace(",", "."));
		double c2 = Double.parseDouble(s2.replace(",", "."));
		double c3 = Double.parseDouble(s3.replace(",", "."));
		
		System.out.println("A m�dia salarial �:" + (c1 + c2+ c3)/3);
		
		entrada.close();
	}
}
