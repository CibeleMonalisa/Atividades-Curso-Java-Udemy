package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("string1" == "string1");
		String s1 = new String ("StringTeste");
		System.out.println("StringTeste" == s1); //vai dar falso mesmo o conteudo de s ser igual ao texto
		//para comparar a string pura com o conteúdo da variável, usamos .equals:
		System.out.println("StringTeste".equals(s1));
		//equals compara conteúdo
		System.out.println("==================================");
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next();
		System.out.println("StringTeste" == s2.trim()); //função trim tira espaços em branco da entrada
		System.out.println("StringTeste".equals(s2.trim())); //função trim tira espaços em branco da entrada
		//next tira espaço em branco, nextline nao
		entrada.close();
		

	}

}
