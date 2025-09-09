package Lista1_POO.Cardapio;
import java.util.Scanner;

public class CardapioMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cardapio cardapio = new Cardapio();
        double totalGeral = 0.0;

        System.out.println("Bem-vindo à Lanchonete!");

        while (true) {

            System.out.print("Digite o código do item (ou 0 para encerrar): ");
            int codigo = input.nextInt();

            if (codigo == 0) {
                break;
            }

            Item item = cardapio.getItem(codigo);

            if (item != null) {
                System.out.print("Quantidade: ");
                int qtd = input.nextInt();

                double subtotal = item.getPreco() * qtd;
                totalGeral += subtotal;

                System.out.printf("Você pediu %d x %s -> R$ %.2f%n",
                                  qtd, item.getNome(), subtotal);
            } else {
                System.out.println("Código inválido. Tente novamente!");
            }
        }

        System.out.printf("%nTotal do pedido: R$ %.2f%n", totalGeral);
        input.close();
    }
}
