package Quest02;

import java.util.Scanner;

public class TestaComparavel {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int num = input.nextInt();
		
		Comparavel comp = new Comparavel(num);
		
		System.out.print("Digite outro n�mero: ");
		int num2 = input.nextInt();
		
		comp.ehMaiorOuIgual(num2);
		comp.ehMenorOuIgual(num2);
		comp.ehDiferente(num2);
				
	}

}
