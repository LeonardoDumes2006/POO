package Lista4;
import java.util.*;

public class Atividade12 {
	public static void main(String[] args) {
		/*
		 * 12. Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no
seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida. Mostrar
também idade e altura do mais velho, mais novo, mais baixo e mais alto. Mostrar idade e
altura de quem está abaixo e acima da média de idade e altura;
		 */
		Scanner input = new Scanner(System.in);
		int[] idade = new int[5];
		float[] altura = new float[5];
		int somaIdade = 0;
		float somaAltura = 0;
		
		for(int i = 0; i < 5 ; i++) {
			System.out.println("Idade da pessoa " + (i+1));
			idade[i] = input.nextInt();
			somaIdade += idade[i];
			System.out.println("Altura da pessoa " + (i+1));
			altura[i] = input.nextFloat();
			somaAltura += idade[i];
		}
		int maisVelho = idade[0];
		int maisNovo = idade[0];
		float maisAlto = altura[0];
		float maisBaixo = altura[0];
		double mediaIdade = somaIdade / 5;
		double mediaAltura = somaAltura /  5;
		
		System.out.println("\nIdade inversa");
		for(int i = 4; i >= 0; i--) {
			if(idade[i] > maisVelho) {
				maisVelho = idade[i];
			}
			if(idade[i] < maisNovo) {
				maisNovo = idade[i];
			}
			System.out.print(idade[i] + " ");
		}
		
		System.out.println("\nAltura inversa");
		for(int i = 4; i >= 0; i--) {
			if(altura[i] > maisAlto) {
				maisAlto = altura[i];
			}
			if(altura[i] < maisBaixo) {
				maisBaixo = altura[i];
			}
			System.out.print(altura[i] + " ");
		}
		System.out.println("Mais novo: " + maisNovo);
		System.out.println("Mais velho: " + maisVelho);
		System.out.println("Mais baixo: " + maisBaixo);
		System.out.println("Mais alto: " + maisAlto);
		System.out.println("Média Idade: " + mediaIdade);
		System.out.println("Média altura: " + mediaAltura);
		
		System.out.println("Mostrar idade de quem está acima da média");
		for(int i = 0; i < 5; i++) {
			if(idade[i] > mediaIdade ) {
				System.out.println(idade[i]);
			}
		}
		System.out.println("Mostrar idade de quem está abaixo da média");
		for(int i = 0; i < 5; i++) {
			if(idade[i] < mediaIdade ) {
				System.out.println(idade[i]);
			}
		}
		System.out.println("Mostrar altura de quem está acima da média");
		for(int i = 0; i < 5; i++) {
			if(altura[i] > mediaAltura ) {
				System.out.println(altura[i]);
			}
		}
		System.out.println("Mostrar altura de quem está abaixo da média");
		for(int i = 0; i < 5; i++) {
			if(altura[i] < mediaAltura ) {
				System.out.println(altura[i]);
			}
		}
		input.close();
	}
}
