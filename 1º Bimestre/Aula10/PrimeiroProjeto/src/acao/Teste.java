package acao;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = leia.nextLine();
		
		leia = new Scanner(System.in);
		System.out.print("Digite o ano de seu nascimento: ");
		int ano = leia.nextInt();
		
		System.out.println("Boa Noite " + nome);
		int idade = 2018 - ano;
		System.out.println("Voc� tem " + (idade) + " Anos");
		
		if(idade >= 18){
			System.out.println("Maior de idade, voc� j� se alistou ?");
		} 
		
		else{
			System.out.println("Menor de idade, voc� vai demorar um tempo para se alistar ?");
		}
	}

}
