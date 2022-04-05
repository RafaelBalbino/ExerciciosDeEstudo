package ExerciciosDiversos;

import java.util.Scanner;

/* 4. Escreva um programa Java que leia um n�mero de ponto flutuante 
 * e imprima "zero" se o n�mero for zero. 
 * Caso contr�rio, imprima "positivo" ou "negativo". 
 * Adicione "pequeno" se o valor absoluto do n�mero for menor que 1 
 * ou "grande" se exceder 1.000.000. */

public class Exercicio2 {

	public static void main(String[] args) {
		double num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um n�mero qualquer: ");
		num = leia.nextDouble();
		
		if (num == 0) {
			System.out.println("O n�mero � ZERO.");
		}
		else if (num > 0) {
			System.out.println("O n�mero � positivo.");
		}
		else {
			System.out.println("O n�mero � negativo.");
		}
		
		if (num <= 1) {
			System.out.println("E tamb�m � pequeno.");
		}
		
		if (num > 1000000) {
			System.out.println("E tamb�m � grande.");
		}
	}

}
