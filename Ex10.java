package poo_poo;

public class Ex10 {

	private int volume;
	private int canal ;
		
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume > 0 && volume < 40)
		this.volume = volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if(canal > 0 && canal < 150)
		this.canal = canal;
	}
	/*public int changecanal(int troca) {
		if(troca > 0 && troca < 150) {
				return troca;
		}
		
	}
	public int changevol(int vol) {
		vol = volume + vol;
		return vol;
		
	}*/
	
	
}
