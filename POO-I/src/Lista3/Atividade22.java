package Lista3;

import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
    	/*
    	 * 22. Numa eleição existem três candidatos. Faça um programa que peça o número total de
			votantes. Peça para cada votante votar e ao final mostrar o número de votos de cada
			candidato.
    	 */
        Scanner en = new Scanner(System.in);
        
        int c1 = 0; 
        int c2 = 0; 
        int c3 = 0;  
        int nulos = 0; 
        
        System.out.println("Número total de votantes: ");
        int votantes = en.nextInt();
        
        for(int i = 1; i <= votantes; i++) {
            System.out.println("Em qual candidato você vota? (1, 2 ou 3)");
            int voto = en.nextInt();
            
            switch (voto) {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                default:
                    nulos++;
                    System.out.println("Voto nulo/incorreto!");
            }
        }
        
        System.out.println("Candidato 1: " + c1 + " votos");
        System.out.println("Candidato 2: " + c2 + " votos");
        System.out.println("Candidato 3: " + c3 + " votos");
        System.out.println("Votos nulos: " + nulos + " votos");
        
        en.close();
    }
}