package Lista2;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		/*
		 * 2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo, negativo
			ou zero.
		 */
		Scanner en = new Scanner(System.in);
		
		System.out.println("Informe um número : ");
		int num = en.nextInt();
		
		String resultado = "";
		if ( num > 0 ) {
			resultado = "positivo";
		}else if ( num < 0 ) {
			resultado = "negativo";
		}else 
			resultado = "neutro";
		
		System.out.println("O número é : " + resultado);
		
		en.close();

	}

}
