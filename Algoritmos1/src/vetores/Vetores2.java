package vetores;

import java.util.Scanner;

/*
 * Elaborar um programa que leia 10 n�meros. Ap�s liste apenas os n�meros pares.
 * Informe tamb�m, quantos pares foram digitados.
 * */

public class Vetores2 {

	public static void main(String[] args) {
		int num[] = new int[10];
		
		Scanner input = new Scanner(System.in);
		for (int i = 1; i <=10 ; i++) {
			System.out.println("Digite o "+i+"� n�mero: ");
			num[i] = input.nextInt();
			
		}
		for (int i = 1; i <= 10; i++) {
			if(num[i] %2 == 0) {
				System.out.println("Apenas os n�meros pares " + num[i]+ " ");

			}

		}

	}

}
