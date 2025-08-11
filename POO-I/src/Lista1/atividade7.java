package Lista1;
import java.util.Scanner;

public class atividade7 {

	public static void main(String[] args) {
		// 7. Faça um Programa que calcule e mostre a área de um quadrado.

		Scanner en = new Scanner(System.in);
		
		System.out.print("Informe o lado do quadrado : ");
		float lado = en.nextFloat();
		
		double area = Math.pow(lado, 2);
		
		System.out.printf("A área do quadrado é : %.2f%n " + area);
		
		en.close();
	}

}
