package Lista02;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		int k = 0;
		Scanner input = new Scanner(System.in);
		while (true) {
			int j = 0;
			System.out.print("Digite um n�mero:");
			short num = input.nextShort();

			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					j += i;

			}
			k++;
			if (j / 2 == num) {
				System.out.println(num + " � um n�mero perfeito.");
				break;

			}
			
		}
			
			System.out.println("Foram digitados " + k + " N�meros");

	}

}
