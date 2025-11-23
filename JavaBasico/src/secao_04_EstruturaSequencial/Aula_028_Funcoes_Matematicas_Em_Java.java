package secao_04_EstruturaSequencial;

public class Aula_028_Funcoes_Matematicas_Em_Java {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);    // Calcula a raiz quadrada de x	
		B = Math.sqrt(y);    // Calcula a raiz quadrada de y
		C = Math.sqrt(25.0); // Calcula a raiz quadrada de 25
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		System.out.println("");
		
		A = Math.pow(x, y);     // Eleva x à potência y (3^4 = 81)
		B = Math.pow(x, 2.0);   // Eleva x ao quadrado (3^2 = 9)
		C = Math.pow(5.0, 2.0); // Eleva 5 ao quadrado (5^2 = 25)
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		System.out.println("");
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A); // Valor absoluto de y, retira todo negativo do valor
		System.out.println("Valor absoluto de " + z + " = " + B); // Valor absoluto de z, retira todo negativo do valor
		
	}

}
