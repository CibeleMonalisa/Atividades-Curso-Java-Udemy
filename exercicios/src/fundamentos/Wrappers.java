package fundamentos;

//import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		// Wrappers são a versão objeto dos tipos primitivos.
		//versão orientada a objetos de cada tipo primitivo.

		// Scanner entrada = new Scanner (System.in);

		// byte
		Byte b = 100;
		System.out.println(b.byteValue());

		// short
		Short s = 1000;
		System.out.println(s.toString());

		// integer (convertendo uma string em valor inteiro)
		// Integer.parseInt(entrada.next());
		Integer i = 10000; // int
		System.out.println(i * 3);

		// long (o L serve para indicar que é um long, pois a conversão do literal não é
		// feita automaticamente)
		Long l = 100000L;
		System.out.println(l / 3);
		
		//float (precisa do F no final do numero para converter literal para float.)
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.567;
		System.out.println(d);
		
		//Boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		//System.out.println(bo.toString().toUpperCase());
		
		//outra forma de transformar bo em string:
		//System.out.println("" + bo).toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c.toString());
		System.out.println(c + "...");

	}

}
