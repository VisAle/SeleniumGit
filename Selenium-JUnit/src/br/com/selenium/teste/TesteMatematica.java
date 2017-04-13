package br.com.selenium.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteMatematica {

	Matematica m;
	
	@Before
	public void setUp() throws Exception {
		m = new Matematica();
	}

	@Test
	public void testRaiz() {
		assertEquals(4, m.Raiz(16), 0);
	}
/*
	//Erro
	@Test
	public void testDividePorZero() {
		assertEquals(15, m.Divide(30, 0));		
	}
	
	//Falha
	@Test
	public void testMaiorEscolherMenor() {
		assertEquals(2, m.Maior(10, 2));
	}
*/	
	@Test
	public void testDivide() {
		assertEquals(15, m.Divide(30, 2));		
		assertEquals(2, m.Divide(8, 4));	
	}

	@Test
	public void testMaior() {
		assertEquals(10, m.Maior(10, 2));
	}

}
