package br.edu.sp.fatec;

public abstract class FiguraGeometrica implements Calculable{
	
	private double lado;
	private double raio;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
}
