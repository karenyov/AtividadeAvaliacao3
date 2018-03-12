package aula.exerc8;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import aula.A;

/**
 * @author Karen 11 de mar de 2018
 */
public class PrincipalTest {

	/**
	 * Exerc�cio 8 � � aconselh�vel usar classe interna (classe aninhada)
	 * somente quando a classe externa � a �nica que utiliza os objetos do tipo
	 * de dado interno. Programar um teste para o m�todo soma, da classe interna
	 * C.
	 * 
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		A a = new A();
		A.C c = a.new C();

		assertEquals(5, c.soma(3, 2), 0);
	}

}
