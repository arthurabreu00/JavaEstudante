package Lista01;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		/*
		 * 4 - FA�A UM PROGRAMA QUE ACEITE V�RIOS N�MEROS. VOC� PODER� DIGITAR
		 * QUANTOS N�MEROS QUISER, POR�M CASO VOC� DIGITE 6 N�MEROS NO INTERVALO
		 * ENTRE 10 E 20. O PROGRAMA FINALIZA.
		 */

		Scanner input = new Scanner(System.in);
		byte i = 0;

		while (true) {
			System.out.println("N�mero: ");
			int num = input.nextInt();

			if (num >= 10 && num <= 20)
				i++;

			if (i == 6)
				break;
		}
		System.out.println("Fim de programa...");

	}

}
