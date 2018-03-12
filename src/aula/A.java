package aula;

/**
 * @author Karen 11 de mar de 2018
 */
public class A {

	public A() {
	}

	public A(Object obj) throws Exception {
		if (!(obj instanceof Number)) {
			throw new Exception("Precisa ser um n�mero");
		}
	}

	public void f(int nro) {
		while (nro-- > 0)
			;
	}

	public void g(int nro) throws Exception {
		if (nro > 10) {
			throw new Exception("Valor maior que 10");
		}
		while (nro-- > 0)
			;
	}

	boolean isImpar(int nro) {
		return nro % 2 == 1 ? true : false;
	}

	protected int maior(int x, int y) {
		return x < y ? y : x;
	}

	private int dobro(int nro) {
		return nro * 2;
	}

	public static int diff(int x, int y) {
		return x - y;
	}

	public int mod(int x, int y) {
		return x % y;
	}

	public class C {
		public int soma(int x, int y) {
			return x + y;
		}
	}

}
