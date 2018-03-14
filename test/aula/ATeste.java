package aula;

import org.junit.Test;
import org.mockito.Mock;

import aula.A;

import static org.mockito.Mockito.*;


/**
 * @author Karen 11 de mar de 2018
 */
public class ATeste {

	@Mock
	private A a;

	@Test(expected = Exception.class)
	public void test1() throws Exception {
		/*
		 * o m�todo doThrow prov� a capacidade do objeto Mock de lan�ar uma
		 * exce��o
		 */
		doThrow(new Exception("Teste de exce��o")).when(a).g(5);
	}

	@Test(expected = Exception.class)
	public void test2() throws Exception {
		/*
		 * o m�todo doThrow prov� a capacidade do objeto Mock de lan�ar uma
		 * exce��o
		 */
		doThrow(new Exception("Teste de exce��o")).when(a).g(15);
	}

}
