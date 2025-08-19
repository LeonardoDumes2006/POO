package Lista3;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        /*
         * 3. Faça um programa que leia e valide as seguintes informações:
         * a. Nome: maior que 3 caracteres;
         * b. Idade: entre 0 e 150;
         * c. Salário: maior que zero;
         * d. Sexo: 'f' ou 'm';
         * e. Estado Civil: 's', 'c', 'v', 'd';
         */
        
        Scanner en = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

        do {
            System.out.print("Digite seu nome: ");
            nome = en.nextLine();
            if (nome.length() <= 3) {
                System.out.println("O nome deve ter mais de 3 caracteres.");
            }
        } while (nome.length() <= 3);

        do {
            System.out.print("Digite sua idade: ");
            idade = en.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("Idade inválida! Digite entre 0 e 150.");
            }
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Digite seu salário: ");
            salario = en.nextDouble();
            if (salario <= 0) {
                System.out.println("O salário deve ser maior que zero.");
            }
        } while (salario <= 0);

        do {
            System.out.print("Digite seu sexo (f/m): ");
            sexo = en.next().toLowerCase().charAt(0);
            if (sexo != 'f' && sexo != 'm') {
                System.out.println("Sexo inválido! Digite 'f' ou 'm'.");
            }
        } while (sexo != 'f' && sexo != 'm');

        do {
            System.out.print("Digite seu estado civil (s/c/v/d): ");
            estadoCivil = en.next().toLowerCase().charAt(0);
            if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' &&
            	estadoCivil != 'd') {
                System.out.println("Estado civil inválido! Digite 's', 'c', 'v' ou 'd'.");
            }
        } while (estadoCivil != 's' && estadoCivil != 'c' && 
        		estadoCivil != 'v' && estadoCivil != 'd');

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);

        en.close();
    }
}
