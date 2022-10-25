package cl.generation.f20221025;

import java.util.HashSet;

public class ArregloHashSet {

	public static void main(String[] args) {
		// set o HashSet
		//HashSet<TIPODATO> nombre_array = new HashSet<TIPODATO>();
		HashSet<String> relatores = new HashSet<String>();
		
		//agregar elementos (en orden aleatorio y sin repetir iguales)
		relatores.add("Alejandro");
		relatores.add("Andrea");
		relatores.add("Laura");
		relatores.add("Pamela");
		relatores.add("Hector");
		relatores.add("Maggi");
		relatores.add("Israel");
		relatores.add("Alejandro"); //repetido = no agregado
		System.out.println(relatores);
		
		//verificar el contenido del arreglo
		boolean verificacionNombre = relatores.contains("Francisca");
		System.out.println("Existe el relator? "+verificacionNombre);
		
		//Eliminar un elemento
		relatores.remove("Hector"); //se elimina por contenido y no por posisicon (index)
		System.out.println(relatores);
		
		//tamaño del arreglo
		System.out.println("tamaño del hashset: "+relatores.size());
		
		//recorre el arreglo
		//for(TIPODATO singularobjeto : nombrehashset){
		for (String relator : relatores){	
		System.out.println(relator);
		}                                               
		
		
		
		
	}

}
