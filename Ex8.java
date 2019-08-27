package poo_poo;

public class Ex8 {
	
	private String nome;
	private float idade;
	private float altura;
	private float peso;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getIdade() {
		return idade;
	}
	public void setIdade(float idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float envelhecer() {
		float envelhecer = this.idade + 1;
		return envelhecer;	
	}
	public float engordar(float engorda) {
		engorda = this.peso + engorda;
		return engorda;	
	}
	public float emagrecer(float engorda) {
		engorda = this.peso + engorda;
		return engorda;	
	}
	public float crescer(float cresce) {
		if(this.idade < 21)
		cresce = (float) (cresce + 0.005);
		cresce = this.altura + cresce;
		return cresce;	
	}

}
