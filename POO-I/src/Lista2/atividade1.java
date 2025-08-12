package Lista2;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		/*
		 * 1. Faça um Programa que peça dois números e imprima o maior deles.
		 */
		
		Scanner en = new Scanner(System.in);

		System.out.print("Informe um inteiro: ");
		int num1 = en.nextInt();
		System.out.print("Informe um inteiro: ");
		int num2 = en.nextInt();
		 
		int maior = 0;
		if(num1 > num2 ) {
			maior = num1;
		}else 
			maior = num2;
		
		System.out.println("O maior número é : " + maior);
		
		en.close();
	}

}
