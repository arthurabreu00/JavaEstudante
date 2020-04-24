import java.util.Arrays;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * 4) Fa�a um programa para armazenar em uma matriz os compromissos de uma agenda pessoal.
		 *  Cada dia do m�s deve conter 24 horas, 
		 *  onde para cada uma destas 24 horas 
		 *  podemos associar um tarefa espec�fica (compromisso agendado). 
		 *  O programa deve ter um menu onde o usu�rio indica o dia do m�s que deseja alterar 
		 *  e a hora, entrando em seguida com o compromisso, ou ent�o, o usu�rio pode 
		 *  tamb�m consultar a agenda, fornecendo o dia e a hora para obter o 
		 *  compromisso armazenado.
		 */
		
		int A[] = {2,14,61,86,15,59,49,21,20,68};
		int somaMenor15 = 0,qntIguais15 = 0,somaMaior15 = 0;
		int qntSuperior15[] = new int[10];
		
		for(int i=0; i < A.length; i++) {
			if(A[i] == 15) {
				qntIguais15++;
			}else if(A[i] > 15) {
				qntSuperior15[i] = A[i];
				somaMaior15 += A[i];
			}else if(A[i] < 15) {
				somaMenor15 += A[i];
			}
		}

		int mediaMaior15 = somaMaior15/qntSuperior15.length;
		
		System.out.println("Soma de elementos armazenados neste vetor que s�o inferiores a 15: " + somaMenor15);
		System.out.println("Quantidade de elementos armazenados no vetor que s�o iguais a 15: " + qntIguais15);
		System.out.println("M�dia dos elementos armazenados no vetor que s�o superiores a 15: " + mediaMaior15);
	}

}
