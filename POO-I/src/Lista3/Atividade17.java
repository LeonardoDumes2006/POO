package Lista3;

import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        /*
         * 17. Faça um programa que peça um número inteiro e determine se ele é ou não um número
         * primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1.
         */
        Scanner en = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = en.nextInt();
        
        int contador = 0; 
        

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) { 
                contador++;
            }
        }

        if (contador == 2) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
        en.close();
    }
}
