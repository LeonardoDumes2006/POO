package Generalizacao;

public class PessoaFisica extends Pessoa{
	private String cpf ;
	
	public PessoaFisica(String nome) {
		super(nome);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(cpf.length() > 10)
			this.cpf = cpf;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaFisica [cpf=");
		builder.append(cpf);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
