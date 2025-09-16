package Lista1_POO.usuario;

public class Usuario {
	private String nome = "";
	private String sobrenome = "";
	
	public Usuario(){
		
	}
	public Usuario(String nome, String sobrenome) {
		setNome(nome);
		setSobrenome(sobrenome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [nome=");
		builder.append(nome);
		builder.append(", sobrenome=");
		builder.append(sobrenome);
		builder.append("]");
		return builder.toString();
	}
	
	
}
