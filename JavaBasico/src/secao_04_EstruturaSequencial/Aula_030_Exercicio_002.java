package secao_04_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula_030_Exercicio_002 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrada: ");
		double raio = sc.nextDouble();
		
		double calculo = 3.14159 * (Math.pow(raio, 2));
		
		System.out.printf("Saída: %.4f", calculo);
		sc.close();
		
	}

}
