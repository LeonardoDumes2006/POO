package Lista2;
import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		/*
		 * 3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra
			escrever: F - Feminino, M - Masculino.
		 */
		
		Scanner en = new Scanner(System.in); 
		
		System.out.println("Digite seu genero apenas primeira letra: ");
		String texto = en.nextLine();
		
		String resultado = "";
		if ( texto.equals("F")) {
			resultado = "Feminino";
		}else 
			resultado = "Masculino";
		
		System.out.println("Seu gênero é : " + resultado);
		
	}

}
