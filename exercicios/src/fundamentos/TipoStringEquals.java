package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("string1" == "string1");
		String s1 = new String ("StringTeste");
		System.out.println("StringTeste" == s1); //vai dar falso mesmo o conteudo de s ser igual ao texto
		//para comparar a string pura com o conte�do da vari�vel, usamos .equals:
		System.out.println("StringTeste".equals(s1));
		//equals compara conte�do
		System.out.println("==================================");
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next();
		System.out.println("StringTeste" == s2.trim()); //fun��o trim tira espa�os em branco da entrada
		System.out.println("StringTeste".equals(s2.trim())); //fun��o trim tira espa�os em branco da entrada
		//next tira espa�o em branco, nextline nao
		entrada.close();
		

	}

}
