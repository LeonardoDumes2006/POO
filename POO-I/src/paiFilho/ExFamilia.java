package paiFilho;

public class ExFamilia {
	public static void main(String[] args) {
		Familia rodrigo = new Familia();
		/*
		rodrigo.setNome("Rodrigo");
		rodrigo.setSobrenome("Curvello");
		
		Familia iran = new Familia();
		iran.setNome("Iran");
		iran.setSobrenome("Outra Familia");
		
		System.out.println(rodrigo.getNome() + " " + rodrigo.getSobrenome());
		System.out.println(iran.getNome() + " " + rodrigo.getSobrenome());
		*/
		
		rodrigo.setNome("Rodrigo");
		Familia.setSobrenome("Curvello");
		
		Familia iran = new Familia();
		iran.setNome("Iran");
		Familia.setSobrenome("Outra Familia");
		
		System.out.println(rodrigo.getNome() + " " + Familia.getSobrenome());
		System.out.println(iran.getNome() + " " + Familia.getSobrenome());
	}
}
