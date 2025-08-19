package Lista3;

import java.util.Scanner;
public class Atividade7 {
	public static void main(String[] args) {
		/*
		 * 7. Faça um programa que receba dois números inteiros e gere os números inteiros que estão
			no intervalo compreendido por eles.
		 */
		Scanner en = new Scanner(System.in);
		System.out.println("Digite um número inteiro");
		int num1 = en.nextInt();
		System.out.println("Digite um número inteiro");
		int num2 = en.nextInt();
		
		for(int i = num1; i <= num2; i++) {
			System.out.println(i);
		} 
		en.close();
	}
}
