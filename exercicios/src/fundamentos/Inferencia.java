package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		//quando declaro assim, o java detecta automaticamente o tipo da vari�vel pelo valor que coloquei
		var b = 2.3;
		var c = "texto";
		System.out.println(c);
		System.out.println(b);
		//se o tipo do conte�do da vari�vel mudar, o java n�o permitir� a mudan�a:
		//exemplo:
		// c = 4.5;
	}
}
