package poo_poo;

public class Ex2_Main {

	public static void main(String[] args) {

		Ex2 b = new Ex2();

		b.setNumIni(20);
		b.setNumFim(5);
		
		if(b.getNumFim() < b.getNumIni())
			System.out.println("Os valores foram invertidos!");
		
		for (float i = b.getNumIni(); i < b.getNumFim(); i++) {
			System.out.println(i);
		}
		
	}

}
