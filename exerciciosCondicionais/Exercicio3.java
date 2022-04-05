package ExerciciosDiversos;

import java.util.Scanner;

/* 5. Escreva um programa Java que mantenha um número do 
 * usuário e gere um inteiro entre 1 e 7 e exiba o nome 
 * do dia da semana. */
public class Exercicio3 {

	public static void main(String[] args) {
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número de 1 até 7: ");
		num = leia.nextInt();
		
		if (num < 1 || num > 7) {
			System.out.println("Eu disse de 1 até 7, poxa!");
		}

		switch (num) {
		// Quando é número, não se usa aspas simples ou dupla.
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Terça-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Domingo");
			break;
		}
	}

}
