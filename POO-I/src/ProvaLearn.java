import java.util.*;
import java.io.*;

public class ProvaLearn {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		int soma = 0;
		int maior ;
		int menor ;
		do {
			System.out.println("Digite um número");
			num = input.nextInt();
			if(num < 3) {
				System.out.println("O valor de n deve ser maior ou igual a 3");
			}else {
				int[] vet = new int[num];
				
				vet[0] = 1;
				vet[1] = 1;
				maior = vet[0];
				menor = vet[0];
				
				for(int i = 2; i < num; i++) {
					vet[i] = vet[i-2] + vet[i-1];
				}
				for(int i = 0; i < num; i++) {
					System.out.print(vet[i] + " ");
					soma += vet[i];
					if(vet[i] > maior) {
						maior = vet[i];
					}
					if(vet[i] < menor) {
						menor = vet[i];
					}
				}
				double media = soma / num;
				System.out.println("O somatório é : " + soma);
				System.out.println("O maior valor é : " + maior);
				System.out.println("O menor valor é : " + menor);
				
			}
			
		}while(num < 3);
		
		input.close();
	}
}
