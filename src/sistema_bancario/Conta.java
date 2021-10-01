package sistema_bancario;

public class Conta {
	private int numero;
	private float saldo;
	
	public Conta(int numero, float saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}
	public Conta(int numero) {
		super();
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	public float getSaldo() {
		return saldo;
	}
	
	@Override 
	public String toString() {
		return String.format("Número de conta: %d\nSaldo disponível: %.2f\n", this.numero, this.saldo);
	}
	
}
