package Lista4;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		/*
		 * 4. Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram
			lidas. Imprima as consoantes.
		 */
		Scanner en = new Scanner(System.in);
		
		String[] letras = new String[10];
		String[] consoante = new String[10];
		int cont = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite uma letra");
			letras[i] = en.nextLine();
			if(letras[i].equals("a") || letras[i].equals("e") || letras[i].equals("i") || 
					letras[i].equals("o") || letras[i].equals("u") ) {
				consoante[i] = " ";
				
			}else {
				consoante[i] = letras[i];
				cont++;
			}
		}
		
		System.out.println("Tem " + cont + " consoantes");
		
		for(int i = 0; i < 10; i++) {
			if(!consoante[i].equals(" ")) {
				System.out.println(consoante[i]);
			}
		}
		en.close();
	}
}
