package br.edu.sp.fatec;

/**
 * Classe concreta que herda atributos de {@link FiguraGeometrica}
 * e implementa {@link Calculable}
 * @author murata
 *
 */
public class Quadrado extends FiguraGeometrica implements Calculable {

	/**
	 * Construtor de Quadrado
	 * @param lado		lado do quadrado
	 */
	public Quadrado(final double lado) {
		setLado(lado);
	}
	
	@Override
	public Double calcularArea() {
		return getLado() * 2.0;
	}
	
	@Override
	public String toString() {
		return "Area do Quadrado: " + calcularArea();
	}

}
