package ExerciciosDiversos;

import java.util.Scanner;

/* 3 - Fa�a um programa em que o usu�rio digite 3 n�mrosake e o programa 
 * ache qual o maior deles, imprimindo-o depois. */

public class Exercicio1 {

	public static void main(String[] args) {
		int n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();

		System.out.print("Digite o segundo n�mero: ");
		n2 = leia.nextInt();
		
		System.out.print("Digite o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("O maior n�mero � " + n1);
		}
		else if (n2 > n1 && n2 > n3) {
			System.out.println("O maior n�mero � " + n2);
		}
		else {
			System.out.println("O maior n�mero �  " + n3);
		}
		System.out.println("FIM DO PROGRAMA!");
	}

}
