package Lista3;

import java.util.Scanner;

public class Atividade11 {
	public static void main(String[] args) {
		/*
		 * 11. Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de
			números pares e a quantidade de números impares.
		 */
		int par = 0;
		int impar = 0;
		
		Scanner en = new Scanner(System.in);
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite um número inteiro");
			int num = en.nextInt();
			if(num % 2 == 0) {
				par++;
			}else 
				impar++;
		}
		System.out.println("Números pares : " + par);
		System.out.println("Números impares : " + impar);
		en.close();
	}
}
