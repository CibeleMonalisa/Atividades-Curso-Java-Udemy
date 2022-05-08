//código que recebe 3 salários em formato string (podendo-se usar vírgula ou ponto)
//e retorna a média
package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe o primeiro salário: ");
		String s1 = entrada.nextLine();
		
		System.out.print("Informe o segundo salário: ");
		String s2 = entrada.nextLine();
		
		System.out.print("Informe o terceiro salário: ");
		String s3 = entrada.nextLine();
		
		double c1 = Double.parseDouble(s1.replace(",", "."));
		double c2 = Double.parseDouble(s2.replace(",", "."));
		double c3 = Double.parseDouble(s3.replace(",", "."));
		
		System.out.println("A média salarial é:" + (c1 + c2+ c3)/3);
		
		entrada.close();
	}
}
