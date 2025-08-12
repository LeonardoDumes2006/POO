package Lista1;
import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		/* 13.João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
		rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o
		estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar
		uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa
		que leia a variável peso (peso de peixes) e verifique se há excesso. Se houver, gravar na
		variável excesso e na variável multa o valor da multa que João deverá pagar. 
		*/
		
		Scanner en = new Scanner(System.in);
		
		System.out.print("Total peso peixe(s): ");
		float peso = en.nextFloat();
		
		float excedente = 0;
		float multa = 0;
		
		if (peso > 50) {
			excedente = peso - 50;
			multa = excedente * 4;
			System.out.println("A multa é de : " + multa);
		}else
			System.out.println("O preço a pagar de multa é 0");
		
		en.close();
	}

}
