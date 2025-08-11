import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);

		System.out.print("Informe um inteiro: ");
		int numI = en.nextInt();
		System.out.println("numI: " + numI);

		System.out.print("Informe um float: ");
		float numF = en.nextFloat();
		System.out.println("numF: " + numF);

		System.out.print("Informe um double: ");
		double numD = en.nextDouble();
		System.out.println("numD: " + numD);

		en.nextLine();

		System.out.print("Informe uma string: ");
		String texto = en.nextLine();
		System.out.println("texto: " + texto);

		en.close();
	}

}
