package br.edu.sp.fatec;

/**
 * Classe concreta que herda atributos de {@link FiguraGeometrica}
 * e implementa {@link Calculable}
 * @author murata
 *
 */
public class Circulo extends FiguraGeometrica implements Calculable {
	
	private static final Double PI = 3.1415;
	
	/**
	 * Construtor de Circulo
	 * @param raio		raio do circulo
	 */
	public Circulo(final Double raio) {
		setRaio(raio);
	}

	@Override
	public Double calcularArea() {
		return PI * Math.pow(getRaio(), 2);
	}

	@Override
	public String toString() {
		return "Area do Circulo: " + calcularArea();
	}
}
