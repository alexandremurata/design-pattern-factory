package br.edu.sp.fatec;

/**
 * @author murata
 *
 */
public class FactoryDemo {

	public static void main(String[] args) {
		FiguraFactory figuraFactory = new FiguraFactory();
		
		FiguraGeometrica quadrado = figuraFactory.criarQuadrado(2.0);
		System.out.println(quadrado.toString());
		
		FiguraGeometrica retangulo = figuraFactory.criarRetangulo(2.0, 4.0);
		System.out.println(retangulo.toString());
		
		FiguraGeometrica circulo = figuraFactory.criarCirculo(100.0);
		System.out.println(circulo.toString());
		
		FiguraGeometrica trapezio = figuraFactory.criarTriapezioDescendente(2.0, 1.0, 1.0);
		System.out.println(trapezio.toString());
		
		FiguraGeometrica losango = figuraFactory.criarLosango(10.0, 1.0);
		System.out.println(losango.toString());
		
		FiguraGeometrica cubo = figuraFactory.criarCubo(5.0);
		System.out.println(cubo.toString());
		
		/*FiguraGeometrica paralelogramo = figuraFactory.criarParalelogramo(10.0, 1.0);
		System.out.println(paralelogramo.toString());
		
		FiguraGeometrica hexagono = figuraFactory.criarHexagono(5.0);
		System.out.println(hexagono.toString());*/
		
		
	}
}
