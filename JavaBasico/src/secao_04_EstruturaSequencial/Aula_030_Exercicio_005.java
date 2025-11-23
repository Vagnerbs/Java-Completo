package secao_04_EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula_030_Exercicio_005 {

	public static void main(String[] args) {
		/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrada: ");
		@SuppressWarnings("unused")
		int codigo1 = sc.nextInt();
		int quantia1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		double soma1 = quantia1 * valor1;
		
		@SuppressWarnings("unused")
		int codigo2 = sc.nextInt();
		int quantia2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		double soma2 = quantia2 * valor2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f ", (soma1 + soma2));
		
		sc.close();
	}

}
