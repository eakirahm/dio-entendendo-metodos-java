package one.digitalinnovation.basecamp;

/*
 * Classe principal dos exerc�cios da Aula 2 de m�todos.
 */

public class Main {

	public static void main(String[] args) {
		
		// Quadril�tero
		System.out.println("Exerc�cio do quadril�tero");
		
		Quadrilatero.area(4);
		System.out.println();
		Quadrilatero.area(4d, 5d);
		System.out.println();
		Quadrilatero.area(6, 10, 5);
		System.out.println();
		Quadrilatero.area(5f, 6f);
	}

}
