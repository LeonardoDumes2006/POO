package Lista1_POO.televisor;

import java.util.Scanner;

public class TelevisorMain {
    public static void main(String[] args) {
        /*
         * 10. Faça um programa que simule um televisor criando-o como um objeto.
         * O usuário deveria ser capaz de informar o número do canal e aumentar ou
         * diminuir o volume. Certifique-se de que o número do canal e o nível do
         * volume permanecem dentro de faixas válidas.
         */

        Scanner input = new Scanner(System.in);
        
        
        Televisor tv = new Televisor();

        int opcao;

        do {
            System.out.println("\n=== TELEVISOR ===");
            System.out.println(tv);
            System.out.println("1 - Alterar canal");
            System.out.println("2 - Aumentar volume");
            System.out.println("3 - Diminuir volume");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o canal desejado (1 a 100): ");
                    int canal = input.nextInt();
                    tv.setCanal(canal);
                    break;
                case 2:
                    tv.aumentarVolume();
                    break;
                case 3:
                    tv.diminuirVolume();
                    break;
                case 0:
                    System.out.println("Desligando TV...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        input.close();
    }
}
