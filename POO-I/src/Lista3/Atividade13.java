package Lista3;

import java.util.Scanner;

public class Atividade13 {
	public static void main(String[] args) {
		/*
		 * 13. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
			Ex.: 5!=5.4.3.2.1=120
		 */
		Scanner en = new Scanner(System.in);
		System.out.println("Digite um número inteiro");
		int num = en.nextInt();
		int fat = 1;
		for(int i = 1; i <= num; i++) {
			fat = fat * i;
		}
		System.out.println("O fatorial de " + num + " é : " + fat);
		en.close();
	}
}
