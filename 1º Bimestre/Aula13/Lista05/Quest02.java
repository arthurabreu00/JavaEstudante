package Lista05;

import java.util.Scanner;

public class Quest02 {

	public static void main(String[] args) {
		/*
		 * 2- FAZER UM ALGORITMO PARA VERIFICAR QUAL � O MAIOR E O MENOR N�MERO
		 * ENCONTRADO EM UMA MATRIZ DE ORDEM 3
		 */
		int vet[][] = new int[3][3];
		int maior = 0;
		int menor = 0;
		
		System.out.println("Digite 9 n�meros");
		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length; j++) {
				Scanner input = new Scanner(System.in);
				vet[i][j] = input.nextInt();
				
				if(i == 0 && j == 0){
					 maior = menor = vet[i][j];
				}
				
				if(vet[i][j] > maior){
					maior = vet[i][j];
				}
				
				if(vet[i][j] < menor){
					menor = vet[i][j];
				}
								
			}
		}
		
		System.out.println("O menor n�mero � " + menor );
		System.out.println("O maior n�mero � " + maior );
		
	}

}
