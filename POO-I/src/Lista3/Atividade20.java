package Lista3;
import java.util.Scanner;

public class Atividade20 {
	public static void main(String[] args) {
		/*
		 * 20. Faça um programa que calcule e mostre a média aritmética de N notas.
		 */
		Scanner en = new Scanner(System.in);
		System.out.println("Quantidade de notas");
		int qn = en.nextInt();
		double somanota = 0;
		double nota = 0;
		
		for(int i = 1; i <= qn ; i++) {
			System.out.println("Digite a nota " + i + " : ");
			nota = en.nextFloat();
			somanota += nota;
		}
		double media = somanota / qn;
		System.out.println("A média é : " + media);
		
		en.close();
	}
}
