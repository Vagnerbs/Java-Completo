package aulasBasicas;

import java.util.Scanner;

public class Aula_030_Exercicio_001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrada: ");
		int n1 = sc.nextInt();
		sc.nextLine();
		int n2 = sc.nextInt();
		
		System.out.println("SOMA = " + (n1 + n2));
		
		sc.close();
	}

}
