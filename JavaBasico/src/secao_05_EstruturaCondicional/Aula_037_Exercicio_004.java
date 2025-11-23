package secao_05_EstruturaCondicional;

import java.util.Scanner;

public class Aula_037_Exercicio_004 {

	public static void main(String[] args) {
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
		 * uma duração mínima de 1 hora e máxima de 24 horas
		 */
		
		Scanner sc = new Scanner(System.in);
		int duracao;

		System.out.println("Entrada: ");
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
        if (horaInicial >= horaFinal ) {
        	// Significa que passou pela meia-noite
            duracao = (24 - horaInicial) + horaFinal;
            
        } else {
        	// Se a hora final for maior que a inicial, basta subtrair
        	duracao = horaFinal - horaInicial;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
	
	}

}
