package secao_07_OutrosTopicosBasicosJava;

import java.util.Scanner;

public class Aula_064_OperadoresBitwise {

	public static void main(String[] args) {

		/*
		 * Este exercício demonstra o uso de operadores bitwise em Java.
		 * 
		 * A ideia é verificar se o 6º bit (contando a partir do zero, da direita para a esquerda)
		 * de um número inteiro está ligado (1) ou desligado (0).
		 * 
		 * Para isso, usamos uma máscara: o número 32, que em binário é 0010 0000.
		 * Esse valor tem apenas o 6º bit ativado.
		 * 
		 * A operação (n & mask) faz uma comparação bit a bit entre o número digitado (n)
		 * e a máscara (32). O resultado será diferente de zero se o 6º bit de n também estiver ativo.
		 * 
		 * Exemplos práticos:
		 * - Se o usuário digitar 89, em binário: 0101 1001
		 *   O 6º bit está DESLIGADO → resultado será 0 → imprime "6th bit is false!"
		 * 
		 * - Se o usuário digitar 113, em binário: 0111 0001
		 *   O 6º bit está LIGADO → resultado será diferente de 0 → imprime "6th bit is true!"
		 * 
		 * Assim, este exercício ajuda a entender como usar máscaras e operadores bitwise
		 * para inspecionar bits específicos dentro de um número inteiro.
		 */

		Scanner sc = new Scanner(System.in);

		int mask = 32;
		int n = sc.nextInt();

		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}
		sc.close();
	}

}
