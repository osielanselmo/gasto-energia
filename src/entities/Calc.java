package entities;

public class Calc {
	private double kh;
	private int quantidade;
	
	public Calc(double kh, int quantidade) {
				this.kh = kh;
		this.quantidade = quantidade;
	}

	public double getKlw() {
		return kh;
	}

	public void setKlw(int klw) {
		this.kh = klw;
	}

	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double calcular() {
		return kh*quantidade;
	
		 
		
		
	}

}
