package poo_poo;

public class Ex3 {

	private float n1=0;
	private float n2=0;
	
	public float getN1() {
		return n1;
	}

	public void setN1(float n1) {
		this.n1 = n1;
	}

	public float getN2() {
		return n2;
	}

	public void setN2(float n2) {
		this.n2 = n2;
	}

	public float soma() {
		float soma = n1 + n2;
		return soma;
	}
	public float menos() {
		float menos = n1 - n2;
		return menos;
	}
	public float mult() {
		float mult = n1 * n2;
		return mult;
	}
	public float div() {
		float div = n1 / n2;
		return div;
	}

}
