package Lista2;
import java.util.Scanner;

public class Atividade32 {
    public static void main(String[] args) {
    	/*
    	 * 32. O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
			Até 5 Kg Acima de 5 Kg
			File Duplo R$ 4,90 por Kg R$ 5,80 por Kg
			Alcatra R$ 5,90 por Kg R$ 6,80 por Kg
			Picanha R$ 6,90 por Kg R$ 7,80 por Kg
			
			Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos
			de carne da promoção, porém não há limites para a quantidade de carne por
			cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um
			desconto de 5% sobre o total a compra. Escreva um programa que peça o tipo e
			a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo
			as informações da compra: tipo e quantidade de carne, preço total, tipo de
			pagamento, valor do desconto e valor a pagar.
    	 */
        Scanner en = new Scanner(System.in);
        
        System.out.println("Tipos de carne disponíveis:");
        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        System.out.print("Escolha o tipo de carne (1-3): ");
        int tipoCarne = en.nextInt();
        
        System.out.print("Digite a quantidade (em Kg): ");
        double quantidade = en.nextDouble();
        
        System.out.print("Pagamento com cartão Tabajara? (S/N): ");
        char cartao = en.next().charAt(0);
        
        String nomeCarne = "";
        double precoPorKg;
        double precoTotal;
        double desconto = 0;
        
        switch(tipoCarne) {
            case 1:
                nomeCarne = "Filé Duplo";
                precoPorKg = (quantidade <= 5) ? 4.90 : 5.80;
                break;
            case 2:
                nomeCarne = "Alcatra";
                precoPorKg = (quantidade <= 5) ? 5.90 : 6.80;
                break;
            case 3:
                nomeCarne = "Picanha";
                precoPorKg = (quantidade <= 5) ? 6.90 : 7.80;
                break;
            default:
                System.out.println("Tipo de carne inválido!");
                en.close();
                return;
        }
        
        precoTotal = quantidade * precoPorKg;
        
        if(cartao == 'S' || cartao == 's') {
            desconto = precoTotal * 0.05;
        }
        
        double valorAPagar = precoTotal - desconto;
        
        System.out.printf("Tipo de carne: %s%n", nomeCarne);
        System.out.printf("Quantidade: %.2f Kg%n", quantidade);
        System.out.printf("Preço total: R$ %.2f%n", precoTotal);
        System.out.printf("Tipo de pagamento: %s%n", 
                         (cartao == 'S' || cartao == 's') ? "Cartão Tabajara" : "Outro");
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor a pagar: R$ %.2f%n", valorAPagar);
        
        en.close();
    }
}