package br.edu.sp.fatec;

/**
 * Classe concreta que herda atributos de {@link FiguraGeometrica}
 * e implementa {@link Calculable}
 * @author murata
 *
 */
public class Triangulo extends FiguraGeometrica implements Calculable {
	
	/**
	 * Construtor de Triangulo
	 * @param ladoTriangulo
	 * @param ladoTriangulo2
	 */
	public Triangulo(final Double ladoTriangulo, final Double ladoTriangulo2) {
		setLadoTriangulo(ladoTriangulo);
		setLadoTriangulo2(ladoTriangulo2);
	}

	@Override
	public Double calcularArea() {
		return (getLadoTriangulo() * getLadoTriangulo2()) / 2;
	}

}
