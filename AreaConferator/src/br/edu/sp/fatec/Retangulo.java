package br.edu.sp.fatec;

/**
 * Classe concreta que herda atributos de {@link FiguraGeometrica}
 * e implementa {@link Calculable}
 * @author murata
 *
 */
public class Retangulo extends FiguraGeometrica implements Calculable{
	
	/**
	 * Construtor de Retângulo
	 * @param base		base do retângulo
	 * @param altura	altura do retângulo
	 */
	public Retangulo(final Double base, final Double altura) {
		setBase(base);
		setAltura(altura);
	}

	@Override
	public Double calcularArea() {
		return getBase() * getAltura();
	}
	
	@Override
	public String toString() {
		return "Area do Retangulo: " + calcularArea();
	}

}
