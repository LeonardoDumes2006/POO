package Lista1_POO.pessoa;

public class PessoaMain {
	public static void main(String[] args) {
		/*
		 * 7. Crie uma classe que modele uma pessoa:
			Atributos: nome, idade, peso e altura
			Métodos: Envelhercer, engordar, emagrecer, crescer.
			Obs: Por padrão a cada ano que nossa pessoa envelhece e se a idade dela
			for menor que 21 anos ela deve crescer 0,5 cm por ano.
		 */
		Pessoa p = new Pessoa("Leo", 18, 72.0, 1.8);
		Pessoa pessoa = new Pessoa();
		Pessoa people = new Pessoa(20, 1.9);
		
		System.out.println(p);
		System.out.println(pessoa);
		System.out.println(people);
		
		
		System.out.println("------- Separar -------");
		 p.envelhecer(2); 
	        p.engordar(2);  
	        p.emagrecer(1);
	        p.crescer(2);   
	        
	        System.out.println(p);
	}
}
