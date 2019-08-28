package poo_poo;

public class Ex9 {

	private int conta;
	private String nome;
	private float saldo;
	
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public int incluirconta(int coo){
		this.conta = coo;
		return this.conta;
	}
	public String alterarnome(String aux){
		this.nome = aux;
		return this.nome;	
	}
	public float depósito(float dep){
		this.saldo += dep;
		return this.saldo;	
	}
	public float saque(float saq){
		this.saldo -= saq;
		return this.saldo;	
	}
	
	
	
}
