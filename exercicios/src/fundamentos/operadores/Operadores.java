package fundamentos.operadores;

public class Operadores {
	public static void main(String[] args) {
		var x = 34.56;
		var y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		//divisão de numeros inteiros sempre da numero inteiro (arredondado). 
		//Para dar quebrado é necessario converter com cast:
		System.out.println(a / b);
		System.out.println(a / (double) b);
		
		//operador módulo (obter o resto da divisão)
		System.out.println(a % b);
		
		//POTENCIAÇÃO EM JAVA: (como fazer a elevado a b:) 
		//foi necessario converter o resultado para int
		int resultado = (int) Math.pow(a, b); //aqui representa a^b
		System.out.println(resultado);
		
	}
}
