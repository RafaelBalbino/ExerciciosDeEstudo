package exercicios1a5;

import java.util.Scanner;

// Desenvolva um algoritmo em Java que leia um n�mero 
// inteiro e imprima o seu antecessor e seu sucessor.
public class Exercicio5 {

	public static void main(String[] args) {
			int num;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.print("Escreva o n�mero escolhido: ");
			num = leia.nextInt();
			
			System.out.println("O n�mero escolhido �: " + num);
			System.out.println("Seu antecessor �: " + (num - 1));
			System.out.println("Seu sucessor �: " + (num + 1));
	}
}
