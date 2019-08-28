package poo_poo;

public class Ex11 {

	private int tipoCombustivel;
	private float valorLitro;
	private float quantidadeCombustivel;
	
	public int getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(int tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public float getValorLitro() {
		return valorLitro;
	}
	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}
	public float getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}
	public void setQuantidadeCombustivel(float quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
	public float abastecerPorValor(float preco) {		
		preco = preco / this.valorLitro;
		quantidadeCombustivel = quantidadeCombustivel - preco;
		return preco; 
	}
	public float abastecerPorLitro(float litro) {
		quantidadeCombustivel = quantidadeCombustivel - litro;
		litro = this.valorLitro * litro;
		return litro; 	
	}
	public float alterarValor(float value) {
		this.valorLitro = value;
		return this.valorLitro;
	}
	public float alterarCombustivel(int reset) {
		tipoCombustivel = reset;
		return tipoCombustivel;
	}
	public float alterarQuantidadeCombustivel(float quant) {
		quantidadeCombustivel = quant;
		return quantidadeCombustivel;
	}
}
