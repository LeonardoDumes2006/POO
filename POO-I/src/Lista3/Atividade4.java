package Lista3;

public class Atividade4 {
	public static void main(String[] args) {
	/*
	 * 4. Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa
		anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de
		crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários
		para que a população do país A ultrapasse ou iguale a população do país B, mantidas as
		taxas de crescimento. 
		 */
		
		double popA = 80000;
		double popB = 200000;
		int anos = 0;
		while(popA <= popB) {
			popA = popA * 1.03;
			popB = popB * 1.015;
			anos++;
		}
		System.out.println("Para população A passar a população B vai demorar " + anos + " anos");
	}
}
