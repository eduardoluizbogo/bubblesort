package poo_poo;

public class Ex1 {
	
	private String nome;
	private String sobrenome;
	
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
	public String junta() {
		String nomeCompleto = nome.concat(" "+sobrenome);
		return nomeCompleto;
		
	}
	
	
 
}
