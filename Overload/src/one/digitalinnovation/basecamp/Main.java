package one.digitalinnovation.basecamp;

/*
 * Classe principal dos exercícios da Aula 2 de métodos.
 */

public class Main {

	public static void main(String[] args) {
		
		// Quadrilátero
		System.out.println("Exercício do quadrilátero");
		
		Quadrilatero.area(4);
		System.out.println();
		Quadrilatero.area(4d, 5d);
		System.out.println();
		Quadrilatero.area(6, 10, 5);
		System.out.println();
		Quadrilatero.area(5f, 6f);
	}

}
