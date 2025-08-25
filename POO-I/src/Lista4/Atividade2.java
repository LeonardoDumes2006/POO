package Lista4;
import java.util.Scanner;

public class Atividade2{
	public static void main(String[] args) {
		/*
		 * 2. Faça um Programa que leia um vetor de 10 números reais e mostre-os
		 *  na ordem inversa aordem lida.
		 */
		Scanner en = new Scanner(System.in);
		
		double[] vet = new double[10];
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número");
			vet[i] = en.nextDouble();
		}
		for(int i = 9; i >= 0; i--) {
			System.out.println(vet[i]);
		}
		en.close();
	}
}
