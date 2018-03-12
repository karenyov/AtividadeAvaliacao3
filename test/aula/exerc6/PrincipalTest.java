package aula.exerc6;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import aula.A;
import outro.B;

/**
 * @author Karen 11 de mar de 2018
 */
public class PrincipalTest {

	/**
	 * Exercício 6 – O resultado esperado de um construtor é uma instância da
	 * classe (objeto). Programar testes para as seguintes chamadas do
	 * construtor: new A(12.5) new A("12.5")
	 * 
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Test(expected = Exception.class)
	public void test1() throws Exception {
		/*
		 * o método doThrow provê a capacidade do objeto Mock de lançar uma
		 * exceção
		 */
		doThrow(new Exception("Teste de exceção")).when(new A(12.5));
	}
	
	@Test(expected = Exception.class)
	public void test2() throws Exception {
		/*
		 * o método doThrow provê a capacidade do objeto Mock de lançar uma
		 * exceção
		 */		
		doThrow(new Exception("Teste de exceção")).when(new A("12.5"));
	}

}
