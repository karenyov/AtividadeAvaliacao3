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
	 * Exercício 5 – O método dobro, da classe A, possui acesso private, isto é,
	 * ele só pode ser acessado de dentro do próprio objeto/classe. Programar um
	 * teste para o método dobro. Lembre-se que você não pode alterar a classe
	 * A, então este teste não pode ser colocado dentre do classe A. Observação:
	 * algumas pessoas afirmam que um método privado não deve ser testado, pois
	 * o seu objetivo é fazer uma funcionalidade interna da classe que, por sua
	 * vez, será consumida por um método público do objeto. Desta forma, cabe
	 * apenas o teste dos métodos públicos que invocam esse método privado.
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
		/* checa se o resultado é 4 */
		assertEquals(4, r, 0);

	}

}
