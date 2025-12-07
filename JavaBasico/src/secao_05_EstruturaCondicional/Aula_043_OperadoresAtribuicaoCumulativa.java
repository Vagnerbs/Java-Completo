package secao_05_EstruturaCondicional;

import java.util.Scanner;

public class Aula_043_OperadoresAtribuicaoCumulativa {

	public static void main(String[] args) {
		/*
		 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito
		 * a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
		 * custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma
		 * pessoa consumiu, daí mostrar o valor a ser pago.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantia de minutos");
		int minutos = sc.nextInt();
		
		double valorFatura = 50;
		
		if (minutos > 100 ) {
			
			//Atualiza valorFatura somando ao valor atual e o resultado da expressão (minutos - 100) * 2
			valorFatura += (minutos - 100) * 2; 
			
		}
		 
		System.out.printf("Valor a ser pago R$ %.2f", valorFatura);
		sc.close();
	}

}
