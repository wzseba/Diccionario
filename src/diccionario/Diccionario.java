package diccionario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Diccionario {

	private Map<String, String> diccionario;

	public Diccionario() {
		this.diccionario = new HashMap<String, String>();
	}

	public void nuevoPar(String esp, String ing) {
		diccionario.put(esp, ing);
	}

	public String traduce(String esp) {
		String traduccion = diccionario.get(esp);
		if (traduccion != null) {
			return traduccion;
		}
		throw new Error("palabra no encontrada");
	}

	public String palabraAleatoria() {

		List<String> claves = new ArrayList<String>(diccionario.keySet());
		Random random = new Random();

		return claves.get(random.nextInt(claves.size()));
	}

	public String palabraAleatoreaConNum(int indice) {
		return "";
	}

	public String primeraLetraTraduccion(String esp) {
		return "1 letra en ing";
	}
}
