package Lista3;
import java.util.Scanner;
public class Atividade6 {
	public static void main(String[] args) {
		/*
		 * 6. Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
		 */
		
		Scanner en = new Scanner(System.in);
		for(int i = 1; i <= 50; i++ ) {
			if(i % 2 != 0 ) {
				System.out.println(i);
			}
		}
		en.close();
	}
}
