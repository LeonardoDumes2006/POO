import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		/*for(int x = 0 ; x < 10 ; x++ ) {
			System.out.println(x);
		}
		int y = 0;
		
		while(y < 10) {
			System.out.println(y);
			y++;
		}
		
		int z = 0;
		do {
			System.out.println(z);
			z++;
		}while(z < 10);
		*/
		
		Scanner en = new Scanner(System.in);
		
		System.out.print("Informe o número inicial: ");
		int numi = en.nextInt();
		System.out.print("Informe o número final: ");
		int numf = en.nextInt();
		System.out.print("Informe a tabuada: ");
		int tab = en.nextInt();
		 
		int result = 0;
		int aux = 0;
		/*
		aux = numf;
		fim = incio;
		inicio = fim;
		
		
		/*
		if(numi > numf) {
			for(int i = numf; i < numi; i++ ) {
				result = tab * i;
				System.out.println(result);
			}
		}else if(numi < numf) {
			for(int i = numi; i < numf; i++ ) {
				result = tab * i;
				System.out.println(result);
			}
		}
		*/
		
		/*
		 * int menor = 0;
		if(numi > numf) {
			maior = numi;
			menor = numf;
		}else {
			maior = numf;
			menor = numi;
		}
		
		
		
		for(int i = menor; i < maior; i++ ) {
			result = tab * i;
			System.out.println(result);
		}
		 */
		
		
		
		/*if(numi > numf) {
			numi = numf;
			numf = numi;
			
			
			for(int i = numi; i < numf; i++ ) {
				result = tab * i;
				System.out.println(result);
				
			}
			
		}else if(numi < numf) {
			for(int i = numi; i < numf; i++ ) {
				result = tab * i;
				System.out.println(result);
			}
		}
		*/
		
		
		
	}
}
