package Lista03;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		/*
		 * 1) FA�A UM ALGORITMO PARA LER: UM VETOR A DE 10 N�MEROS. AP�S, LER
		 * MAIS UM N�MERO E GUARDAR EM UMA VARI�VEL X. ARMAZENAR EM UM VETOR M O
		 * RESULTADO DE CADA ELEMENTO DE A MULTIPLICADO PELO VALOR X. LOGO AP�S,
		 * IMPRIMIR O VETOR M.
		 */
		Scanner input = new Scanner(System.in);

		int a[] = new int[9];
		int m[] = new int[9];

		for (int i = 0; i < a.length; i++) {
			System.out.print("Digite o " + (i + 1) + "� n�mero: ");
			a[i] = input.nextInt();
		}
		System.out.println("-----------------------------");
		System.out.print("Digite um multiplicador: ");
		int mul = input.nextInt();

		for (int i = 0; i < m.length; i++) {

			m[i] = a[i] * mul;

			System.out.println(a[i] + " x " + mul + " = " + m[i]);
		}

	}

}
