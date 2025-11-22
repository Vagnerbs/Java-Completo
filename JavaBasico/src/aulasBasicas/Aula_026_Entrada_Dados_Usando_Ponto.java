package aulasBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Aula_026_Entrada_Dados_Usando_Ponto {

	public static void main(String[] args) {

		// Locale para podermos usar ponto no lugar da virgula
		Locale.setDefault(Locale.US);

		// Scanner para entrada de dados que o usuario digitou
		Scanner sc = new Scanner(System.in);

		double x;
		x = sc.nextDouble();

		System.out.println("Voce digitou: " + x);

		sc.close();
		
	}

}
