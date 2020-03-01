import java.util.Random;

public class Atividade1 {

	public static void main(String[] args) {
		
		/**
		 * 1.    Gere  e  imprima  uma  matriz  M  4x4  com  valores  aleat�rios  entre  0-  9. 
		 *  Ap�s  isso determine o maior n�mero da matriz e a sua posi��o (linha, coluna). 
		 */
		
		Random rand = new Random();
		
		int vetorM[][] = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				vetorM[i][j] = rand.nextInt(9);
			}
		}
		
		
		@SuppressWarnings("unused")
		int maior = 0,linha = 0,coluna = 0;
		for (int i = 0; i < vetorM.length; i++) {
			for (int j = 0; j < vetorM.length; j++) {
				System.out.print(vetorM[i][j] + " ");
				if(i == 0 && j == 0 || vetorM[i][j] > maior ) {
					maior = vetorM[i][j];
					linha = i;
					coluna = j;
				}
			}
			System.out.println();
		}
		
		System.out.println("O Maior n�mero � " + maior + " Est� contido na linha: " + linha + ", e coluna: " + coluna );
		
	}

}
