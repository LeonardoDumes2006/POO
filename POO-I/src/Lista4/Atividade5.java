package Lista4;
import java.util.*;

public class Atividade5 {
	public static void main(String[] args) {
		/*
		 * 5. Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os
			números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três
			vetores.
		 */
		int[] numeros = new int[20];
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> pares = new ArrayList<Integer>();
		
		ArrayList<Integer> impares = new ArrayList<Integer>();
		for(int i=0; i<20;i++) {
			
			System.out.println("Num");
			numeros[i] = input.nextInt();	
			
			if((numeros[i] % 2) == 0)
				pares.add(numeros[i]);
			else
				impares.add(numeros[i]);
			
		}
		System.out.println("Números");
		for(int i = 0; i< 20; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println("\nPares");
		for(int i =0; i< pares.size() ; i++) {
			System.out.print(pares.get(i) + " ");
		}
		System.out.println("\nImpares");
		for(int i =0; i< impares.size() ; i++) {
			System.out.print(impares.get(i) + " ");
		}
		input.close();
	}
}
