package GeneralizacaoPessoa;


public class PessoaMain {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Leonardo", "Rua Orsar Nye");
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica("Alex", "Rua Duque", "127.946.899-83", "Solteiro");
		System.out.println(pf);
		
		/*
		PessoaJuridica pj = new PessoaJuridica("SouthByte");
		pj.setCnpj("11.000.000/0000-42");
		System.out.println(pj);
		*/
	}
}
