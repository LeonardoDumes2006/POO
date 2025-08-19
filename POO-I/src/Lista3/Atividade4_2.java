package Lista3;

import java.util.Scanner;

public class Atividade4_2 {
    public static void main(String[] args) {
    	/* * 4. Altere o programa anterior permitindo ao usuário informar as populações e as 
    	 *   taxas de crescimento iniciais. Valide a entrada e permita repetir a operação. */
    	
        Scanner en = new Scanner(System.in);
        char repetir;

        do {
            double popA, popB, tcA, tcB;

            do {
                System.out.print("Digite a população do país A (maior que 0): ");
                popA = en.nextDouble();
                if (popA <= 0) {
                    System.out.println("Valor inválido! A população deve ser maior que 0.");
                }
            } while (popA <= 0);

            do {
                System.out.print("Digite a população do país B (maior que 0): ");
                popB = en.nextDouble();
                if (popB <= 0) {
                    System.out.println("Valor inválido! A população deve ser maior que 0.");
                }
            } while (popB <= 0);

            do {
                System.out.print("Digite a taxa de crescimento da população A (em %, maior que 0): ");
                tcA = en.nextDouble();
                if (tcA <= 0) {
                    System.out.println("Valor inválido! A taxa deve ser maior que 0.");
                }
            } while (tcA <= 0);

            do {
                System.out.print("Digite a taxa de crescimento da população B (em %, maior que 0): ");
                tcB = en.nextDouble();
                if (tcB <= 0) {
                    System.out.println("Valor inválido! A taxa deve ser maior que 0.");
                }
            } while (tcB <= 0);

            tcA = 1 + (tcA / 100);
            tcB = 1 + (tcB / 100);

            int anos = 0;
            while (popA <= popB) {
                popA *= tcA;
                popB *= tcB;
                anos++;
            }

            System.out.println("Vai demorar " + anos + " anos para a população A ultrapassar ou igualar a população B.");
            System.out.println("População A final: " + (int) popA);
            System.out.println("População B final: " + (int) popB);

            System.out.print("Deseja calcular novamente? (s/n): ");
            repetir = en.next().toLowerCase().charAt(0);

        } while (repetir == 's');

        System.out.println("Programa encerrado.");
        en.close();
    }
}
