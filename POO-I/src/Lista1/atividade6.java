package Lista1;
import java.util.Scanner;

public class Atividade6 {
	public static void main(String[] args) {
		//6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
		
		Scanner en = new Scanner(System.in);
		
		System.out.print("Informe o valor do raio de um círculo : ");
		float raio = en.nextFloat();
		
		double pi = Math.PI;
		double area = pi * raio * raio;
		
		System.out.printf("A área do círculo é: %.2f%n", area);
		
		en.close();
	}
}
