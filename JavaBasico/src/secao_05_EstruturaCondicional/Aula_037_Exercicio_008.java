package secao_05_EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Aula_037_Exercicio_008 {

	public static void main(String[] args) {
		/*
		Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
		que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
		qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
		mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo
		
		RENDA                                   Imposto de Renda
		DE 0.00 A R$ 2000.00                         Isento
		DE R$ 2000.01 ATÉ R$ 3000.00                   8 %
		DE R$ 3000.01 ATÉ R$ 4500.00                  18 %
		ACIMA DE R$ 4500.00                           28 %
		
		Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
		salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
		de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
		duas casas decimais.
        */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double imposto = 0;
		boolean isento = false;
		
		System.out.println("Digite o valor do seu salario para calculo do imposto: ");
		double salario = sc.nextDouble();
		
		if (salario > 0 && salario <= 2000.00) {
			isento = true;
		} else if (salario > 2000.00 && salario <= 3000.00) {		
			//Tributos de 8%
			imposto = (salario - 2000.00) * 0.08;		
		} else if (salario > 3000.00 && salario <= 4500.00) {		
			//Tributos de 8%
			imposto = 1000.00 * 0.08;
			//Tributos até 18%
			imposto += (salario - 3000.00) * 0.18;		
		} else if (salario > 4500.00) {		
			//Tributos 8%
			imposto = 1000.00 * 0.08;
			//Tributos 18%
			imposto += 1500.00 * 0.18;
			//Tributos 28%
			imposto += (salario - 4500.00) * 0.28;			
		} 
		
		if (salario <= 0) {
		    System.out.println("Insira um valor valido!");	    
		} else if (isento) {		
		    System.out.println("Isento");	    
		} else {		
		    System.out.printf("R$ %.2f%n", imposto);
		}
		sc.close();
	}

}
