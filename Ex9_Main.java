package poo_poo;

public class Ex9_Main {

	public static void main(String[] args) {

		Ex9 b = new Ex9();
		
		b.setConta(101);
		b.setNome("Eduardo");
		b.setSaldo(1500);		
		
		System.out.println(b.getNome());
		System.out.println(b.alterarnome("Aimee"));
		System.out.println(b.saque(400));
		System.out.println(b.depósito(1000));
		System.out.println(b.incluirconta(15));
	}

}
