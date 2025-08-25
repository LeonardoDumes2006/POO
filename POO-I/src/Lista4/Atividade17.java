package Lista4;
import java.util.*;
import java.io.*;

public class Atividade17 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        float[][] mercados = new float[5][5];
        float somaProdutos = 0; 
        float soma = 0;
        float[] somaMercados = new float[5];
        
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.println("Digite o produto " + (j+1) + " do mercado " + (i+1));
                mercados[i][j] = input.nextFloat();
                somaProdutos+= mercados[i][j];
                soma += mercados[i][j];
            }
            somaMercados[i] = soma;
            soma = 0;
        }
        double media = somaProdutos / 25;

        try (PrintWriter writer = new PrintWriter(new FileWriter("supermercados.txt"))) {
            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < 5; j++) {
                    writer.println("Produto " + (j+1) + " do mercado " + (i+1) + ": " + mercados[i][j] + " reais");
                }
            }
            writer.println("Média de preços por produto: " + media);
            
            float maisBarato = somaMercados[0];
            float maisCaro = somaMercados[0];
            for(int i = 0; i < 5; i++) {
                writer.println("Soma de preços do mercado " + (i+1) + ": " + somaMercados[i]);
                if(somaMercados[i] > maisCaro) maisCaro = somaMercados[i];
                if(somaMercados[i] < maisBarato) maisBarato = somaMercados[i];
            }
            writer.println("Supermercado mais barato: " + maisBarato);
            writer.println("Supermercado mais caro: " + maisCaro);
        }

        System.out.println("\n--- Lendo dados do arquivo ---\n");
        try (Scanner leitor = new Scanner(new File("supermercados.txt"))) {
            while (leitor.hasNextLine()) {
                System.out.println(leitor.nextLine());
            }
        }

        input.close();
    }
}
