package aulasBasicas;

import java.util.Locale;
import java.util.Scanner;

public class Aula_030_Exercicio_004 {

	public static void main(String[] args) {
		
		/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		decimais.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrada: ");
		int numero = sc.nextInt();
		int numeroHoras = sc.nextInt();
		double valorHoras = sc.nextDouble();
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f", (numeroHoras * valorHoras));
		sc.close();
	}

}
