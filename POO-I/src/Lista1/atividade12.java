package Lista1;
import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		// 12.Tendo como dado de entrada a altura, construa um algoritmo que calcule seu peso ideal,
		// utilizando as seguintes fórmulas:
		//	Para homens: (72.7*h) - 58
		//	Para mulheres: (62.1*h) - 44.7 (h = altura)
		
		Scanner en = new Scanner(System.in);
		
		System.out.println("Qual sua altura: ");
		float altura = en.nextFloat();
		
		
		double pesoidealmasc;
		double pesoidealfem;

 
            pesoidealmasc = (72.7 * altura) - 58;
     
            pesoidealfem = (62.1 * altura) - 44.7;
        

        System.out.printf("Peso ideal Masculino: %.2f kg%n", pesoidealmasc);
        System.out.printf("Peso ideal Feminino: %.2f kg%n", pesoidealfem);

        en.close(); 
	}

}
