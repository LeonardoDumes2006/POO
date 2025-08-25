package Lista4;
import java.util.*;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[20];

        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vet1[i] = input.nextInt();
        }

        System.out.println("Digite 10 números para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vet2[i] = input.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                vet3[i] = vet1[i / 2];
            } else {
                vet3[i] = vet2[i / 2];
            }
        }

        System.out.println("\nVetor intercalado:");
        for (int num : vet3) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
