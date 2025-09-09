
import java.util.*;
import java.io.*;

public class Atividade20 {
    public static void main(String[] args) throws IOException {
    	/*
    	5. Criar uma loteria com 6 números de 1 a 60. Solicitar ao usuário quantas cartelas deseja
    	preencher criar uma matriz deste tamanho para armazenar os valores que serão criados
    	aleatoriamente. No final analisar cada uma das cartelas e mostrar ao lado do números (ordenados
    	em ordem crescente e não repetidos dentro da mesma cartela) o total de acertos.
    	Permitir gravar e ler estes dados de um arquivo.
    	*/

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Digite quantas cartelas deseja gerar: ");
        int n = sc.nextInt();

        int[][] cartelas = new int[n][6];
        int[] sorteio = gerarCartela(rand);

        for (int i = 0; i < n; i++) {
            cartelas[i] = gerarCartela(rand);
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter("loteria.txt"))) {
            writer.print("Números sorteados: ");
            for (int num : sorteio) writer.print(num + " ");
            writer.println();

            for (int i = 0; i < n; i++) {
                int acertos = contarAcertos(cartelas[i], sorteio);
                writer.print("Cartela " + (i+1) + ": ");
                for (int j = 0; j < 6; j++) writer.print(cartelas[i][j] + " ");
                writer.println("- Acertos: " + acertos);
            }
        }

        try (Scanner leitor = new Scanner(new File("loteria.txt"))) {
            while (leitor.hasNextLine()) {
                System.out.println(leitor.nextLine());
            }
        }

        sc.close();
    }

    static int[] gerarCartela(Random rand) {
        Set<Integer> numeros = new TreeSet<>();
        while (numeros.size() < 6) {
            numeros.add(rand.nextInt(60) + 1);
        }
        int[] cartela = new int[6];
        int i = 0;
        for (int num : numeros) cartela[i++] = num;
        return cartela;
    }

    static int contarAcertos(int[] cartela, int[] sorteio) {
        int acertos = 0;
        for (int num : cartela) {
            for (int s : sorteio) {
                if (num == s) acertos++;
            }
        }
        return acertos;
        

    }
}
