package cl.generation.f20221025;

import java.util.Arrays;

public class Funciones1 {

	public static void main(String[] args) {
		//Funciones o métodos
		
		//llamar a un metodo
		nombreMetodo();
		metodo2("Rebecco");
		metodo2("Fran");
		metodo3(26);
		metodo4(90, 8.9F);
		String[] vocales = {"a","e","i","o","u"};
		metodo5(vocales);

	}
//definicion o escritura de un método
	//void -> el metodo no retorna ningun valor
	public static void nombreMetodo() {
		System.out.println("estoy dentro del metodo");
	}
	public static void metodo2(String nombre) {
		System.out.println("Soy "+nombre);
	}
	public static void metodo3(Integer numero) {
		System.out.println("Soy el número "+numero);
	}
	public static void metodo4(int numero1,Float numero2) {
		System.out.println("Soy el numero " +numero1);
		System.out.println("Soy el numero "+numero2);	
	}
	public static void metodo5(String[] arreglito) {
		System.out.println("Soy el arreglo "+ Arrays.toString(arreglito));


	}
	
}

