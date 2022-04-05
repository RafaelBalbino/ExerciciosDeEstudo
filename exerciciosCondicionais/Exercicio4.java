package ExerciciosDiversos;

import java.util.Scanner;

// 7. Escreva um programa Java para encontrar o número de dias em um mês.

public class Exercicio4 {

	public static void main(String[] args) {
		int mes, ano, restoMes, restoAno;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um mês: ");
		mes = leia.nextInt();
		
		if (mes < 1 || mes > 12) {
			System.out.println("Leva a sério o programa, pô!");
		}
		
		else {
			System.out.print("Digite um ano: ");
			ano = leia.nextInt();
			
			restoAno = ano % 4;
			restoMes = mes % 2;
			
			if (restoAno != 0){
				if (mes == 2){
					System.out.println("Este mês tem 28 dias.");
				}
				else if (restoMes == 0){
					System.out.println("Este mês tem 30 dias.");
				}
				else {
					System.out.println("Este mês tem 31 dias.");
				}
			}
			
			if (restoAno == 0) {
				if (mes == 2){
					System.out.println("Este mês tem 29 dias.");
				}
				else if (restoMes == 0){
					System.out.println("Este mês tem 30 dias.");
				}
				else {
					System.out.println("Este mês tem 31 dias.");
				}
			}
		}
		
	}

}
