package outro;

import aula.A;

/**
 * @author Karen 11 de mar de 2018
 */
public class B extends A {
	
	boolean isPar(int nro) {
		return nro % 2 == 1 ? true : false;
	}

	protected int menor(int x, int y) {
		return x < y ? y : x;
	}

}
