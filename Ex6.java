package poo_poo;

public class Ex6 {

	private int quant=0;
	private int cod=0;
	
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public float prod() {
		float preco=0;
		switch(cod) {
		case 100: 
			preco = (float) 1.20;
			break;
		case 101: 
			preco = (float) 1.30;
			break;
		case 102: 
			preco = (float) 1.50;
			break;
		case 103: 
			preco = (float) 1.20;
			break;
		case 104: 
			preco = (float) 1.30;
			break;
		case 105: 
			preco = (float) 1;
			break;
		}
		return preco;
	}
	public float conta() {
		float conta = prod() * quant;
		return conta;
	}
	
}
