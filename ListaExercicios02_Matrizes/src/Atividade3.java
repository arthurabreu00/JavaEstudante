import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		/**
		 *3.    Capture  do  teclado  valores  para  preenchimento  de  uma  matriz  M  3x3. 
		 * Ap�s  a captura  imprima  a  matriz  criada  e  encontre  a  quantidade  de  n�meros  pares, 
		 *  a quantidade de n�meros �mpares.  
		 */

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int vetorM[][] = new int[3][3];

		for (int i = 0; i < vetorM.length; i++) {
			for (int j = 0; j < vetorM.length; j++) {
				System.out.println("Digite o valor da " + i + "� Linha " + j + "� Coluna");
				vetorM[i][j] = input.nextInt();
			}
		}

		int pares = 0, impares = 0;
		
		for (int i = 0; i < vetorM.length; i++) {
			for (int j = 0; j < vetorM.length; j++) {
				System.out.print(vetorM[i][j] + " ");
				if(vetorM[i][j] % 2 == 0 ) {
					pares++;
				}else {
					impares++;
				}
			}

			System.out.println();
		}
		
		System.out.println("H� " + pares +" n�meros pares e " + impares + " n�meros impares" );

	}

}
