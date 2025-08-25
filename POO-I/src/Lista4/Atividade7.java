package Lista4;
import java.util.*;

public class Atividade7 {
	public static void main(String[] args) {
		/*
		 * 7. Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, 
		 * a multiplicação e os números.
		 */
		Scanner input = new Scanner(System.in);
		
		int[] numeros = new int[5];
		int soma = 0;
		int mult = 1;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite um número");
			numeros[i] = input.nextInt();
			soma += numeros[i];
			mult *= numeros[i];
		}
		System.out.println("Os números são: ");
		for(int i = 0; i < 5; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println("\nA soma dos números são: " + soma);
		System.out.println("A multiplicação dos números são: " + mult);
		input.close();
	}
}
