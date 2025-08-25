package Lista4;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		/*
		 * 1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
		 */
		Scanner en = new Scanner(System.in);
		int[] vetor = new int[5];
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i+1) + "° número");
			vetor[i] = en.nextInt();
		}
		for(int i = 0; i < 5; i++) {
			System.out.println(vetor[i]);
		}
		en.close();
	}
}
