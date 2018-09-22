package br.edu.sp.fatec;

public class FactoryDemo {

	public static void main(String[] args) {
		FiguraFactory figuraFactory = new FiguraFactory();
		
		FiguraGeometrica quadrado = figuraFactory.criarQuadrado(2);
		quadrado.calcularArea();
		
		/**
		 * 	Quadrado
			Retângulo
			Círculo
			Triângulo
			Paralelograma
			Trapézio
			Hexágono
			Losango
			Cubo
		 * 
		 */
	}
}
