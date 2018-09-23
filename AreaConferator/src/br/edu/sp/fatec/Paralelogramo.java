package br.edu.sp.fatec;

/**
 * Classe concreta que herda atributos de {@link FiguraGeometrica}
 * e implementa {@link Calculable}
 * @author murata
 *
 */
public class Paralelogramo extends FiguraGeometrica implements Calculable {
	
	/**
	 * Construtor de Paralelogramo
	 */
	public Paralelogramo() {
		
	}

	@Override
	public Double calcularArea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Area do Paralelogramo: " + calcularArea();
	}
}
