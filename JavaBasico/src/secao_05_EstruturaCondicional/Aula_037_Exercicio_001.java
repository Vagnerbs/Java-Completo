package secao_05_EstruturaCondicional;

import java.util.Scanner;

public class Aula_037_Exercicio_001 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
		 * negativo ou não.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		if(numero >= 0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		sc.close();
	}

}
