package Lista3;
import java.util.Scanner;
public class Atividade21 {
	public static void main(String[] args) {
		/*
		 * 21. Faça um programa que peça para n pessoas a sua idade, ao final o programa devera
			verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então,
			dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
		 */
		Scanner en = new Scanner(System.in);
		
		System.out.println("Número de pessoas");
		int n = en.nextInt();
		
		int soma = 0;
		for(int i = 1; i <= n ; i++) {
			System.out.println("Digite sua idade");
			int idade = en.nextInt();
			soma += idade;
			
		}
		
		double media = soma / n;
		if(media < 25) {
			System.out.println("Turma jovem");
		}else if(media >= 25 || media <= 60) {
			System.out.println("Turma adulta");
		}else
			System.out.println("Turma idosa");
		en.close();
	}
}
