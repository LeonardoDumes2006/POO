package Lista4;
import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		/*
		 * 3. Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
		 */
		Scanner en = new Scanner(System.in);
		double[] notas = new double[4];
		double soma = 0;
		double media;
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite uma nota");
			notas[i] = en.nextDouble();
			soma += notas[i];
		}
		media = soma / 4;
		System.out.println("A sua média é : " + media);
		en.close();
	}
}
