package Lista1_POO.quadrado;
import java.util.Scanner;

public class QuadradoMain {
	public static void main(String[] args) {
		/*
		 * 6. Crie uma classe que modele um quadrado:
			Atributos: Tamanho do lado
			Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área;
		 */
		Scanner input = new Scanner(System.in);
		Quadrado q = new Quadrado();
		Quadrado quadrado = new Quadrado(5);
		System.out.println(quadrado);
		
		System.out.println("Digite o tamanho do lado: ");
		q.setLado(input.nextInt());
		
		int areaQuad = q.area(q.getLado());
		System.out.println("A área é de : " + areaQuad);
		
	}
}
