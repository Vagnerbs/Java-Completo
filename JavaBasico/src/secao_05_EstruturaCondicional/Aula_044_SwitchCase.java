package secao_05_EstruturaCondicional;

import java.util.Scanner;

public class Aula_044_SwitchCase {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da
		 * semana (sendo 1=domingo, 2=segunda, e assim por diante). Escrever na tela o
		 * dia da semana correspondente, conforme exemplos. Entrada: 1 - Dia da semana:
		 * domingo Entrada: 4 - Dia da semana: quarta Entrada: 9 - Dia da semana: valor
		 * inválido
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String dia;
		
		System.out.println("Digite o dia da semama: ");
		int x = sc.nextInt();
		
		switch (x) {
		case 1: 
			dia = "Domingo";
			break;
		case 2: 
			dia = "Segunda";
			break;
		case 3: 
			dia = "Terça";
			break;
		case 4: 
			dia = "Quarta";
			break;
		case 5: 
			dia = "Quinta";
			break;
		case 6: 
			dia = "Sexta";
			break;
		case 7: 
			dia = "Sabado";
			break;
		default:
			dia = "Valor invalido";
		}
		
		System.out.println("Dia da Semana: " + dia);
		sc.close();		
	}

}
