package Questoes;

import java.util.Scanner;

public class ChaveSeletora {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String diaDaSemana = input.nextLine();
		
		switch(diaDaSemana){
		
		case "Domingo":
			System.out.println("Voc� informou o 1� Dia");
		break;
		
		case "Segunda":
			System.out.println("Voc� informou o 2� Dia");
		break;
		
		case "Ter�a":
			System.out.println("Voc� informou o 3� Dia");
		break;
		
		case "Quarta":
			System.out.println("Voc� informou o 4� Dia");
		break;
		
		case "Quinta":
			System.out.println("Voc� informou o 5� Dia");
		break;
		
		case "Sexta":
			System.out.println("Voc� informou o 6� Dia");
		break;
		
		case "Sabado":
			System.out.println("Voc� informou o 7� Dia");
		break;
		
		default:
			System.out.println("Digite um dia v�lido");
			break;
		
		}

	}
}
