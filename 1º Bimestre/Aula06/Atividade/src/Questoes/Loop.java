package Questoes;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		
		boolean teste = true;
		
		while(teste){
			
			Scanner input = new Scanner(System.in);
			System.out.println("1 - MUTIPLICA��O");
			System.out.println("2 - DIVIS�O");
			System.out.println("3 - ADI��O");
			System.out.println("4 - SUBTRA��O");
			System.out.println("5 - SAIR");
			System.out.print("Digite a op��o: ");
			int caso = input.nextInt();
			
			//if(caso == 5) break;
			
			input = new Scanner(System.in);
			System.out.print("Digite um n�mero: ");
			int num = input.nextInt();
			
			switch(caso){
				case 1: 
					for(int i = 1;i <= 10;i++){System.out.println(num + " x " +  i + " = " + (num*i) );}
				break;
				
				case 2: 
					for(float i = 1;i <= 10;i++){System.out.println(i + " / " +  num + " = " + (i/num) );}
				break;
				
				case 3: 
					for(int i = 1;i <= 10;i++){System.out.println(num + " + " +  i + " = " + (num+i) );}
				break;
				
				case 4: 
					for(int i = 1;i <= 10;i++){System.out.println(num + " - " +  i + " = " + (num-i) );}
				break;
				
				case 5:
					teste = false;
					System.out.println("Finalizando o programa...");
					
				break;
				
				default: System.out.println("Digite um n�mero valido");
			}
			

			
		}
		
		
	}
}
