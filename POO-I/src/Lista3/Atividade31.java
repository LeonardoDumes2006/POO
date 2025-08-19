package Lista3;
import java.util.Scanner;

public class Atividade31 {
    public static void main(String[] args) {
    	/*
    	 * 31. Faça um programa que leia dez conjuntos de dois valores, o primeiro representando o
			número do aluno e o segundo representando a sua altura em centímetros. Encontre o aluno
			mais alto e o mais baixo. Mostre o número do aluno mais alto e o número do aluno mais
			baixo, junto com suas alturas.
    	 */
        Scanner en = new Scanner(System.in);
        
        int numeroAluno;
        int altura;
        
        int alunoMaisAlto = 0;
        int alunoMaisBaixo = 0;
        int maiorAltura = Integer.MIN_VALUE;
        int menorAltura = Integer.MAX_VALUE;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número do aluno " + i + ": ");
            numeroAluno = en.nextInt();
            
            System.out.print("Digite a altura do aluno " + i + " (cm): ");
            altura = en.nextInt();
            
            if (altura > maiorAltura) {
                maiorAltura = altura;
                alunoMaisAlto = numeroAluno;
            }
            
            if (altura < menorAltura) {
                menorAltura = altura;
                alunoMaisBaixo = numeroAluno;
            }
            
            System.out.println();
        }
        
        System.out.println("Aluno mais alto: Número " + alunoMaisAlto + ", Altura: " + maiorAltura + " cm");
        System.out.println("Aluno mais baixo: Número " + alunoMaisBaixo + ", Altura: " + menorAltura + " cm");
        
        en.close();
    }
}
