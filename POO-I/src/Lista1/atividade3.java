package Lista1;
import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		//3. Faça um Programa que peça dois números e imprima a soma.
		
		Scanner en = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int num1 = en.nextInt();
		
		System.out.print("Informe um número: ");
		int num2 = en.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("A soma é :  " + soma);
		
		en.close();
	}
}
