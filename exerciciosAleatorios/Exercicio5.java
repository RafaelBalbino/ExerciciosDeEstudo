package exercicios1a5;

import java.util.Scanner;

// Desenvolva um algoritmo em Java que leia um número 
// inteiro e imprima o seu antecessor e seu sucessor.
public class Exercicio5 {

	public static void main(String[] args) {
			int num;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.print("Escreva o número escolhido: ");
			num = leia.nextInt();
			
			System.out.println("O número escolhido é: " + num);
			System.out.println("Seu antecessor é: " + (num - 1));
			System.out.println("Seu sucessor é: " + (num + 1));
	}
}
