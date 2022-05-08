package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		double media = 7.6;
		//se a media for maior que 7, escreve aprovado, senao recupera��o
		String resultParcial = media<= 5.0 ? "Reprovado" : "Em recupera��o";
		System.out.println(resultParcial);
		String resultadoFinal = media >= 7.0 ? "Aprovado" : "Recupera��o";
		System.out.println(resultadoFinal);
		
		//ou uma expressao dentro da outra
		System.out.println("-----------------");
		String resultadoFinal2 = media >= 7.0 ? "Aprovado" :  media<= 5.0 ? "Reprovado" : "Em recupera��o";
		System.out.println(resultadoFinal2);
		

	}

}
