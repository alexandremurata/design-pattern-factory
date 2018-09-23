package br.edu.sp.fatec;

/**
 * Classe concreta que herda atributos de {@link FiguraGeometrica}
 * e implementa {@link Calculable}
 * @author murata
 *
 */
public class Hexagono extends FiguraGeometrica implements Calculable {
	
	/**
	 * Construtor de Losango
	 */
	public Hexagono() {
		
	}

	@Override
	public Double calcularArea() {
		return null;
	}

	@Override
	public String toString() {
		return "Area do Hexagono: " + calcularArea();
	}
}
