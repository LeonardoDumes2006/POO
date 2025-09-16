package Lista1_POO.banco;

import java.util.Scanner;

public class BancoMain {
    public static void main(String[] args) {
        /*
         * 8. Crie uma classe para implementar um sistema bancário básico, ele deve conter:
         * Atributos:
         *   - número da conta;
         *   - nome;
         *   - saldo;
         * Métodos:
         *   - incluir conta;
         *   - alterar nome;
         *   - depósito;
         *   - saque;
         *   - deve existir métodos para validar os métodos acima;
         *   - crie um construtor para padronizar os parâmetros iniciais na criação do objeto;
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = input.nextInt();
        input.nextLine(); 

        System.out.print("Digite o nome do titular: ");
        String nome = input.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = input.nextDouble();

        Banco conta = new Banco(numero, nome, saldoInicial);

        int opcao;
        do {
            System.out.println("\n=== BANCO ===");
            System.out.println(conta);
            System.out.println("1 - Alterar nome");
            System.out.println("2 - Depósito");
            System.out.println("3 - Saque");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = input.nextInt();
            input.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o novo nome: ");
                    String novoNome = input.nextLine();
                    conta.setNome(novoNome);
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDep = input.nextDouble();
                    conta.depositar(valorDep);
                    break;
                case 3:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaq = input.nextDouble();
                    conta.sacar(valorSaq);
                    break;
                case 0:
                    System.out.println("Encerrando sistema bancário...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        input.close();
    }
}
