
import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {

		/**
		 *  Ler  as  duas  notas  bimestrais  para  um  conjunto  de  10  alunos. 
		 *   Armazenar  as  notas informadas em dois vetores �Nota1� e �Nota2� do tipo real. 
		 *   Escreva um programa que calcule a m�dia aritm�tica simples das notas informadas armazenando o resultado em um  vetor  �Result�  de  mesmo  tipo  e  tamanho. 
		 *    Ao  mostrar  os  resultados  exibir  a situa��o de cada aluno. Se a m�dia calculada for superior ou igual a 7 o aluno estar� �aprovado�,
		 *     caso contr�rio, a situa��o do aluno ser� �reprovado�. 
		 */
		
		float Nota1[] = new float[10];
		float Nota2[] = new float[10];
		float Result[] = new float[10];
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		for(int i = 0; i< 10;i++) {
			System.out.println("Digite as notas do " + (i+1) + "� Aluno: ");
			System.out.print("\n Digite a 1� nota :");
			Nota1[i] = input.nextFloat();
			
			System.out.print("\n Digite a 2� nota :");
			Nota2[i] = input.nextFloat();
			
			Result[i] = (Nota1[i] + Nota2[i])/2;
			
		}
		
		for(int i = 0; i< 10;i++) {
		System.out.println("Situa��o do " + (i+1) + "� Aluno: " + (Result[i] >= 7 ? 	"Aprovado" : "Reprovado"));
		}


	}

}
