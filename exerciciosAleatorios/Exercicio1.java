package exercicios1a5;

import java.util.Scanner;

/* Fa�a um algoritmo que leia a idade de uma pessoa expressa em anos, 
 * meses e dias e mostre-a expressa em dias. Leve em considera��o o 
 * ano com 365 dias e o m�s com 30. (Ex: 3 anos, 2 meses e 15 
 * dias = 1170 dias.) */

public class Exercicio1 {

	public static void main(String[] args) {
		int idadeAnos, idadeMeses, idadeDias, idadeDiasTotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite sua idade em anos: ");
		idadeAnos = leia.nextInt();
		
		System.out.print("Digite os meses que viveu desde o �ltimo anivers�rio: ");
		idadeMeses = leia.nextInt();

		System.out.print("Digite os dias que viveu desde o �tlimo m�s: ");
		idadeDias = leia.nextInt();
		
		idadeDiasTotal = (idadeAnos * 365 + (idadeAnos / 4)) + (idadeMeses * 30 + ((idadeMeses * 30 ) / 2)) + idadeDias;
		
		System.out.println("Voc� viveu " + idadeDiasTotal + " dias at� agora. Parab�ns!");
	}

}
