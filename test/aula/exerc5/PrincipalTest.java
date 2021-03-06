package aula.exerc5;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;

import aula.A;

/**
 * @author Karen 11 de mar de 2018
 */
public class PrincipalTest {

	/**
	 * Exerc�cio 5 � O m�todo dobro, da classe A, possui acesso private, isto �,
	 * ele s� pode ser acessado de dentro do pr�prio objeto/classe. Programar um
	 * teste para o m�todo dobro. Lembre-se que voc� n�o pode alterar a classe
	 * A, ent�o este teste n�o pode ser colocado dentre do classe A. Observa��o:
	 * algumas pessoas afirmam que um m�todo privado n�o deve ser testado, pois
	 * o seu objetivo � fazer uma funcionalidade interna da classe que, por sua
	 * vez, ser� consumida por um m�todo p�blico do objeto. Desta forma, cabe
	 * apenas o teste dos m�todos p�blicos que invocam esse m�todo privado.
	 * 
	 * @throws java.lang.Exception
	 */
	private A a;

	@Before
	public void setUp() {
		a = new A();
	}

	@Test
	public void testDobro() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Method metodoDobro = A.class.getDeclaredMethod("dobro", int.class);
		metodoDobro.setAccessible(true);
		int r = (int) metodoDobro.invoke(a, 2);
		/* checa se o resultado � 4 */
		assertEquals(4, r, 0);

	}

}
