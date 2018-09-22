package br.edu.sp.fatec;

public class Quadrado extends FiguraGeometrica implements Calculable {

	public Quadrado(final double lado) {
		this.setLado(lado);
	}
	
	@Override
	public double calcularArea() {
		return getLado() * 2;
	}

}
