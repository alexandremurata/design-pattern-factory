package br.edu.sp.fatec;

/**
 * Classe concreta que herda atributos de {@link FiguraGeometrica}
 * e implementa {@link Calculable}
 * @author murata
 *
 */
public class Cubo extends FiguraGeometrica implements Calculable {
	
	/**
	 * Construtor de Cubo
	 * @param aresta		aresta do cubo
	 */
	public Cubo(final Double aresta) {
		setAresta(aresta);
	}

	@Override
	public Double calcularArea() {
		return 6 * Math.pow(getAresta(), 2);
	}

	@Override
	public String toString() {
		return "Area do Cubo: " + calcularArea();
	}
}
