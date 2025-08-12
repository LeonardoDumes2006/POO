package Lista2;
import java.util.Scanner;

public class Atividade5 {
	public static void main(String[] args) {
		/*
		 * 5. Faça um Programa que verifique se uma letra digitada é vogal.
		 */
		
		Scanner en = new Scanner(System.in);
		
		System.out.print("Informe uma letra: ");
		String letra = en.nextLine();
		String retorno = "";
		
		if(letra.equals("a") | letra.equals("e") | letra.equals("i") |
				letra.equals("o") | letra.equals("u")) {
			retorno = "vogal";
			
		}else 
			retorno = "consoante";
		
		
		System.out.println("A letra é  " + retorno);
	}
}
