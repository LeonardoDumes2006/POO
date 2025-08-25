package Lista3;
import java.util.Scanner;

public class Atividade37 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        
        char[] gabarito = new char[10];
        System.out.println("Digite o gabarito da prova (10 questões):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Questão " + (i+1) + ": ");
            gabarito[i] = en.next().toUpperCase().charAt(0);
        }
        
        int totalAlunos = 0;
        int maiorAcerto = Integer.MIN_VALUE;
        int menorAcerto = Integer.MAX_VALUE;
        int somaNotas = 0;
        
        String resposta;
        boolean maisAlunos = true;
        
        while (maisAlunos) {
            totalAlunos++;
            int acertos = 0;
            
            System.out.println("\nAluno " + totalAlunos + ", digite suas respostas:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Questão " + (i+1) + ": ");
                resposta = en.next().toUpperCase();
                if (resposta.charAt(0) == gabarito[i]) {
                    acertos++;
                }
            }
            
            System.out.println("Total de acertos: " + acertos + " | Nota: " + acertos + " ponto(s)");
            
            if (acertos > maiorAcerto) maiorAcerto = acertos;
            if (acertos < menorAcerto) menorAcerto = acertos;
            somaNotas += acertos;
            
            System.out.print("Outro aluno vai utilizar o sistema? (S/N): ");
            char resp = en.next().toUpperCase().charAt(0);
            if (resp != 'S') maisAlunos = false;
        }
        
        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.println("Média das notas da turma: " + ((double)somaNotas / totalAlunos));
        
        en.close();
    }
}
