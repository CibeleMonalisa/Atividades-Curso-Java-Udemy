package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		//AND
		System.out.println(condicao1 && condicao2);
		
		//OR
		System.out.println(condicao1 || condicao2);
		
		//XOR
		System.out.println(condicao1 ^ condicao2);
		
		//NEGAÇÃO
		System.out.println(condicao1 && !condicao2);
		System.out.println(!condicao1);
		System.out.println(!condicao1);
		System.out.println(!condicao2);
		
		System.out.println("-------------TABELA VERDADE AND (E)-----------------------");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		
		System.out.println("-------------TABELA VERDADE OR (OU)-----------------------");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("-------------TABELA VERDADE XOR (OU EXCLUSIVO)-----------------------");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^  true);
		System.out.println(false ^	 false);
		
		
	}
	
	

}
