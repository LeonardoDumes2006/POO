package Lista4;
import java.util.*;
import java.io.*; 

public class Atividade16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        do {
            System.out.println("Digite um número ímpar entre 3 e 11:");
            num = input.nextInt();
            if(num % 2 == 0) {
                System.out.println("Erro: Número informado deve ser ímpar");
            }
            if(num < 3 || num > 11) {
                System.out.println("Erro: Número informado deve ser entre 3 e 11");
            }
        } while(num % 2 == 0 || num < 3 || num > 11);
        
        int[][] mat = new int[num][num];
        int soma = 0, pares = 0, impares = 0;
        
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num ; j++) {
                System.out.println("Digite um número para linha " + (i+1) +" e coluna " + (j+1));
                mat[i][j] = input.nextInt();
                soma += mat[i][j];
                if(mat[i][j] % 2 == 0) pares++;
                else impares++;
            }
        }
        
        int maior = mat[0][0];
        int menor = mat[0][0];
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if(mat[i][j] > maior) maior = mat[i][j];
                if(mat[i][j] < menor) menor = mat[i][j];
            }
        }
        
        double media = (double) soma / (num * num);
        
        int somaDP = 0, somaDS = 0;
        for(int i = 0; i < num; i++) {
            somaDP += mat[i][i];              
            somaDS += mat[i][num - 1 - i];    
        }
        
        System.out.println("\nMatriz:");
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
        try {
            FileWriter fw = new FileWriter("resultado.txt");
            PrintWriter pw = new PrintWriter(fw);

            pw.println("Soma dos elementos: " + soma);
            pw.println("Média: " + String.format("%.2f", media));
            pw.println("Maior valor: " + maior);
            pw.println("Menor valor: " + menor);
            pw.println("Quantidade de pares: " + pares);
            pw.println("Quantidade de ímpares: " + impares);
            pw.println("Soma da diagonal principal: " + somaDP);
            pw.println("Soma da diagonal secundária: " + somaDS);
            
            pw.println("\nMatriz:");
            for(int i = 0; i < num; i++) {
                for(int j = 0; j < num; j++) {
                    pw.print(mat[i][j] + " ");
                }
                pw.println();
            }
            
            pw.close();
            System.out.println("\nResultados gravados em resultado.txt");
        } catch (IOException e) {
            System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
        }

        System.out.println("\nLendo dados do arquivo:");
        try {
            BufferedReader br = new BufferedReader(new FileReader("resultado.txt"));
            String linha;
            while((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        input.close();
    }
}
