package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import diccionario.Diccionario;

class DiccionarioTest {
	private Diccionario dic;

	@BeforeEach
	void setUp() {
		dic = new Diccionario();

		dic.nuevoPar("gato", "cat");
		dic.nuevoPar("perro", "dog");
		dic.nuevoPar("mesa", "table");
		dic.nuevoPar("auto", "car");
	}

	@Test
	void testNuevoPar() {
//		assertTrue();
	}

	@Test
	void testPalabraAleatoria() {
		assertEquals("mesa", dic.palabraAleatoreaConNum(2));
	}

}
