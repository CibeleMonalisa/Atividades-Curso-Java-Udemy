package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		//conversão implícita:
		double a = 1;
		System.out.println(a);
		
		//convertendo fazendo cast:
		//conversão explícita:
		float b = (float) 1.12345;
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		

	}

}
