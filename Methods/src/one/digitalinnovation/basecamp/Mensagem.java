package one.digitalinnovation.basecamp;

/*
 * Classe de exemplo para o exerc�cio da Aula 1 de m�todos.
 */

public class Mensagem {
	
	public static void cumprimento(int hora) {
		if (hora > 4 && hora <= 12) {
			mensagemBomDia();
		}
		else if (hora > 12 && hora <= 18) {
			mensagemBoaTarde();
		}
		else {
			mensagemBoaNoite();
		}
	}
	
	public static void mensagemBomDia() {
		System.out.println("Bom dia!");
	}
	
	public static void mensagemBoaTarde() {
		System.out.println("Boa tarde!");
	}
	
	public static void mensagemBoaNoite() {
		System.out.println("Boa noite!");
	}
}