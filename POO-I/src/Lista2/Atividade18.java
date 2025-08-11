package Lista2;
import java.util.Scanner;

public class Atividade18 {
	public static void main(String[] args) {
		/*
		 * 18.Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se
			os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo
			é: equilátero, isósceles ou escaleno.
			Dicas:
			Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o
			terceiro;
			Triângulo Equilátero: três lados iguais;
			Triângulo Isósceles: quaisquer dois lados iguais;
			Triângulo Escaleno: três lados diferentes;
		 */
		Scanner en = new Scanner(System.in);

		System.out.print("Informe o lado 1 : ");
		int lado1 = en.nextInt();
		System.out.print("Informe o lado 2 : ");
		int lado2 = en.nextInt();
		System.out.print("Informe o lado 3 : ");
		int lado3 = en.nextInt();
		
		int soma1 = 0;
		int soma2= 0;
		int soma3 = 0;
		
		soma1 = lado1 + lado2;
		soma2 = lado1 + lado3;
		soma3 = lado2 + lado3;
		
		if (soma1 > lado3 ||  soma2 > lado2 || soma3 > lado1 ) {
			if(lado1 == lado2 && lado2 == lado3) {
				System.out.println("Trinângulo é Equilátero");
			}else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3 ) {
				System.out.println("Triângulo é Escaleno");
			}else 
				System.out.println("Triângulo é Isóceles");
		}else
			System.out.println("Os lados informados não formam um triângulo");
		
	}
}
