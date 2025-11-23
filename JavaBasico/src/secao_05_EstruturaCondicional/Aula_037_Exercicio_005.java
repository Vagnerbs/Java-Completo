package secao_05_EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Aula_037_Exercicio_005 {

	public static void main(String[] args) {
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um código de 1 á 5 e a quantia desejada: ");
		int codigo = sc.nextInt();
		int quantia = sc.nextInt();
		
		if(codigo == 1) {
			System.out.printf("Total: R$ %.2f ", (quantia * 4.00));
			
		} else if(codigo == 2) {
			System.out.printf("Total: R$ %.2f ", (quantia * 4.50));
			
		} else if(codigo == 3) {
			System.out.printf("Total: R$ %.2f ", (quantia * 5.00));
			
		} else if(codigo == 4) {
			System.out.printf("Total: R$ %.2f ", (quantia * 2.00));
			
		} else if(codigo == 5) {
			System.out.printf("Total: R$ %.2f ", (quantia * 1.50));
		}
		sc.close();
	}

}
