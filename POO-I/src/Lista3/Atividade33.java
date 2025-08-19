package Lista3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade33 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        
        System.out.print("Digite o valor da dívida: R$ ");
        double valorDivida = en.nextDouble();
        
        int[] parcelas = {1, 3, 6, 9, 12};
        double[] jurosPercentual = {0, 10, 15, 20, 25};
        
        System.out.println("\nValor da Dívida\tValor dos Juros\tQuantidade de Parcelas\tValor da Parcela");
        
        for (int i = 0; i < parcelas.length; i++) {
            double juros = valorDivida * jurosPercentual[i] / 100.0;
            double valorTotal = valorDivida + juros;
            double valorParcela = valorTotal / parcelas[i];
            
            System.out.println(
                df.format(valorTotal) + "\t" +
                df.format(juros) + "\t" +
                parcelas[i] + "\t\t\t" +
                df.format(valorParcela)
            );
        }
        
        en.close();
    }
}
