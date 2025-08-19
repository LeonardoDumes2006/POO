package Lista2;
import java.util.Scanner;

public class Atividade33 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        
        char[] gabarito = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e'};
        char[] respostas = new char[10];
        int acertos = 0;
        
        System.out.println("Digite as respostas do candidato (a, b, c, d ou e):");
        
        for(int i = 0; i < 10; i++) {
            System.out.printf("Questão %d: ", i+1);
            respostas[i] = en.next().charAt(0);
        }
        
        for(int i = 0; i < 10; i++) {
            System.out.printf("Q%d: %c : ", i+1, respostas[i]);
            if(respostas[i] == gabarito[i]) {
                System.out.println("Correto");
                acertos++;
            } else {
                System.out.printf("Errada, resposta correta (%c)%n", gabarito[i]);
            }
        }
        
        System.out.printf("\nTotal de acertos: %d/10%n", acertos);
        en.close();
    }
}