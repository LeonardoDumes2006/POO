package Lista3;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		/*
		 * 1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor
			seja inválido e continue pedindo até que o usuário informe um valor válido.
		 */
		Scanner en = new Scanner(System.in);
		
		float nota ;
		do {
			
		System.out.print("Informe uma nota ( 0 a 10 ) : ");
		nota = en.nextFloat();
		
		if(nota > 10 || nota < 0 ) {
			System.out.println("Nota inválida");
		}
		
		}while(nota > 10 || nota < 0);
		
		en.close();
	}
}
