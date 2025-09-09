import java.util.*;
import java.io.*;

public class Atividade19 {
    public static void main(String[] args) throws IOException {
    	/*
    	4. Nas Olimpíadas do IFC estão ocorrendo várias competições, entre elas salto em
    	distância, nesta competição cada atleta tem direito a cinco saltos, para valorizar o atleta
    	mais constante é feita a média dos saltos, desprezando o pior salto. Você foi contratado para
    	implementar um sistema que fará o controle desta competição, utilizando o recurso de Matriz,
    	resolva os itens abaixo:

    	• Solicitar os cinco saltos de cada atleta;
    	• Após o atleta saltar mostrar a média;
    	• Permitir a utilização do sistema por N atletas (informado no inicio da aplicação);
    	• Ao final, ou seja, após os N atletas digitarem os saltos o programa deve mostrar:
    	• Saltos de cada atleta, seguidos de sua média;
    	• A média dos saltos do campeão e do último lugar;
    	Permitir gravar e ler estes dados de um arquivo.
    	*/
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de atletas: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] nomes = new String[n];
        double[][] saltos = new double[n][5];
        double[] medias = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome do atleta " + (i+1) + ": ");
            nomes[i] = sc.nextLine();
            double soma = 0;
            double menor = Double.MAX_VALUE;
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o salto " + (j+1) + " de " + nomes[i] + ": ");
                saltos[i][j] = sc.nextDouble();
                soma += saltos[i][j];
                if (saltos[i][j] < menor) menor = saltos[i][j];
            }
            sc.nextLine();
            medias[i] = (soma - menor) / 4;
            System.out.println("Média de " + nomes[i] + " (desprezando pior salto): " + medias[i]);
        }
        
        int indiceCampeao = 0;
        int indiceUltimo = 0;
        for (int i = 1; i < n; i++) {
            if (medias[i] > medias[indiceCampeao]) indiceCampeao = i;
            if (medias[i] < medias[indiceUltimo]) indiceUltimo = i;
        }
        
        try (PrintWriter writer = new PrintWriter(new FileWriter("atletas.txt"))) {
            for (int i = 0; i < n; i++) {
                writer.print("Atleta: " + nomes[i] + " - Saltos: ");
                for (int j = 0; j < 5; j++) {
                    writer.print(saltos[i][j] + " ");
                }
                writer.println("- Média: " + medias[i]);
            }
            writer.println("Campeão: " + nomes[indiceCampeao] + " - Média: " + medias[indiceCampeao]);
            writer.println("Último lugar: " + nomes[indiceUltimo] + " - Média: " + medias[indiceUltimo]);
        }
        
        try (Scanner leitor = new Scanner(new File("atletas.txt"))) {
            while (leitor.hasNextLine()) {
                System.out.println(leitor.nextLine());
            }
        }
        
        sc.close();
    }
}
