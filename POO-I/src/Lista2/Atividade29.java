package Lista2;
import java.util.Scanner;

public class Atividade29 {
    public static void main(String[] args) {
    	/*
    	 * 29. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas
			são:
			"Telefonou para a vítima?"
			"Esteve no local do crime?"
			"Mora perto da vítima?"
			"Devia para a vítima?"
			"Já trabalhou com a vítima?"
			O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
			Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
			entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como
			"Inocente".
    	 */
        Scanner en = new Scanner(System.in);
        int respostasPositivas = 0;
        
        System.out.println("Responda as perguntas com S (Sim) ou N (Não)\n");
        
        System.out.print("Telefonou para a vítima? ");
        if(en.next().equalsIgnoreCase("S")) 
        	respostasPositivas++;
        
        System.out.print("Esteve no local do crime? ");
        if(en.next().equalsIgnoreCase("S")) 
        	respostasPositivas++;
        
        System.out.print("Mora perto da vítima? ");
        if(en.next().equalsIgnoreCase("S"))
        	respostasPositivas++;
        
        System.out.print("Devia para a vítima? ");
        if(en.next().equalsIgnoreCase("S")) 
        	respostasPositivas++;
        
        System.out.print("Já trabalhou com a vítima? ");
        if(en.next().equalsIgnoreCase("S")) 
        	respostasPositivas++;
        
        if(respostasPositivas == 2) {
            System.out.println("Suspeita");
        } else if(respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Cúmplice");
        } else if(respostasPositivas == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
        
        en.close();
    }
}