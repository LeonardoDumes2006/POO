package Lista1;
import java.util.Scanner;

public class Atividade15 {

	public static void main(String[] args) {
		/*
		 * 15. Faça um programa para uma loja de tintas.
		 * O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
		 * Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados
		 * e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
		 * Informe ao usuário a quantidade de latas de tinta a serem compradas
		 * e o preço total.
		 */
		
		Scanner en = new Scanner(System.in);
		
		System.out.print("Tamanho em metros da área a ser pintada: ");
		double area = en.nextDouble();
		double litros = area / 3;
		int qlatas = (int) Math.ceil(litros / 18);
		double preco = qlatas * 80.0;
		
		System.out.printf("Área a ser pintada: %.2f m²%n", area);
		System.out.printf("Litros necessários: %.2f L%n", litros);
		System.out.println("Quantidade de latas: " + qlatas);
		System.out.printf("Preço total: R$ %.2f%n", preco);
		
		en.close();
	}
}
