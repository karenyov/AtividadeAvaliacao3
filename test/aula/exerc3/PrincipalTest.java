package aula.exerc3;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Karen 11 de mar de 2018
 */
public class PrincipalTest {

	/**
	 * Exerc�cio 3 � Os m�todos isImpar e isPar, respectivamente, das classes A
	 * e B, possuem visibilidade package, isto �, somente est�o dispon�veis
	 * dentro do pr�prio pacote. Considerando que os m�todos de testes
	 * isImparTest() e isParTest() est�o nas classes ATest e BTest,
	 * respectivamente. Explique o motivo de n�o ser poss�vel testar o m�todo
	 * isParTest() desta forma como o projeto se encontra, enquanto que o teste
	 * do m�todo isImparTest() n�o possui problema algum para ser testado
	 * 
	 * R. porque o m�todo isimparTest est� vis�vel apenas para a Classe B j� que
	 * ela � a unica que implementa esse m�todo, com a Heran�a que foi feita deve mudar for�ando a visibilidade do m�todo,
	 * a Classe B est� em pacote diferente 
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
