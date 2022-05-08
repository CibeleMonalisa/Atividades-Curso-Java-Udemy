package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		Integer n1 = 10000;
		//convertendo o n1 para string para saber quantos caracteres possui
		System.out.println(n1.toString().length());
		
		//outro jeito:
		//convertendo n2 para string a partir de um tipo primitivo:
		//int n2 = 10000;
		int n2 = 10000;
		System.out.println(Integer.toString(n2).length());
		
		//outro jeito (mas não usual) concatenar com string vazia
		System.out.println(("" + n2).length());
		
		//serve para outros tipos de dados primitivos.
		
	}

}
