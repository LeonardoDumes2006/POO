package Lista1;
import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		// 4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.

		Scanner en = new Scanner(System.in);
		
		System.out.print("Informe nota 1: ");
		double nota1 = en.nextDouble();
		System.out.print("Informe nota 2: ");
		double nota2 = en.nextDouble();
		System.out.print("Informe nota 3: ");
		double nota3 = en.nextDouble();
		System.out.print("Informe nota 4: ");
		double nota4 = en.nextDouble();
		
		double media = ( nota1 + nota2 + nota3 + nota4 ) / 4;
		
		System.out.println("A sua média é : " + media);
		
		en.close();
	}
}
