package exercicios1a5;

/* Fazer um programa que imprima a m�dia aritm�tica dos n�meros 
 * 8,9 e 7. A m�dia dos n�meros 4, 5 e 6. 
 * A soma das duas m�dias. A m�dia das m�dias. */

public class Exercicio2 {

	public static void main(String[] args) {
			
			int media1, media2, mediaSoma;
			double mediaMedia;
			
			media1 = (7 + 8 + 9) / 3;
			media2 = (4 + 5 + 6) / 3;
			mediaSoma = media1 + media2;
			mediaMedia = (media1 + media2) / 2;
		
			System.out.println("A m�dia aritm�tica dos n�mero 7, 8 e 9 �: " + media1);
			System.out.println("A m�ia dos n�emros 4, 5  6 �: " + media2);
			System.out.println("A soma das duas m�dias �: " + mediaSoma);
			System.out.println("A m�dia das m�dias �: " + mediaMedia);
		
	}

}
