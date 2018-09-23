package br.edu.sp.fatec;

/**
 * Classe responsável por criar as formas geométricas.
 * Cada forma geométrica é criada com seus respectivos parâmetros
 * @author murata
 *
 */
public class FiguraFactory {
	
	/**
	 * Método responsável por criar uma instância de {@link Quadrado}
	 * @param lado		lado do Quadrado
	 * @return			instância de {@link Quadrado}
	 */
	public FiguraGeometrica criarQuadrado(final Double lado) {
		return new Quadrado(lado);
	}
	
	/**
	 * Método responsável por criar uma instância de {@link Retangulo}
	 * @param base		base do Retângulo
	 * @param altura	altura do Retângulo
	 * @return			instancia de {@link Retangulo}
	 */
	public FiguraGeometrica criarRetangulo(final Double base, final Double altura) {
		return new Retangulo(base, altura);
	}
	
	/**
	 * Método responsável por criar uma instância de {@link Circulo}
	 * @param raio	raio do Circulo
	 * @return		instância de {@link Circulo}
	 */
	public FiguraGeometrica criarCirculo(final Double raio) {
		return new Circulo(raio);
	}
	
	/**
	 * Método responsável por criar uma instância de {@link Triangulo}
	 * @param lado1		lado do Triangulo
	 * @param lado2		lado do Triangulo
	 * @return			instancia de {@link Triangulo}
	 */
	public FiguraGeometrica criarTriangulo(final Double lado1, final Double lado2) {
		return new Triangulo(lado1, lado2);
	}
	
	/**
	 * Método responsável por criar uma instância de {@link TrapezioDescendente}
	 * @param baseMaior		base maior do trapezio
	 * @param baseMenor		base menor do trapezio
	 * @param altura		altura do trapezio
	 * @return				instancia de {@link TrapezioDescendente}
	 */
	public FiguraGeometrica criarTriapezioDescendente(final Double baseMaior, final Double baseMenor, 
														final Double altura) {
		return new TrapezioDescendente(baseMaior, baseMenor, altura);
	}
	/**
	 * Método responsável por criar uma instância de {@link Losango}
	 * @param diagonalMaior		diagonal maior do losango
	 * @param diagonarMenor		diagonal menor do losango
	 * @return					instancia de {@link Losango}
	 */
	public FiguraGeometrica criarLosango(final Double diagonalMaior, final Double diagonarMenor) {
		return new Losango(diagonalMaior, diagonarMenor);
	}
	
	/**
	 * Método responsável por criar uma instância de {@link Cubo}
	 * @param aresta		aresta do cubo
	 * @return				instancia de {@link Cubo}
	 */
	public FiguraGeometrica criarCubo(final Double aresta) {
		return new Cubo(aresta);
	}
}
