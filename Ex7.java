package poo_poo;

public class Ex7 {

	private float lado=0;

	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	public float mudar() {
		float mudar=lado;
		return mudar;
	}
	public float area() {
		float area = mudar() * mudar();
		return area;	
	}
}
