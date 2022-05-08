package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		
		//charAt vai me dizer qual a letra no �ndice zero (por exemplo) mas poderia ser qualquer outro �ndice
		System.out.println("hello people".charAt(0));
		System.out.println("hello people".charAt(7));
		
		String s = "Boa tarde";
		System.out.println(s.concat(" !!!"));
		System.out.println(s + " !!!");
		
		//coloca a string s em mai�sulo dentro da string S
		String S = s.toUpperCase();
		System.out.println(S);
		
		//verifica se a strig comeca com a palavra "boa". Retorna true ou false.
		//nesse caso, ele considera letras mai�sculas:
		System.out.println(s.startsWith("Boa"));
		//System.out.println(s.startsWith("boa"));
		
		//nesse caso ele passa a n�o diferencias maiuscula/minuscula:
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		//verifica se a strig termina com a palavra "boa". Retorna true ou false.
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		//quantos caracteres tem uma string:
		System.out.println(s.length());
		
		//verifica se a string dentro da vari�vel s � igual a x e retorna true/false
		System.out.println(s.equals("boa tarde"));
		//aqui ignora letras mai�suculas ou minusculas, acentua��o etc 
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		//concatena��o pr�tica:
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1235.56;
		//jeito cl�ssico:
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + 
				"\nIdade: " + idade + "\nSal�rio: " + salario);
		System.out.println("-------------------------------------------------------------------");
		//jeito mais pratico: (%s � para string, %d valores inteiros, %f para float e %.2f diz quantas casas decimais quero exibir
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f", 
				nome, sobrenome, idade, salario);
		//outra forma:
		System.out.println("\n--------------------------------------------------------------------");
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$ %.2f", 
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		//fun�ao que verifica se na fun��o a presen�a de um valor x: (true or false)
		System.out.println("\n---------------------------");
		System.out.println("frase qualquer".contains("qual"));
		//informa o index que come�a o valor x:
		System.out.println("frase qualquer".indexOf("qual"));
		//escreve a string a partir do valor x:
		System.out.println("frase qualquer".substring(6));
		//escreve a string do indice x ate o indice y:
		System.out.println("frase qualquer".substring(6, 8));
		
	}
}
