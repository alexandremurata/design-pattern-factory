package br.edu.sp.fatec;

/**
 * Classe concreta que herda atributos de {@link FiguraGeometrica}
 * e implementa {@link Calculable}
 * @author murata
 *
 */
public class Losango extends FiguraGeometrica implements Calculable {
	
	/**
	 * Construtor de Losango
	 * @param diagonalMaior		diagonal maior do losango
	 * @param diagonalMenor		diagonal menor do losango
	 */
	public Losango(final Double diagonalMaior, final Double diagonalMenor) {
		setDiagonalMaior(diagonalMaior);
		setDiagonalMenor(diagonalMenor);
	}

	@Override
	public Double calcularArea() {
		return (getDiagonalMaior() * getDiagonalMenor()) / 2;
	}

	@Override
	public String toString() {
		return "Area do Losango: " + calcularArea();
	}
}
