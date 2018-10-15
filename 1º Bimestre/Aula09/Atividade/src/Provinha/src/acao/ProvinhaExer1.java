package acao;

import java.util.Scanner;

public class ProvinhaExer1 {

	public static void main(String[] args) {
		/*
		 * FA�A UM ALGORITMO O QUAL VOC� POSSA ENTRAR COM V�RIOS N�MEROS, O SEU
		 * ALGORITMO DEVER� MOSTRAR QUANTOS N�MEROS PRIMOS EXISTEM DE 1 AT� O
		 * N�MERO DIGITADO. OBS: O N�MERO ZERO SER� UMA CONDI��O DE SA�DA. ASSIM
		 * QUANDO DIGITADO O N�MERO ZERO O PROGRAMA DEVER� MOSTRAR A MSG "FIM".
		 */

		Scanner input = new Scanner(System.in); // SCANNER PARA LEITURA DOS DADOS.

		short i = 0; // DECLARA��O DO CONTADOR PARA FORMATA��O(APENAS EST�TICO)
		
		short cont = 0; // DECLARA��O DO CONTADOR (IDENTIFICADOR DE PRIMOS);
		
		System.out.println("--- N�meros primos ---"); // FRASES INICIAIS
		System.out.println("Digite 0 para sair."); // FRASES INICIAIS
		
		while (true) {
			
			i++; // CONTADOR PARA FORMATA��O(APENAS EST�TICO)
			
			short primo = 0; // VARIAVEL CONTADORA DE N�MEROS PRIMO "GERAL";
			
			System.out.print("Digite o " + i + "� N�mero: ");
			int num = input.nextInt(); // LEITURA DOS N�MEROS

			if (num == 0){ 
				System.out.println("FIM");
				break;
			} // CONDI��O PARA O FIM DO PROGRAMA.
			
			for (int num2 = 1; num2 <= num; num2++) {

				for (short j = 2; j <= num2; j++) {
					if (num2 % j == 0)
						cont++;
				} // FIM DO LOOP PARA VERIFICA��O DOS PRIMOS 
				
				if (cont == 1) {
					primo++;
				} // CONDI��O IDENTIFICANDO QUE � PRIMO
				
				cont = 0; // RESET DO CONTADOR (IDENTIFICADOR DE PRIMOS);
				
			} // FIM DO LOOP PARA PECORRER O N�MERO.
			
			System.out.println("Existem " + primo + " N�meros primos entre 1 e " + num); // PRINT DE SA�DA
 
		} // FIM DO LOOP INFINITO

	}

}
