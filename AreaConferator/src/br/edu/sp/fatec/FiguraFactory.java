package br.edu.sp.fatec;

public class FiguraFactory {
	
	public FiguraGeometrica criarQuadrado(final double lado) {
		return new Quadrado(lado);
	}
}
