package br.edu.sp.fatec;

/**
 * Classe concreta que herda atributos de {@link FiguraGeometrica}
 * e implementa {@link Calculable}
 * @author murata
 *
 */
public class TrapezioDescendente extends FiguraGeometrica implements Calculable {
	
	/**
 	 * Construtor de Trapezio Descendente
	 * @param baseMaior			base maior do trapezio
	 * @param baseMenor			base menor do trapezio
	 * @param alturaTrapezio	altura do trapezio
	 */
	public TrapezioDescendente(final Double baseMaior, final Double baseMenor, final Double alturaTrapezio) {
		setBaseMaior(baseMaior);
		setBaseMenor(baseMenor);
		setAlturaTrapezio(alturaTrapezio);
	}

	@Override
	public Double calcularArea() {
		return ((getBaseMaior() + getBaseMenor()) * getAlturaTrapezio()) / 2;
	}

	@Override
	public String toString() {
		return "Area do Trapezio Descendente: " + calcularArea();
	}

}
