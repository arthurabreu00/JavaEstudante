package Questoes;

import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {
		
		int option = 0;
		do{
			
		Scanner input = new Scanner(System.in);
		System.out.println("1 - ADI��O");
		System.out.println("2 - SUBTRA��O");
		System.out.println("3 - DIVIS�O");
		System.out.println("4 - MULTIPLICA��O");
		System.out.println("5 - SAIR");
		System.out.print("Digite a op��o: ");
		option = input.nextInt();
		if(option == 5){
			System.out.println("Finalizando o programa...");
			break;	
		}
		if (option <= 0 || option >= 5) System.out.println("Digite um n�mero valido");
		
		else{
		
		input = new Scanner(System.in);
		System.out.print("Digite 1� N�mero: ");
		int num = input.nextInt();
		
		input = new Scanner(System.in);
		System.out.print("Digite 2� N�mero: ");
		int num2 = input.nextInt();
		
		
		switch(option){
		case 1:
				System.out.println(num + " + " + num2 + " = " + (num + num2));
			break;

		case 2:
				System.out.println(num2 + " - " + num + " = " + (num2 - num));
			break;

		case 3:
				System.out.println(num + " / " + num2 + " = " + (num / num2));

			break;

		case 4:
				System.out.println(num + " X " + num2 + " = " + (num * num2));
			break;

		}
		
		}
		
		}while(option != 5);
	}
}

