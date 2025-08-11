package Lista1;
import java.util.Scanner;

public class atividade10 {

	public static void main(String[] args) {
		//10. Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
		// a. o produto do dobro do primeiro com metade do segundo .
		// b. a soma do triplo do primeiro com o terceiro.
		// c. o terceiro elevado ao cubo.
		
		Scanner en = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int num1 = en.nextInt();
		
		System.out.println("Digite um número inteiro: ");
		int num2 = en.nextInt();
		
		System.out.println("Digite um número real: ");
		float num3 = en.nextFloat();
		
		double a = ( num1 * 2 ) * ( num2 / 2 );
		double b = ( num1 * 3 ) + ( num3 );
		double c = Math.pow( num3 , 3);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo é : " + a );
		System.out.println("A soma do triplo do primeiro com o terceiro é : " + b);
		System.out.println("O terceiro elevado ao cubo é : " + c);
		
		en.close();
	}

}
