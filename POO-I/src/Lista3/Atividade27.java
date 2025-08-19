package Lista3;
import java.util.Scanner;

public class Atividade27 {
    public static void main(String[] args) {
        /*
         * 27. Programa que implementa uma caixa registradora simples.
         * Recebe valores de produtos até o operador digitar 0.
         * Depois mostra total, recebe dinheiro e calcula troco.
         * Repete até o operador encerrar.
         */

        Scanner en = new Scanner(System.in);

        while (true) {
            double total = 0.0;
            int contador = 1;

            System.out.println("\nLojas Tabajara");
            while (true) {
                System.out.print("Produto " + contador + ": R$ ");
                double preco = en.nextDouble();

                if (preco == 0) {
                    break; 
                }

                total += preco;
                contador++;
            }

            System.out.printf("Total: R$ %.2f%n", total);

            System.out.print("Dinheiro: R$ ");
            double dinheiro = en.nextDouble();

            double troco = dinheiro - total;
            System.out.printf("Troco: R$ %.2f%n", troco);

            System.out.print("\nDeseja registrar outra compra? (s/n): ");
            String resposta = en.next();

            if (resposta.equalsIgnoreCase("n")) {
                System.out.println("Caixa encerrada. Até logo!");
                break;
            }
        }
        en.close();
    }
}
