package Questoes;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		int num = input.nextInt();
		
		int i = 0;
		int j = 0;
		
		while (i != num){
			i++;
			if((i%2) == 0){
				System.out.println(i);
				j++;
			}
		}
		
		System.out.println("S�o " + j + " N�meros pares");
	}

}
