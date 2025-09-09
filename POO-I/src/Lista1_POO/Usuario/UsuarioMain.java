package Lista1_POO.Usuario;
import java.util.Scanner;

public class UsuarioMain {
    public static void main(String[] args) {
        /*
         * 1. Faça um programa que peça ao usuário nome e sobrenome separadamente
         * e após junte-os com a mensagem “Seu nome completo é: Nome Sobrenome”;
         */
        
        Scanner input = new Scanner(System.in);
        
        Usuario user = new Usuario();
        
        System.out.print("Digite seu nome: ");
        user.setNome(input.nextLine());
        
        System.out.print("Digite seu sobrenome: ");
        user.setSobrenome(input.nextLine());
        
        System.out.println("Seu nome completo é: " 
                           + user.getNome() + " " 
                           + user.getSobrenome());
        
        input.close();
    }
}
