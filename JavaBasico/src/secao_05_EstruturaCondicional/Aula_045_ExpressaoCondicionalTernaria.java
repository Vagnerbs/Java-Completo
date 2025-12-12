package secao_05_EstruturaCondicional;

public class Aula_045_ExpressaoCondicionalTernaria {

	public static void main(String[] args) {
		// Expressão condicional ternária
		
		double preco = 34.5;
		//                condição - (?)Se verdadeira - (:)Se for falsa              
		double desconto = (preco < 20) ? preco * 0.1  : preco * 0.05;
		
		System.out.println(desconto);

	}

}
