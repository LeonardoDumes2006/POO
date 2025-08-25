import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int TAM = 2;
		int[][] matriz = new int [TAM][TAM];
		int soma = 0;
		int maior = 0;
		int menor = 0;
		
		for(int i = 0; i < 2 ; i++) {
			for( int j = 0; j < 2; j++) {
				System.out.println("Digite um número para a matriz:");
				matriz[i][j] = scanner.nextInt();
				soma += matriz[i][j];
				
				if( i == 0 && j == 0) {
					
				}
			}
		}
		for(int i = 0; i < 2 ; i++) {
			for( int j = 0; j < 2; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}
		scanner.close();
	}
}
