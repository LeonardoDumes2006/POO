package Lista4;
import java.util.*;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final int N = 3; 
        int[] vet = new int[N];
        
        for(int i = 0; i < N; i++) {
            int num;
            do {
                System.out.println("Digite um número entre 0 e 20 para o índice " + (i+1) + ":");
                num = input.nextInt();
                if(num < 0 || num > 20) {
                    System.out.println("Valor inválido! Tente novamente.");
                }
            } while(num < 0 || num > 20);
            vet[i] = num;
        }
        
        System.out.println("\nGráfico:");
        for(int i = 0; i < N; i++) {
            String hashtag = "";
            for(int j = 0; j < vet[i]; j++) {
                hashtag += "#"; 
            }
            System.out.println(vet[i] + ": " + hashtag);
        }
        
        input.close();
    }
}
