
import java.util.Random;

public class Atividade10 {

	public static void main(String[] args) {

		/**
		 *  10) Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se "todos" os elementos do vetor A s�o pares. 
		 *  Se pelo menos um elemento do vetor n�o  for  par  o  processo  de  repeti��o  para  percorrer  os  elementos  do  vetor  deve  ser encerrado, 
		 *  como sugest�o: utilize uma vari�vel do tipo flag para atingir este prop�sito.
		 */
		
		int vetorA[] = new int[10];
		
		Random rand = new Random();
	
		System.out.println("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = rand.nextInt(100);
		}
	
		System.out.println();
		
		// 1� M�todo de parada
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 == 1) {
				System.out.println("Impar encontrado: " + vetorA[i]);
				break;
			}
		}
		
		
		// 2� M�todo para a parada
		boolean temPar = false;
		int i = 0;
		while (!temPar) {
			if(vetorA[i] % 2 == 1) {
				temPar = true;
				System.out.println("Impar encontrado: " + vetorA[i]);
			}
			i++;
		}



	}

}
