package Lista01;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		//  FA�A UM PROGRAMA QUE ACEITE SOMENTE N�MEROS ENTRE 1 E 10. UMA VEZ ACEITO O N�MERO, IMPRIMA A TABUADA DE MULTIPLICA��O DE 1 AT� 10.
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num <= 0 || num > 10){
			System.out.print("Digite um n�mero entre 1 e 10: ");
			num = input.nextInt();
		}
		
		for(byte i = 1;i<=10;i++){
			System.out.println(num + " x " + i + " = " + (num*i) );
		}

	}

}
