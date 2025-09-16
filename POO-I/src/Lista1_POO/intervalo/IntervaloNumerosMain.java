package Lista1_POO.intervalo;
import java.util.Scanner;
import java.util.Arrays;

public class IntervaloNumerosMain {
	public static void main(String[] args) {
		/*
		 * 2. Faça um programa que mostre os números que constam no intervalo entre
			dois números que serão informados, se o usuário entrar com os valores em
			ordem inversa o programa deve fazer dar um aviso ao usuário que irá fazer
			a inversão.
		 */
		Scanner input = new Scanner(System.in);
        
        IntervaloNumeros intervalo = new IntervaloNumeros();
        IntervaloNumeros inter = new IntervaloNumeros(1,10);
        System.out.println(inter);
        
        System.out.print("Digite o primeiro número: ");
        intervalo.setNum1(input.nextInt());
        
        System.out.print("Digite o segundo número: ");
        intervalo.setNum2(input.nextInt());
        
        int[] resultado = intervalo.gerarIntervalo();
        System.out.println("Números no intervalo: " + Arrays.toString(resultado));
        
        input.close();
		
	}
}
