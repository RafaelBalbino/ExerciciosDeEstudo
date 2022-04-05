package exercicios1a5;

import java.util.Scanner;

// Informar um saldo e imprimir o saldo com reajuste de 1%.

public class Exercicio3 {

	public static void main(String[] args) {
		
		double saldo, saldoR;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe o saldo: ");
		saldo = leia.nextDouble();
		
		saldoR = saldo * 0.01;
		
		System.out.println("O saldo é de: " + saldo + " com reajuste de " + saldoR);
	}

}
