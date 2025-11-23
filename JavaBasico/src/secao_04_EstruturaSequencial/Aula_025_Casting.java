package secao_04_EstruturaSequencial;

public class Aula_025_Casting {

	public static void main(String[] args) {
		
		//1° EXEMPLO DE CASTING.
		int a;
		int b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = a / b;
		//Resultado sem o Casting: Como a divisão é entre inteiros o resto da divisão .5 é ignorado.
		System.out.println(resultado);
		
		resultado = (double) 5 / 2;
		//Resultado com Casting: Aqui convertemos os inteiros para double antes da divisão e resto o .5 não é mais ignorado.
		System.out.println(resultado);
		
		//2° EXEMPLO DE CASTING.
		double c;
		int d;
		c = 5.0;
		//Nesse caso estamos assumindo a perca da casa decimal ao fazer o casting de double para int.
		d = (int) c;
		
		System.out.println(d);
	}

}
