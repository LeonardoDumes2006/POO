package Lista1;
import java.util.Scanner;

public class atividade9 {

	public static void main(String[] args) {
		//9. Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a
		// temperatura em graus Celsius.
		// C = (5 * (F-32) / 9) / C = (F – 32) / 1,8
		
		Scanner en = new Scanner(System.in);
		
		System.out.println("Informe temperatura em Farenheit: ");
		int fah = en.nextInt();
		
		float cel = ( 5 * ( fah - 32 ) / 9 );
		
		System.out.print("Sua temperatura em Celsius é: " + cel);
		
		en.close();
		
	}

}
