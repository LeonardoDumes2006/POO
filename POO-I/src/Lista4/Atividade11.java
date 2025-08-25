package Lista4;
import java.util.*;

public class Atividade11 {
	public static void main(String[] args) {
		/*
		 * 11. Faça um programa que tenha como entrada várias palavras separadas por ;
(rodrigo;curvello;antonio;....) separe as palavras e coloque cada uma em uma posição do
vetor
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Digite várias palavras sepadas por ponto e virgula");
		String palavra = input.nextLine();
		String[] palavras = palavra.split(";");
		for(int i = 0; i < palavras.length ; i++) {
			System.out.println(palavras[i]);
		}
		input.close();
	}
}
