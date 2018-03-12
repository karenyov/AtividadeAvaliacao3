package aula.exerc7;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import aula.A;

/**
 * @author Karen 11 de mar de 2018
 */
public class PrincipalTest {

	/**
	 * Exercício 7 – Um membro estático é aquele que pertence à classe, isto é,
	 * para chamar esse membro não é necessário ter uma instância da classe.
	 * Programar um teste para o método diff, da classe A.
	 * 
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		;
		assertEquals("10 - 6 = 4", 4, A.diff(10, 6));
	}

}
