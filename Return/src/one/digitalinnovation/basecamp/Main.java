package one.digitalinnovation.basecamp;

/*
 * Classe principal dos exerc�cios da Aula 3 de m�todos.
 */

public class Main {

	public static void main(String[] args) {
		
		// Retornos
		System.out.println("Exerc�cio retorno");		
		
		double areaQuadrado = Quadrilatero.area(4);
		System.out.println("�rea do quadrado = " + areaQuadrado);
		
		System.out.println();
		double areaRetangulo = Quadrilatero.area(8, 7);
		System.out.println("�rea do retangulo = " + areaRetangulo);
		
		System.out.println();
		double areaTrapezio = Quadrilatero.area(6, 9, 2);
		System.out.println("�rea do trap�zio = " + areaTrapezio);

	}

}
