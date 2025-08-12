package Lista2;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        /*
         * 4. Faça um Programa que peça para entrar com um ano com 4 dígitos
         * e determine se o mesmo é ou não bissexto.
         */

        Scanner en = new Scanner(System.in);

        System.out.print("Digite um ano com 4 dígitos: ");
        int ano = en.nextInt();

        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (bissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        en.close();
    }
}
