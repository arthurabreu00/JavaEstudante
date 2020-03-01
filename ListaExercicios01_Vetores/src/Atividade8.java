
import java.util.Random;

public class Atividade8 {

	public static void main(String[] args) {

		/**
		 * 8) Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que
		 * defina o percentual de elementos pares e �mpares, respectivamente,
		 * armazenados neste vetor.
		 */

		int vetorA[] = new int[10];

		Random rand = new Random();

		int impares = 0;
		int pares = 0;

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = rand.nextInt(100) + 1;
			if (vetorA[i] % 2 == 0) {
				pares++;
			} else {
				impares++;
			}

		}

		// Jeito mais simples (Acredito que n�o seja o objetivo)
		System.out.println("Os n�meros impares correspodem h� " + impares * 10 + "%");
		System.out.println("Os n�meros pares correspodem h� " + pares * 10 + "%");

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

		// Realizando contas
		float porcentagemImpares = impares * 100 / vetorA.length;
		float porcentagemPares = pares * 100 / vetorA.length;
		System.out.println("Os n�meros impares correspodem h� " + porcentagemImpares + "%");
		System.out.println("Os n�meros pares correspodem h� " + porcentagemPares + "%");
	}

}
