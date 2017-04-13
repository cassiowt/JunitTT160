package model;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import model.Quadrado;

public class TestQuadrado {
	Quadrado quadrado;

	
	@BeforeClass
	public static void antesDeTudo(){
		System.out.println("Iniciou os teste");
	}
	
	@Before
	public void setUp() {
		quadrado = new Quadrado();
		quadrado.setLado(2);
	}

	@After
	public void fim(){
		System.out.println("Terminou o metodo");
	}
	
	@AfterClass
	public static void depoisDeTudo(){
		System.out.println("Finalizou os teste");
	}
	
	@Test
	public void testAreaQuadradoComLadoCoreto() {
		int areaCorreta = 4;
		int area = quadrado.calculaArea();
		assertTrue("valor indevido da Área", area == areaCorreta);
	}

	@Test
	public void testAreaQuadrado() {
		int areaCorreta = 4;
		int area = quadrado.calculaArea();
		assertEquals(area, areaCorreta);
	}

	@Test
	public void testAreaQuadradoComLadoIncorreto() {
		int areaIncorreta = 5;
		int area = quadrado.calculaArea();
		assertFalse("valor lado esta correto", area == areaIncorreta);
	}

	@Test
	public void testAreaQuadradoIncorreto() {
		int areaIncorreta = 5;
		int area = quadrado.calculaArea();
		assertNotEquals(area, areaIncorreta);
	}

	@Test
	public void testPerimetroQuadradoCorreto() {
		int perimetroCorreto = 8;
		int perimetro = quadrado.calculaPerimetro();
		assertTrue("valor indevido do Perimetro", perimetro == perimetroCorreto);

	}

	@Test
	public void testPerimetroQuadradoIncorreto() {
		int perimetroCorreto = 9;
		int perimetro = quadrado.calculaPerimetro();
		assertFalse("valor correto do Perimetro", perimetro == perimetroCorreto);

	}

	@Test
	public void testQuadradoExistente() {
		assertNotNull(quadrado);

	}

	@Test
	public void testQuadradoInxistente() {
		quadrado = null;
		assertNull(quadrado);

	}

	@Test
	public void testQuadradoIgual() {
		Quadrado triangulo = new Quadrado();
		assertNotSame(quadrado, triangulo);
		;

	}

}
