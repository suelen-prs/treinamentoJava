package vetores;

import java.util.Scanner;

/*
 * Elaborar um programa que leia descri��o e pre�o de 5 produtos.
 * Ap�s, liste os produtos com seus respectivos pre�os e o valor total da compra.
 * 
 * */
public class Vetores1 {

	public static void main(String[] args) {
		String produto[] = new String[5];
		double preco[] = new double[5];
		double total = 0;
		
		
		Scanner input = new Scanner (System.in);
		for (int i = 0; i <= 4 ; i++) {
			System.out.print((i+1)+"� "+"Produto: ");
			produto[i] = input.nextLine();
			
			System.out.print("Pre�o R$: ");
			preco[i] = input.nextDouble();
			
			input.nextLine();	
		}
		System.out.println();
		System.out.println("Lista de produtos comprados");
		System.out.println("--------------------------------");
		
		for (int i = 0; i <= 4; i++) {
			System.out.printf("%-20s - R$ %6.2f\n", produto[i], preco[i]);
			total = total + preco[i];
			
		}
		System.out.printf("Total R$:            - R$ %6.2f\n", total);

	}

}
