package poo_poo;

public class Ex2 {

	private float numIni;
	private float numFim;
	public float getNumIni() {
		return numIni;
	}
	public void setNumIni(float numIni) {
		this.numIni = numIni;
	}
	public float getNumFim() {
		return numFim;
	}
	public void setNumFim(float numFim) {
		this.numFim = numFim;
	}
	public float inverterIni() {
		if(numIni > numFim) {
			float aux;
			aux = numIni;
			numIni = numFim;
			numFim = aux;
		}
		return numIni;	
	}
	public float inverterFim() {
		if(numIni > numFim) {
			float aux;
			aux = numIni;
			numIni = numFim;
			numFim = aux;
		}
		return numFim;	
	}
}
