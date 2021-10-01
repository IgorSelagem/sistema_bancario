package sistema_bancario;

public class Cliente {
	private String cpf;
	private String nome;
	
	public Cliente(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}
	public Cliente(String cpf) {
		super();
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return String.format("Nome do cliente: %s\nCpf do cliente: %s\n", this.nome, this.cpf);
	}
}
