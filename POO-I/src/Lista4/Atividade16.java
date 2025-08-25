package Lista4;
import java.util.*;

public class Atividade16 {
	public static void main(String[] args) {
		/*
		 * 1. Faça um programa que peça ao usuário um valor inteiro impar entre 3 e 11 (inclusive 3 e
	11, valide esta entrada), após isto crie uma matriz quadrada (inteiros) do tamanho do número
	informado pelo usuário. Permita que o usuário informe os valores para cada uma das
	posições da matriz. Após isto calcula e mostre as seguintes informações sobre a matriz:
	• Soma dos elementos;
	• Média dos elementos (duas casas decimais);
	• Maior valor;
	• Menor valor;
	• Contador de pares;
	• Contador de ímpares;
	• Soma da diagonal principal;
	• Soma da diagonal secundária;
	• Mostrar a Matriz (formatada);
	Permitir gravar e ler estes dados de um arquivo.
		 */
		Scanner input = new Scanner(System.in);
		int num ;
		
		do {
			System.out.println("Digite um número impar");
			num = input.nextInt();
			if(num % 2 == 0) {
				System.out.println("Erro : Número informado deve ser par");
			}
			if(num < 3 || num > 11 ) {
				System.out.println("Erro: Número informado deve ser entre 3 e 11");
			}
		}while( num % 2 == 0 || num < 3 || num > 11 );
		
		int somaDP = 0;
		int soma = 0;
		int[][] mat = new int[num][num];
		int pares = 0;
		int impares =0;
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num ; j++) {
				System.out.println("Digite um número para linha " + (i+1) +" e coluna " + (j+1));
				mat[i][j] = input.nextInt();
				soma += mat[i][j];
				if(mat[i][j] % 2 == 0 ) {
					pares++;
				}else 
					impares++;
			}
		}
		int maior = mat[0][0];
		int menor = mat[0][0];
		double media = soma / (num*num);
		
		int somaDS = 0; // diagonal secundária

		for(int i = 0; i < num; i++) {
		    for(int j = 0; j < num; j++) {
		        if(i == j) { // diagonal principal
		            somaDP += mat[i][j];
		        }
		        if(i + j == num - 1) { // diagonal secundária
		            somaDS += mat[i][j];
		        }
		    }
		}
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				if(mat[i][j] > maior) {
					maior = mat[i][j];
				}
				if(mat[i][j] < menor) {
					menor = mat[i][j];
				}
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("\nA soma dos elementos é : " + soma);
		System.out.println("A média é " + media);
		System.out.println("O maior número é " + maior);
		System.out.println("O menor número é " + menor);
		System.out.println("A soma da diagonal principal é : " + somaDP);
		System.out.println("A soma da diagonal secundária é: " + somaDS);
		
		input.close();
	}
}
