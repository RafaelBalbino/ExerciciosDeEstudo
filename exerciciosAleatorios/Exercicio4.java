package exercicios1a5;

import java.util.Scanner;

/* 5. Crie um algoritmo que leia o valor do salário mínimo e o 
 * valor do salário de um usuário, calcule a quantidade de 
 * salários mínimos esse usuário ganha e imprima o resultado. 
 * (1SM = R$1.212) */
public class Exercicio4 {

	public static void main(String[] args) {
		
		int SM = 1212, salUsuario, qtdSal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite seu salário: ");
		salUsuario = leia.nextInt();
		
		
		qtdSal = salUsuario / SM;
		
		if (salUsuario < SM) {
			System.out.println("Você ganha menos que um salário mínimo.");
		}
		else if (salUsuario > SM && qtdSal < 2) {
			System.out.println("Você ganha 1 salário mínimo e uns trocados");
		}
		else {
			System.out.println("Você ganha " + qtdSal + " salário(s) mínimo(s).");
		}
		System.out.println("FIM DO PROGRAMA!");
		
	}

}
