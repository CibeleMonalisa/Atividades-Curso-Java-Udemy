package fundamentos.operadores;

public class DesafioLogicos {
 public static void main(String[] args) {
	 boolean trabalho1 = true;
	 boolean trabalho2 = true;
	 boolean sorvete = true;
	 
	 if (trabalho1 == true && trabalho2 == true) {
		 sorvete = true;
		 System.out.println("A família poderá compra a TV de 50 polegadas");
		 System.out.println("A família pode tomar sorvete");
		 if (sorvete == true) {
			 System.out.println("a família está menos saudável");
		 } 
	 }else if (trabalho1 == false && trabalho2 == true || trabalho1 == true && trabalho2 == false){
		 sorvete = true;
		 System.out.println("A família poderá compra a TV de 32 polegadas");
		 System.out.println("A família pode tomar sorvete");
		 if (sorvete == true) {
			 System.out.println("a família está menos saudável");
		 } 
	 }else if (trabalho1 == false && trabalho2 == false) {
		 sorvete = false;
		 System.out.println("A família não pode tomar sorvete e nem comprar uma TV");
		 if (sorvete == false) {
			 System.out.println("a família está mais saudável");
		 }
	 }
	 
}
}
