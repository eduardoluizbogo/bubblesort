package poo_poo;

public class Ex8_Main {

	public static void main(String[] args) {

		Ex8 b = new Ex8();
		
		
		b.setAltura((float) 1.9);
		b.setIdade(20);
		b.setNome("Eduardo");
		b.setPeso(66);
		
		System.out.println(b.getPeso());
		System.out.println(b.engordar(10));
		System.out.println(b.getAltura());
		System.out.println(b.crescer((float) 0.05));
		System.out.println(b.getIdade());
		System.out.println(b.envelhecer());
		System.out.println(b.getNome());
		
	}

}
