package Lista1_POO.bombacombustivel;

import java.util.Scanner;

public class BombaCombustivelMain {
    public static void main(String[] args) {
        /*
         * 11. Faça um programa completo utilizando classes e métodos que:
         * a. Possua uma classe chamada BombaCombustivel, com no mínimo esses atributos:
         *    - tipoCombustivel
         *    - valorLitro
         *    - quantidadeCombustivel
         * b. Possua no mínimo esses métodos:
         *    - abastecerPorValor(): informado o valor e mostra a quantidade de litros
         *    - abastecerPorLitro(): informado litros e mostra o valor a pagar
         *    - alterarValor(): altera o valor do litro
         *    - alterarCombustivel(): altera o tipo de combustível
         *    - alterarQuantidadeCombustivel(): altera a quantidade restante
         * OBS: Sempre que acontecer um abastecimento, atualize a quantidade total da bomba.
         */

        Scanner input = new Scanner(System.in);

        // Criando bomba inicial
        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 6.50, 500);

        int opcao;
        do {
            System.out.println("\n=== BOMBA DE COMBUSTÍVEL ===");
            System.out.println(bomba);
            System.out.println("1 - Abastecer por valor");
            System.out.println("2 - Abastecer por litros");
            System.out.println("3 - Alterar valor do litro");
            System.out.println("4 - Alterar tipo de combustível");
            System.out.println("5 - Alterar quantidade de combustível na bomba");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = input.nextInt();
            input.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a abastecer: R$ ");
                    double valor = input.nextDouble();
                    bomba.abastecerPorValor(valor);
                    break;
                case 2:
                    System.out.print("Digite a quantidade de litros: ");
                    double litros = input.nextDouble();
                    bomba.abastecerPorLitro(litros);
                    break;
                case 3:
                    System.out.print("Digite o novo valor do litro: R$ ");
                    double novoValor = input.nextDouble();
                    bomba.alterarValor(novoValor);
                    break;
                case 4:
                    System.out.print("Digite o novo tipo de combustível: ");
                    String novoTipo = input.next();
                    bomba.alterarCombustivel(novoTipo);
                    break;
                case 5:
                    System.out.print("Digite a nova quantidade de combustível na bomba: ");
                    double novaQtd = input.nextDouble();
                    bomba.alterarQuantidadeCombustivel(novaQtd);
                    break;
                case 0:
                    System.out.println("Encerrando sistema da bomba...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        input.close();
    }
}
