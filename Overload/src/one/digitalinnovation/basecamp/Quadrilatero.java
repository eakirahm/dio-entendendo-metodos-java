package one.digitalinnovation.basecamp;

/*
 * Classe de exemplo para o exerc�cio da Aula 2 de m�todos.
 */

public class Quadrilatero {

	public static void area(double lado) {
		System.out.println("�rea do quadrado = " + lado * lado);
	}
	
	public static void area(double lado1, double lado2) {
		System.out.println("�rea do ret�ngulo = " + lado1 * lado2);
	}
	
	public static void area(double baseMaior, double baseMenor, double altura) {
		System.out.println("�rea do trap�zio = " + ((baseMaior + baseMenor) * altura / 2));
	}
	
	public static void area(float diagonal1, float diagonal2) {
		System.out.println("�rea do losango = " + diagonal1 * diagonal2);
	}
}