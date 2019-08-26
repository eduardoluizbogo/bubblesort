package poo_poo;

public class Ex4 {
	
	private float ganhohora=0;
	private float horas=0;
	
	public float getGanhohora() {
		return ganhohora;
	}
	public void setGanhohora(float ganhohora) {
		this.ganhohora = ganhohora;
	}
	public float getHoras() {
		return horas;
	}
	public void setHoras(float horas) {
		this.horas = horas;
	} 
	public float bruto() {
		float bruto = ganhohora * horas;
		return bruto;
	}
	public float inss() {
		float inss = (float) ((ganhohora * horas) * 0.08);
		return inss;
	}
	public float sindicato() {
		float sindicato = (float) ((ganhohora * horas) * 0.05);
		return sindicato;
	}
	public float liquido() {
		float liquido = (float) ((ganhohora * horas) * 0.76);
		return liquido;
	}
	public float descontoir() {
		float ir = (float) ((ganhohora * horas) * 0.11);
		return ir;
	}
	public float salarioir() {
		float ir = (float) ((ganhohora * horas) * 0.89);
		return ir;
	}
	public float descontoinss() {
		float descontoinss = (float) ((ganhohora * horas) * 0.08);
		return descontoinss;
	}
	public float salarioinss() {
		float salarioinss = (float) ((ganhohora * horas) * 0.92);
		return salarioinss;
	}
	public float descontosindicato() {
		float descontosindicato = (float) ((ganhohora * horas) * 0.05);
		return descontosindicato;
	}
	public float salariosindicato() {
		float salariosindicato = (float) ((ganhohora * horas) * 0.95);
		return salariosindicato;
	}
	
	
}
