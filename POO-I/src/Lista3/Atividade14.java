package Lista3;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        /*
         * 14. Faça um programa que mostre os n termos da Série a seguir:
         * S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
         */
        
        Scanner en = new Scanner(System.in);
        System.out.print("Digite a quantidade de termos da sequência: ");
        int n = en.nextInt();
        
        double soma = 0; 
        System.out.print("S = ");
        
        for (int i = 1; i <= n; i++) {
            int m = 2 * i - 1; 
            soma += (double) i / m;
            
            if (i == n) {
                System.out.print(i + "/" + m);
            } else {
                System.out.print(i + "/" + m + " + ");
            }
        }
        
        System.out.println("\n Resultado da soma da série com " + n + " termos = " + soma);
        
        en.close();
    }
}
