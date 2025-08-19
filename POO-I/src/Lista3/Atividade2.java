package Lista3;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		/*
		 * 2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao
		nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
		 */
		Scanner en = new Scanner(System.in);
		String usuario = "";
		String senha = "";
		
		do {
			
			System.out.print("Nome de Usuário: ");
			usuario = en.nextLine();
			
			System.out.print("Senha: ");
			senha = en.nextLine();
			
			if(senha.equals(usuario)) {
				System.out.println("Senha não pode ser igual a usuário");
			}
			
		}while(senha.equals(usuario));
		
		System.out.println("Cadastro realizado com sucesso");
		 en.close();
	}
}
