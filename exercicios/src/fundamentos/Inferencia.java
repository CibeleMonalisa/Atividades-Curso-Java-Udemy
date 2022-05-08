package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		//quando declaro assim, o java detecta automaticamente o tipo da variável pelo valor que coloquei
		var b = 2.3;
		var c = "texto";
		System.out.println(c);
		System.out.println(b);
		//se o tipo do conteúdo da variável mudar, o java não permitirá a mudança:
		//exemplo:
		// c = 4.5;
	}
}
