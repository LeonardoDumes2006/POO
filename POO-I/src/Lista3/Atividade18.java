package Lista3;

import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        /*
         * 18. Altere o programa de cálculo dos números primos, informando, caso o número não seja
         * primo, por quais números ele é divisível.
         */
        Scanner en = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = en.nextInt();
        
        int contador = 0; 
        String divisores = ""; 

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
                divisores += i + " "; 
            }
        }

        if (contador == 2) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
            System.out.println("Divisível por: " + divisores);
        }
        en.close();
    }
}
