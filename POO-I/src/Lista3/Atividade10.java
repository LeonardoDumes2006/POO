package Lista3;
import java.util.Scanner;
public class Atividade10 {
	public static void main(String[] args) {
		/*
		 * 10. Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro
		número elevado ao segundo número. Não utilize a função de potência da linguagem.
		 */
		Scanner en = new Scanner(System.in);
		System.out.println("Digite a base : ");
		int base = en.nextInt();
		
		System.out.println("Digite o expoente");
		int exp = en.nextInt();
		
		int pot = 1;
		
		 for (int i = 0; i < exp; i++) {
	            pot *= base;
	        }

		
		System.out.println("A potência é  :" + pot);
		en.close();
	}
}
