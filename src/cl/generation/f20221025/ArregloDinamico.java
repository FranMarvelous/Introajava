package cl.generation.f20221025;

import java.util.ArrayList;

public class ArregloDinamico {

	public static void main(String[] args) {
		//ArrayList
		//1. Definición
		//ArrayList<TIPODATO> nombre_array = new ArrayList<TIPODATO>()
		ArrayList<String> grupo6 = new ArrayList<String>();
		//2. Agregar valores al arreglo
		grupo6.add("Javier");
		grupo6.add("Rocío");
		grupo6.add("Julián");
		grupo6.add("Luis");
		grupo6.add("Francisca");
		System.out.println(grupo6);
		//3. tamaño del ArrayList
		grupo6.size();
		System.out.println(grupo6.size());
		//4. obtener un elemento
		grupo6.get(0);
		System.out.println(grupo6.get(0));
		//5. Eliminar un elemento, se reagrupan los elementos
		grupo6.remove(3);
		System.out.println(grupo6);
		//6. Reagregando elemento, cambia su posicion
		grupo6.add("Luis");
		System.out.println(grupo6);
		//7. recorrer el ArrayList
		for(int i = 0; i <grupo6.size();i++){
			System.out.println("Integrante: "+grupo6.get(i));
		}
		System.out.println("*******************");
		//8. for iterador o for de objeto
		//for(TIPODATO objetosingular; nombre_array){}
		for(String integrante: grupo6) { //se utiliza ":" o "dos puntos" para asignar la singularidad del objeto
			System.out.println(integrante);
		}
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		
		for(Integer numero :numeros) {
			System.out.println(numero);
		}

		           
	}
	

}
