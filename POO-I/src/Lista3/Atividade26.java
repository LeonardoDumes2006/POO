package Lista3;

import java.util.Scanner;

public class Atividade26 {
    public static void main(String[] args) {
        /*
         * 26. Programa que monta a tabela de preços de pães (1 até 50 pães),
         * com base no preço informado pelo usuário.
         */

        Scanner en = new Scanner(System.in);

        System.out.print("Informe o preço do pão: R$ ");
        double precoPao = en.nextDouble();
        
        System.out.println("\nPanificadora Pão de Ontem - Tabela de preços");
        for (int i = 1; i <= 50; i++) {
            double total = i * precoPao;
            System.out.printf("%d - R$ %.2f%n", i, total);
        }
        en.close();
    }
}
