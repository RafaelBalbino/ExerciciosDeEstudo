package exercicios1a5;

/* Fazer um programa que imprima a média aritmética dos números 
 * 8,9 e 7. A média dos números 4, 5 e 6. 
 * A soma das duas médias. A média das médias. */

public class Exercicio2 {

	public static void main(String[] args) {
			
			int media1, media2, mediaSoma;
			double mediaMedia;
			
			media1 = (7 + 8 + 9) / 3;
			media2 = (4 + 5 + 6) / 3;
			mediaSoma = media1 + media2;
			mediaMedia = (media1 + media2) / 2;
		
			System.out.println("A média aritmética dos número 7, 8 e 9 é: " + media1);
			System.out.println("A méia dos núemros 4, 5  6 é: " + media2);
			System.out.println("A soma das duas médias é: " + mediaSoma);
			System.out.println("A média das médias é: " + mediaMedia);
		
	}

}
