import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CadenaTest {

	Cadena miCadena;
	
	@BeforeEach
	void setUp() throws Exception {
		miCadena = new Cadena();
	}

	@Test
	void testLongitud() {
		int expected = 5;
		int actual = miCadena.longitud("Hola!");
		assertEquals(expected, actual);
	}
	
	@Test
	void testLongitudFail() {
		int expected = 5;
		int actual = miCadena.longitud("");
		assertEquals(expected, actual);
	}

	@Test
	void testVocales() {
		int expected = 2;
		int actual = miCadena.vocales("Hola!");
		assertEquals(expected, actual);
	}
	
	@Test
	void testVocalesFail() {
		int expected = 2;
		int actual = miCadena.vocales("");
		assertEquals(expected, actual);
	}

	@Test
	void testInvertir() {
		String expected = "!aloH";
		String actual = miCadena.invertir("Hola!");
		assertEquals(expected, actual);
	}
	
	@Test
	void testInvertirFail() {
		String expected = "!aloH";
		String actual = miCadena.invertir("");
		assertEquals(expected, actual);
	}

	@Test
	void testContarLetra() {
		int expected = 2;
		int actual = miCadena.contarLetra("Holaa!", 'a');
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testContarLetraFail() {
		int expected = 2;
		int actual = miCadena.contarLetra("", ' ');
		assertEquals(expected, actual);
	}

}
