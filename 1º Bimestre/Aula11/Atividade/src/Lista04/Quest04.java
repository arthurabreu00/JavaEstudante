package Lista04;

import java.util.Scanner;

public class Quest04 {

	public static void main(String[] args) {

		/*
		 * 4) DESENVOLVER UM PROGRAMA QUE EFETUE A LEITURA DE 10 ELEMENTOS E ARMAZENE EM
		 * UM VETOR A. CONSTRUIR UM VETOR B, OBSERVANDO A SEGUINTE LEI DE FORMA��O: SE O
		 * VALOR DO �NDICE FOR PAR, O VALOR DEVER� SER MULTIPLICADO POR 5, SENDO �MPAR
		 * DEVER� SER SOMADO POR 5. AO FINAL MOSTRAR OS CONTE�DOS DOS DOIS VETORES.
		 */

		Scanner input = new Scanner(System.in);

		int vetA[] = new int[10];

		for (byte i = 0; i < vetA.length; i++) {

			System.out.print((i + 1) + "� N�mero: ");
			vetA[i] = input.nextInt();

		}

		int vetB[] = new int[vetA.length];
		System.out.println("------------------------");
		System.out.print("Vetor A: ");
		for (byte i = 0; i < vetB.length; i++) {
			System.out.print(vetA[i] + " ");

			if (vetA[i] % 2 == 0)
				vetB[i] = vetA[i] * 5;
			else
				vetB[i] = vetA[i] + 5;

		}
		
		System.out.println();
		System.out.println("------------------------");
		System.out.print("Vetor B:");
		
		for (int i = 0; i < vetB.length; i++) {
			System.out.print(" " + vetB[i]) ;
		}
	}

}
