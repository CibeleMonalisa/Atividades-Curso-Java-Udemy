package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		// final significa que a variável se torna uma constante (imutável)
		final double pi = 3.14159;
		double area = pi*raio*raio;
		
		System.out.println("Área = " + area + " m2");
		
	}
}
