
public class Cadena {

	
	public int longitud(String cadena) {
		return cadena.length();
	}
	
	public int vocales(String cadena) {
		int cnt = 0;
		String vocales = "aeiou";
		for (int i = 0; i < cadena.length() - 1; i++) {
			if (vocales.contains(cadena.substring(i, i + 1))) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public String invertir(String cadena) {
		String inverso = "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			inverso = inverso + cadena.charAt(i);
		}
		return inverso;
	}
	
	public int contarLetra(String cadena, char caracter) {
		int cnt = 0;
		for (int i = 0; i < cadena.length() - 1; i++) {
			if (cadena.charAt(i) == caracter ) {
				cnt++;
			}
		}
		return cnt;
	}
	
}
