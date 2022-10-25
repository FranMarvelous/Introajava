package cl.generation.f20221025;

import java.util.HashMap;

public class ArregloHashMap {

	public static void main(String[] args) {
		// HashMap
		// llave , valor (key,value)
		// crear hashmap
		// HashMap<TIPODATO, TIPODATO> nombre_hashmap = new
		// Hashmap<TIPODATO,TIPODATO>();
		HashMap<Integer, String> relatores = new HashMap<Integer, String>();

		// Agregar elementos
		// nombre_hasmap.put(integer, "string");
		relatores.put(1, "alejandro");
		relatores.put(2, "andrea");
		relatores.put(3, "laura");
		relatores.put(4, "pamela");
		relatores.put(5, "israel");// si existe esa clave, sobre escribe el valor
		System.out.println("Map: " + relatores);

		// tamaño del map
		// nombre_hashmap.size();
		System.out.println(relatores.size());

		// acceder a un dato
		// nombre_hashmap.get(key);
		System.out.println(relatores.get(3));

		// eliminar un dato
		// nombre_hashmap.remove(key)
		relatores.remove(5);
		System.out.println("Map: " + relatores);

		// recorremos un map
		/*
		 * for (Map.Entry<keyType, valType> entry : map.entrySet()) { keyType key =
		 * entry.getKey(); valType val = entry.getValue();
		 * 
		 * }
		 */
		for (Integer clave : relatores.keySet()) { // Saca la key uno por uno
			System.out.println("Clave "+clave+" valor "+relatores.get(clave));
		}

	}

}
