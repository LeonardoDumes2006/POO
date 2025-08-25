import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int TAM = 5;
		int[] numeros = new int[TAM];
		int soma = 0;
		int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
		
		for ( int i = 0; i < TAM; i++) {
			System.out.print("Digite um numero");
			numeros[i] = scanner.nextInt();
			soma += numeros[i];
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
			if(numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		double media = soma / (float) TAM;
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
		System.out.println("Menor : " + menor);
		System.out.println("Maior : " + maior);
		scanner.close();
	}
}
