package exercicios1a5;

import java.util.Scanner;

/* 5. Crie um algoritmo que leia o valor do sal�rio m�nimo e o 
 * valor do sal�rio de um usu�rio, calcule a quantidade de 
 * sal�rios m�nimos esse usu�rio ganha e imprima o resultado. 
 * (1SM = R$1.212) */
public class Exercicio4 {

	public static void main(String[] args) {
		
		int SM = 1212, salUsuario, qtdSal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite seu sal�rio: ");
		salUsuario = leia.nextInt();
		
		
		qtdSal = salUsuario / SM;
		
		if (salUsuario < SM) {
			System.out.println("Voc� ganha menos que um sal�rio m�nimo.");
		}
		else if (salUsuario > SM && qtdSal < 2) {
			System.out.println("Voc� ganha 1 sal�rio m�nimo e uns trocados");
		}
		else {
			System.out.println("Voc� ganha " + qtdSal + " sal�rio(s) m�nimo(s).");
		}
		System.out.println("FIM DO PROGRAMA!");
		
	}

}
