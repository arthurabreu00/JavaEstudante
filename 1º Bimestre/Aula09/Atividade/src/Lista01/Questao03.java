package Lista01;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		/*
		 * 3 - FA�A UM ALGORITMO QUE VOC� ENTRE COM 5 N�MEROS, NO FINAL IMPRIMA
		 * A QUANTIDADE DE N�MEROS QUE FORAM MENOR QUE 0.
		 */
		
		byte j = 0;
		Scanner input = new Scanner(System.in);
		
		for (byte i = 0; i < 5; i++) {

			System.out.print("Digite o " + (i+1) + "� n�mero: ");
			int num = input.nextInt();
			
			if(num < 0) j++;
		}

		System.out.println(j + " N�meros s�o menores que 0.");
	}

}
