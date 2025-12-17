package secao_06_EstruturasRepetitivas;

import java.util.Scanner;

public class Aula_051_EstruturaRepetitivaWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		//While(Enquanto) x for diferente de zero continua a repetição
		while (x != 0) {
			x = sc.nextInt();
		}
		sc.close();
	}

}
