package Lista3;

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        /*
         * 16. Faça um programa que, dado um conjunto de N números,
         * determine o menor valor, o maior valor e a soma dos valores.
         */
        
        Scanner en = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int n = en.nextInt();

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite um número: ");
            int num = en.nextInt();

            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }

            soma += num; 
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A soma dos números é: " + soma);

        en.close();
    }
}
