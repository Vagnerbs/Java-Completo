package aulasBasicas;

import java.util.Scanner;

public class Aula_026_Entrada_De_Dados {

	public static void main(String[] args) {
		
		//Scanner para entrada de dados que o usuario digitou
				Scanner sc = new Scanner(System.in);
				
				String x;
				x = sc.next();
				
				System.out.println("Voce digitou: " + x);
				
				sc.close();
	}

}
