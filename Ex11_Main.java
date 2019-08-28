package poo_poo;

public class Ex11_Main {

	public static void main(String[] args) {

		Ex11 b = new Ex11();
		
		b.setQuantidadeCombustivel(500);
		b.setTipoCombustivel(3);
		b.setValorLitro((float) 3.89);
		
		System.out.println(b.getQuantidadeCombustivel());
		System.out.println(b.getTipoCombustivel());
		System.out.println(b.getValorLitro()+"\n");
		
		System.out.println(b.getQuantidadeCombustivel()); //total de combustivel em litros
		System.out.println(b.abastecerPorValor(200));
		System.out.println(b.getQuantidadeCombustivel()); //total de combustivel em litros
		System.out.println(b.abastecerPorLitro(20));
		System.out.println(b.getQuantidadeCombustivel()); //total de combustivel em litros
		System.out.println(b.alterarValor(4));
		System.out.println(b.abastecerPorLitro(20));
		System.out.println(b.alterarCombustivel(6));
		System.out.println(b.alterarQuantidadeCombustivel(200)+"\n");
	}

}
