package Lista3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade35 {
    public static void main(String[] args) {
    	/*
    	 * 35. O cardápio de uma lanchonete é o seguinte:
			• Especificação Código Preço
			Cachorro Quente 100 R$ 1,20
			Bauru Simples 101 R$ 1,30
			Bauru com ovo 102 R$ 1,50
			Hambúrguer 103 R$ 1,20
			Cheeseburguer 104 R$ 1,30
			Refrigerante 105 R$ 1,00
			
			Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e
			mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido. Considere
			que o cliente deve informar quando o pedido deve ser encerrado.
    	 */
        Scanner en = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        
        int codigo;
        int quantidade;
        double totalGeral = 0;
        
        System.out.println("Cardápio:");
        System.out.println("100 - Cachorro Quente - R$ 1,20");
        System.out.println("101 - Bauru Simples - R$ 1,30");
        System.out.println("102 - Bauru com ovo - R$ 1,50");
        System.out.println("103 - Hambúrguer - R$ 1,20");
        System.out.println("104 - Cheeseburguer - R$ 1,30");
        System.out.println("105 - Refrigerante - R$ 1,00");
        System.out.println("Digite 0 para encerrar o pedido.\n");
        
        while (true) {
            System.out.print("Digite o código do item: ");
            codigo = en.nextInt();
            
            if (codigo == 0) {
                break; 
            }
            
            System.out.print("Digite a quantidade: ");
            quantidade = en.nextInt();
            
            double precoItem = 0;
            String nomeItem = "";
            
            switch (codigo) {
                case 100:
                    precoItem = 1.20;
                    nomeItem = "Cachorro Quente";
                    break;
                case 101:
                    precoItem = 1.30;
                    nomeItem = "Bauru Simples";
                    break;
                case 102:
                    precoItem = 1.50;
                    nomeItem = "Bauru com ovo";
                    break;
                case 103:
                    precoItem = 1.20;
                    nomeItem = "Hambúrguer";
                    break;
                case 104:
                    precoItem = 1.30;
                    nomeItem = "Cheeseburguer";
                    break;
                case 105:
                    precoItem = 1.00;
                    nomeItem = "Refrigerante";
                    break;
                default:
                    System.out.println("Código inválido! Tente novamente.\n");
                    continue;
            }
            
            double totalItem = precoItem * quantidade;
            totalGeral += totalItem;
            
            System.out.println(nomeItem + " - Quantidade: " + quantidade + " - Total: " + df.format(totalItem) + "\n");
        }
        
        System.out.println("Valor total do pedido: " + df.format(totalGeral));
        en.close();
    }
}
