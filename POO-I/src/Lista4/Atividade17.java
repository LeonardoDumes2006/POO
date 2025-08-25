package Lista4;
import java.util.*;

public class Atividade17 {
	public static void main(String[] args) {
		/*
		 * 2. Crie um programa que solicite o preço de cinco produtos em cinco supermercados
			diferentes, ao final o programa deve mostrar:
			• Os preços em cada um dos supermercados;
			• A média de preço por produto;
			• A soma de preços por supermercado;
			• O valor total no supermercado mais barato e no mais caro;
			Permitir gravar e ler estes dados de um arquivo.
		 */
		Scanner input = new Scanner(System.in);
		float[][] mercados = new float[5][5];
		int soma; 
		for(int i = 0; i < 5; i++) {
			soma = 0;
			for(int j = 0; j < 5; j++) {
				System.out.println("Digite o produto " + j + " do mercado " + i);
				mercados[i][j] = input.nextFloat();
			}
		}
		input.close();
	}
}
