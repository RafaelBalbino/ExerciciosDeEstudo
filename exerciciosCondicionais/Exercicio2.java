package ExerciciosDiversos;

import java.util.Scanner;

/* 4. Escreva um programa Java que leia um número de ponto flutuante 
 * e imprima "zero" se o número for zero. 
 * Caso contrário, imprima "positivo" ou "negativo". 
 * Adicione "pequeno" se o valor absoluto do número for menor que 1 
 * ou "grande" se exceder 1.000.000. */

public class Exercicio2 {

	public static void main(String[] args) {
		double num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número qualquer: ");
		num = leia.nextDouble();
		
		if (num == 0) {
			System.out.println("O número é ZERO.");
		}
		else if (num > 0) {
			System.out.println("O número é positivo.");
		}
		else {
			System.out.println("O número é negativo.");
		}
		
		if (num <= 1) {
			System.out.println("E também é pequeno.");
		}
		
		if (num > 1000000) {
			System.out.println("E também é grande.");
		}
	}

}
