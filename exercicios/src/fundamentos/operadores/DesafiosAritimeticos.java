package fundamentos.operadores;

public class DesafiosAritimeticos {

	public static void main(String[] args) {
		
		float a1 = (6 * (3+2));
		float b1 = (float) Math.pow(a1, 2);
		float r1 = b1 / (3 * 2); 
		
		float a2 = ((1 - 5) * (2 - 7));
		float b2 = a2 / 2;
		float r2 = (float) Math.pow(b2, 2);
		
		float r3 = (r1 - r2);
		float r4 = (float) Math.pow(r3, 3);
		
		float aux = (float) Math.pow(10, 3);
		
		float resultado = r4 / aux;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println((int)resultado);
		
		
		
		
		
	}

}
