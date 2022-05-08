package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informações do funcionário
		
		// tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroVoos = 542;
		int  id = 56789;
		// o número long abaixo é 1234845293, porém é possível usar _ para facilitar a leitura
		long pontosAcumulados = 1_234_845_293; 
		long pontoAcumulados = 3234845293L; // o L maiusculo diz que esse numero é um literal long 
		
		//tipos numéricos reais
		float salario = 11445.44F; //devo colocar um F em maiusculo para mostrar que estou escrevendo um literal em Float e não em double
		double vendasAcumuladas = 2991797103.01;
		
		//tipo booleano
		
		boolean ferias = true; //false
		
		//tipo caractere (ele aceita apenas 1 caracter
		char status = 's';
		
		System.out.println(id + ":ganha -> " + salario );
		System.out.println("Status: " + status);
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numeroVoos/2);
		System.out.println(pontosAcumulados);
		System.out.println(pontoAcumulados/vendasAcumuladas);
		System.out.println("Está de férias?" + ferias);
	}
	
}
