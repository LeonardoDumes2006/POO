package Lista3;
import java.util.Scanner;
public class Atividade8 {
	public static void main(String[] args) {
		/*
		 * 8. Altere o programa anterior para mostrar no final a soma dos números.
		 */
		Scanner en = new Scanner(System.in);
		System.out.println("Digite um número inteiro :");
		int num1 = en.nextInt();
		System.out.println("Digite outro número inteiro");
		int num2 = en.nextInt();
		int soma = 0;
		System.out.println("Número de " + num1 + " a " + num2 +" : ");
		for(int i = num1 ; i <= num2 ; i++) {
			System.out.print(i + " ");
			soma += i ;
		}
		System.out.println("A soma de todos números é : " + soma);
		en.close();
	}
}
