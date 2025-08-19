package Lista3;
import java.util.Scanner;

public class Atividade32 {
    public static void main(String[] args) {
    	/*
    	 * 32. Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes
			de trânsito. Foram obtidos os seguintes dados:
			a. Código da cidade;
			b. Número de veículos de passeio (em 1999);
			c. Número de acidentes de trânsito com vítimas (em 1999). Deseja-se saber:
			d. Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
			e. Qual a média de veículos nas cinco cidades juntas;
			f. Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
    	 */
        Scanner en = new Scanner(System.in);
        
        int codigoCidade;
        int numVeiculos;
        int numAcidentes;
        
        int maiorIndiceAcidentes = Integer.MIN_VALUE;
        int menorIndiceAcidentes = Integer.MAX_VALUE;
        int cidadeMaiorAcidente = 0;
        int cidadeMenorAcidente = 0;
        
        int somaVeiculos = 0;
        int somaAcidentesPoucosVeiculos = 0;
        int contadorPoucosVeiculos = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o código da cidade " + i + ": ");
            codigoCidade = en.nextInt();
            
            System.out.print("Digite o número de veículos de passeio: ");
            numVeiculos = en.nextInt();
            
            System.out.print("Digite o número de acidentes de trânsito com vítimas: ");
            numAcidentes = en.nextInt();
            
            if (numAcidentes > maiorIndiceAcidentes) {
                maiorIndiceAcidentes = numAcidentes;
                cidadeMaiorAcidente = codigoCidade;
            }
            
            if (numAcidentes < menorIndiceAcidentes) {
                menorIndiceAcidentes = numAcidentes;
                cidadeMenorAcidente = codigoCidade;
            }
            
            somaVeiculos += numVeiculos;
            
            if (numVeiculos < 2000) {
                somaAcidentesPoucosVeiculos += numAcidentes;
                contadorPoucosVeiculos++;
            }
            
            System.out.println();
        }
        
        double mediaVeiculos = somaVeiculos / 5.0;
        double mediaAcidentesPoucosVeiculos = contadorPoucosVeiculos > 0 ?
                (double) somaAcidentesPoucosVeiculos / contadorPoucosVeiculos : 0;
        
        System.out.println("Cidade com maior índice de acidentes: Código " + cidadeMaiorAcidente + ", Acidentes: " + maiorIndiceAcidentes);
        System.out.println("Cidade com menor índice de acidentes: Código " + cidadeMenorAcidente + ", Acidentes: " + menorIndiceAcidentes);
        System.out.println("Média de veículos nas cinco cidades: " + mediaVeiculos);
        
        if (contadorPoucosVeiculos > 0) {
            System.out.println("Média de acidentes nas cidades com menos de 2.000 veículos: " + mediaAcidentesPoucosVeiculos);
        } else {
            System.out.println("Não há cidades com menos de 2.000 veículos.");
        }
        
        en.close();
    }
}
