package Lista2;
import java.util.Scanner;

public class Atividade11 {
	public static void main(String[] args) {
		/*
		 * 11.Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-
		Matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa
		
		Tarde!" ou "Boa Noite!" , conforme o caso.
		
		 */
		
		Scanner en = new Scanner(System.in);
		
		System.out.print("Informe o turno que você estuda, apenas com a primeira letra: ");
		String letra = en.nextLine();
		
		if(letra.equals("M")) {
			System.out.println("Bom dia!");
		}else if(letra.equals("V")) {
			System.out.println("Boa Tarde!");
		}else 
			System.out.println("Boa noite!");
		
		switch(letra) {
        case "M":
            System.out.println("Bom Dia!");
            break;
        case "V":
            System.out.println("Boa Tarde!");
            break;
        case "N":
            System.out.println("Boa Noite!");
            break;
        default:
            System.out.println("Turno inválido! Digite M, V ou N.");
    
		}
		
		en.close();
	}
}
