package aula;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * @author Karen 11 de mar de 2018
 */
public class ATeste {

	private A a;

	@Before
	public void setUp() {
		a = new A();
	}

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
