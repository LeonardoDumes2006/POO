package Generalizacao;

public class PessoaMain {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Leonardo");
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica("Leonardo");
		pf.setCpf("127.946.899-83");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica("SouthByte");
		pj.setCnpj("11.000.000/0000-42");
		System.out.println(pj);
	}
}
