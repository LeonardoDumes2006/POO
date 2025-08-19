package Lista3;
import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
    	/*
    	 * 12. A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um
			programa capaz de gerar a série até o n−ésimo termo.
    	 */
        Scanner en = new Scanner(System.in);
        System.out.print("Digite o n-ésimo termo da sequência de Fibonacci: ");
        int num = en.nextInt();
        
        int anterior = 0;
        int atual = 1;
        
        System.out.println("Sequência de Fibonacci até o " + num + "° termo:");
        
        for (int i = 1; i <= num; i++) {
            System.out.print(atual + " ");
            
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        en.close();
    }
}