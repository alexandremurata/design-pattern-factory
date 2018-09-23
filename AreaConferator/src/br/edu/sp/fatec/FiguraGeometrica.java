package br.edu.sp.fatec;

import lombok.Getter;
import lombok.Setter;

/**
 * Classe abstrata que contém atributos que serão herdados
 * @author murata
 *
 */
@Getter
@Setter
public abstract class FiguraGeometrica implements Calculable {
	
	private Double lado;
	private Double base;
	private Double altura;
	private Double raio;
	private Double ladoTriangulo;
	private Double ladoTriangulo2;
	private Double baseMaior;
	private Double baseMenor;
	private Double alturaTrapezio;
	private Double diagonalMaior;
	private Double diagonalMenor;
	private Double aresta;
	
}
