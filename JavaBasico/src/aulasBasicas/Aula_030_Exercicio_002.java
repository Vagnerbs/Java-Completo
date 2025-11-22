package aulasBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Aula_030_Exercicio_002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrada: ");
		double raio = sc.nextDouble();
		
		double calculo = 3.14159 * (Math.pow(raio, 2));
		
		System.out.printf("Saída: %.4f", calculo);
		sc.close();
		
	}

}
