package Lista3;

import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        /*
         * 19. Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro
         * fornecido pelo usuário. O programa deverá mostrar também o número de divisões que ele
         * executou para encontrar os números primos.
         */
        Scanner en = new Scanner(System.in);
        System.out.print("Digite um número N: ");
        int N = en.nextInt();

        int totalDivisoes = 0;

        System.out.println("Números primos entre 1 e " + N + ":");
        for (int num = 2; num <= N; num++) { 
            int contador = 0;

            for (int i = 1; i <= num; i++) {
                totalDivisoes++; 
                if (num % i == 0) {
                    contador++;
                }
            }

            if (contador == 2) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nTotal de divisões " + totalDivisoes);
        en.close();
    }
}
