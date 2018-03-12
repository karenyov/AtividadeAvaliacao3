package aula.exerc9;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import aula.A;

/**
 * @author Karen 11 de mar de 2018
 */
public class PrincipalTest {
	
	private A a;

	@Before
	public void setUp() {
		a = new A();
	}


	/**
	 * Exercício 9 – Constitui boa prática colocar somente 1 asserção por método
	 * de teste. Explique o motivo do texto “Terceiro” não ser impresso no
	 * console.
	 * 
	 * R. pois o segundo teste deu erro
	 * 
	 * @Test
		public void modTest() {
		 System.out.println("Primeiro");
		 assertEquals("11%2 == 1", 1, a.mod(11,2) );
		 System.out.println("Segundo");
		 assertEquals("11%4 == 2", 2, a.mod(11,4) );
		 System.out.println("Terceiro");
		 assertEquals("11%3 == 2", 2, a.mod(11,3) );
		}
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Test
	public void modTest() {
		System.out.println("Primeiro");
		assertEquals("11%2 == 1", 1, a.mod(11, 2));
		System.out.println("Segundo");
		assertEquals("11%4 == 2", 2, a.mod(11, 4));
		System.out.println("Terceiro");
		assertEquals("11%3 == 2", 2, a.mod(11, 3));
	}

}
