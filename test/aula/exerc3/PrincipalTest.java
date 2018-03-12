package aula.exerc3;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Karen 11 de mar de 2018
 */
public class PrincipalTest {

	/**
	 * Exercício 3 – Os métodos isImpar e isPar, respectivamente, das classes A
	 * e B, possuem visibilidade package, isto é, somente estão disponíveis
	 * dentro do próprio pacote. Considerando que os métodos de testes
	 * isImparTest() e isParTest() estão nas classes ATest e BTest,
	 * respectivamente. Explique o motivo de não ser possível testar o método
	 * isParTest() desta forma como o projeto se encontra, enquanto que o teste
	 * do método isImparTest() não possui problema algum para ser testado
	 * 
	 * R. porque o método isimparTest está visível apenas para a Classe B já que
	 * ela é a unica que implementa esse método, com a Herança que foi feita deve mudar forçando a visibilidade do método,
	 * a Classe B está em pacote diferente 
	 * 
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
