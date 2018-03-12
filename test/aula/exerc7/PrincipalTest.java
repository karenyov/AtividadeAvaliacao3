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
	 * Exerc�cio 7 � Um membro est�tico � aquele que pertence � classe, isto �,
	 * para chamar esse membro n�o � necess�rio ter uma inst�ncia da classe.
	 * Programar um teste para o m�todo diff, da classe A.
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
