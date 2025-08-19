package Lista3;

import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        /*
         * 24. Faça um programa que calcule o valor total investido por um colecionador em sua
         * coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a
         * quantidade de CDs e o valor para em cada um.
         */
        Scanner en = new Scanner(System.in);

        System.out.print("Informe a quantidade de CDs: ");
        int qtdCds = en.nextInt();

        double total = 0;

        for (int i = 1; i <= qtdCds; i++) {
            System.out.print("Digite o valor do CD " + i + ": R$ ");
            double valorCd = en.nextDouble();
            total += valorCd;
        }

        double media = total / qtdCds;

        System.out.println("\nValor total: R$ " + total);
        System.out.println("Valor médio por CD: R$ " + media);
        en.close();
    }
}
