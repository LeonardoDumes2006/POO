

import java.util.*;
import java.io.*;

public class Atividade18 {
    public static void main(String[] args) throws IOException {
    	/*
    	3. Utilizando a estrutura de matriz, faça um programa que para um colégio que tem N (deve
    	ser informado no início do programa) alunos e estes são avaliados em duas provas. O
    	programa deve permitir digitação do nome do aluno e das duas notas e após isto mostrar as
    	seguintes informações:
    	• Nome e as duas Notas de cada aluno;
    	• A média de cada aluno;
    	• A maior e menor nota (nome do aluno junto);
    	• A maior e menor média (nome do aluno junto);
    	• A média geral da turma;
    	• O nome dos alunos acima e abaixo da Media Geral da Turma;
    	Permitir gravar e ler estes dados de um arquivo.
    	*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] nomes = new String[n];
        double[][] notas = new double[n][2];
        double[] medias = new double[n];
        double somaMedias = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome do aluno " + (i+1) + ": ");
            nomes[i] = sc.nextLine();
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite a nota " + (j+1) + " de " + nomes[i] + ": ");
                notas[i][j] = sc.nextDouble();
            }
            sc.nextLine();
            medias[i] = (notas[i][0] + notas[i][1]) / 2;
            somaMedias += medias[i];
        }
        
        double mediaGeral = somaMedias / n;
        
        double maiorNota = notas[0][0], menorNota = notas[0][0];
        String alunoMaiorNota = nomes[0], alunoMenorNota = nomes[0];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                if (notas[i][j] > maiorNota) {
                    maiorNota = notas[i][j];
                    alunoMaiorNota = nomes[i];
                }
                if (notas[i][j] < menorNota) {
                    menorNota = notas[i][j];
                    alunoMenorNota = nomes[i];
                }
            }
        }
        
        double maiorMedia = medias[0], menorMedia = medias[0];
        String alunoMaiorMedia = nomes[0], alunoMenorMedia = nomes[0];
        
        for (int i = 0; i < n; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                alunoMaiorMedia = nomes[i];
            }
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                alunoMenorMedia = nomes[i];
            }
        }
        
        try (PrintWriter writer = new PrintWriter(new FileWriter("alunos.txt"))) {
            for (int i = 0; i < n; i++) {
                writer.println("Aluno: " + nomes[i] + " - Nota1: " + notas[i][0] + " Nota2: " + notas[i][1] + " Média: " + medias[i]);
            }
            writer.println("Maior nota: " + maiorNota + " - Aluno: " + alunoMaiorNota);
            writer.println("Menor nota: " + menorNota + " - Aluno: " + alunoMenorNota);
            writer.println("Maior média: " + maiorMedia + " - Aluno: " + alunoMaiorMedia);
            writer.println("Menor média: " + menorMedia + " - Aluno: " + alunoMenorMedia);
            writer.println("Média geral da turma: " + mediaGeral);
            writer.println("Acima da média geral:");
            for (int i = 0; i < n; i++) {
                if (medias[i] > mediaGeral) writer.println(nomes[i] + " - Média: " + medias[i]);
            }
            writer.println("Abaixo da média geral:");
            for (int i = 0; i < n; i++) {
                if (medias[i] < mediaGeral) writer.println(nomes[i] + " - Média: " + medias[i]);
            }
        }
        
        try (Scanner leitor = new Scanner(new File("alunos.txt"))) {
            while (leitor.hasNextLine()) {
                System.out.println(leitor.nextLine());
            }
        }
        
        sc.close();
    }
}
