package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		String s = "Bom dia";
		//toUpperCase converte a string para letra maiuscula
		s = s.toUpperCase();
		System.out.println(s);
		
		String a = "olá fulana";
		
		a = a.replace("fulana", "Maria");
		System.out.println(a);
		
		//concatenar uma string a outra
		a = a.concat(" !!!sz");
		System.out.println(a);
		
		//também posso usar as funçoes direto no print:
		System.out.println("eu te amo".toUpperCase());
		//ou
		String x = "eu te amo".concat(" muito");
		System.out.println(x);
		
		//usando a função replace (posso quebrar a linha antes do ponto e adcionar funções)
		String k = "você é fofo"
				.replace("fofo", " um idiota")
		        .concat(" !!!")
		        .toUpperCase();
		System.out.println(k);
		// ou
		//String k = "você é fofo".replace("fofo", " um idiota").concat(" !!!").toUpperCase();
		
		//saber o tamanho de uma string:
		String w = "abacaxi";
		int i = w.length();
		System.out.println(i);
	
		
	}

}
