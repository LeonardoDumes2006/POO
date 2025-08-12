package Lista1;
import java.util.Scanner;

public class Atividade16 {

	public static void main(String[] args) {
		/*
		 * 16.Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em
			metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro
			para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam
			R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
			o Informe ao usuário as quantidades de tinta a serem compradas e os respectivos
			preços em 2 situações:
			o comprar apenas latas de 18 litros;
			o comprar apenas galões de 3,6 litros;
		 */

		Scanner en = new Scanner(System.in);
		
		System.out.print("Informe a área a ser pintada: ");
		double area = en.nextDouble();
		
		
		double litros = area / 6;
		
		double qlatas = Math.ceil(litros / 18);
		double precolata = qlatas *  80;
		
		double qgaloes = Math.ceil(litros / 3.6);
		double precogaloes = qgaloes * 25;
		
		System.out.println("Quantidade de Latas : " + qlatas);
		System.out.println("Quantidade de Galoes : " + qgaloes);
		System.out.println("Preço das latas : " + precolata);
		System.out.println("Preço dos galões : " + precogaloes);
		
		en.close();
		
		
	}

}
