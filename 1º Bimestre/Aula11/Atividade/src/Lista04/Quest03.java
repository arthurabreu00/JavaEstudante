package Lista04;

import java.util.Scanner;

public class Quest03 {

	public static void main(String[] args) {
		/*
		 * 3) FA�A UM ALGORITMO PARA LER UM VETOR DE 10 N�MEROS. AP�S ISTO, LER
		 * MAIS UM N�MERO QUALQUER, CALCULAR E ESCREVER QUANTAS VEZES ESSE
		 * N�MERO APARECE NO VETOR.
		 */
		
		Scanner input = new Scanner(System.in);
		byte cont = 0;
		int vet[] = new int[10];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite o "+ (i+1) + "� N�mero: ");
			vet[i] = input.nextInt();
		}
		
		System.out.println("-------------------------");
		System.out.println("Digite outro valor");
		int num = input.nextInt();
		
		for (int i = 0; i < vet.length; i++) {
			if(vet[i] == num) cont++;
		}
		
		System.out.println("O N�mero " + num + " Aparece " + cont + " Vezes.");
				
	}

}
