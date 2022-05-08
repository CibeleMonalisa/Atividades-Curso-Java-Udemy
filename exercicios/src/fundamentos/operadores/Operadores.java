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
		//divis�o de numeros inteiros sempre da numero inteiro (arredondado). 
		//Para dar quebrado � necessario converter com cast:
		System.out.println(a / b);
		System.out.println(a / (double) b);
		
		//operador m�dulo (obter o resto da divis�o)
		System.out.println(a % b);
		
		//POTENCIA��O EM JAVA: (como fazer a elevado a b:) 
		//foi necessario converter o resultado para int
		int resultado = (int) Math.pow(a, b); //aqui representa a^b
		System.out.println(resultado);
		
	}
}
