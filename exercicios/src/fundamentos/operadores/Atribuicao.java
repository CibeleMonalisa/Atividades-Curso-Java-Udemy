package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 2;
	 	c += 1;  //c = c + 1; incremento
	 	c -= 1;  //c = c - 1; drecremento 
	 	c *= 1;  //c = c * 1; multiplica��o
	 	c /= 1;  //c = c / 1; divis�o
	 	c %= 1;  //c = c % 1; m�dulo 
	 	
	 	//operadores un�rios
	 	a++; //a = a + 1;
	 	a--; //a = a - 1;
	 	
	 	++b; //b = b + 1;
	 	--b; //b = b - 1; 
	 	
	 	System.out.println(a);
	 	System.out.println(c);
	 	System.out.println(++a == b--);
	 	
	 	
	 	
	 	
				

	}

}
