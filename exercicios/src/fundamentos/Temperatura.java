package fundamentos;
import java.util.Scanner;
//programa para converter fahrenheit para celsius
//(°F - 32) * 5/9 = °C
public class Temperatura {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a temperatura em fahrenheit que desejada");
		double temperaturaF = sc.nextDouble();
		final double divisao = 5 / 9.0;
		final int sub = 32;
		double resultadoC = (temperaturaF - sub) * divisao;
		System.out.println(temperaturaF + " fahrenheit equivalem a " + resultadoC + " celsius");
		sc.close();
	}
}
