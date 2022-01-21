package one.digitalinnovation.basecamp;

/*
 * Classe principal dos exercícios da Aula 3 de métodos.
 */

public class Main {

	public static void main(String[] args) {
		
		// Retornos
		System.out.println("Exercício retorno");		
		
		double areaQuadrado = Quadrilatero.area(4);
		System.out.println("Área do quadrado = " + areaQuadrado);
		
		System.out.println();
		double areaRetangulo = Quadrilatero.area(8, 7);
		System.out.println("Área do retangulo = " + areaRetangulo);
		
		System.out.println();
		double areaTrapezio = Quadrilatero.area(6, 9, 2);
		System.out.println("Área do trapézio = " + areaTrapezio);

	}

}
