package cl.generation.f20221026;

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
		//metodos con llamados
		//retorno1();//no hace nada con el valor retornado
		//System.out.println(retorno1());
		Integer valorRetornado = retorno1();//captura valor determinado en la funcion
		System.out.println(valorRetornado/7);//35/7=5
		System.out.println(valorRetornado/5);//35/5=7
		
		String nombreCompleto = getNombreCompleto("Francisca", "Lazo", "Cerpa");
		System.out.println("El nombre completo es: "+nombreCompleto);
		
		
		
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
	//funciones con retorno
	
	//public static void retorno1(){}//void no retorna nadda
	//public static TIPODATO nombre_retorno(){}//pedimos lo que queramos retornar
	public static Integer retorno1() {
		Integer totalAlumnos= 35;
		return totalAlumnos;
	}
	//variable publica estática(no instanciada) TIPODATO nombredato (TIPODATO nombrevar, TIPODATO nombrevar,TIPODATO nombrevar)	
	/**
	 * METODO QUE UNE TODOS LOS DATOS!
	 * @param nombre
	 * @param apePaterno
	 * @param apeMaterno
	 * @return nombreCompleto
	 */
	public static String getNombreCompleto(String nombre, String apePaterno, String apeMaterno) {
		String nombreCompleto = nombre+" "+apePaterno+" "+apeMaterno;
		return nombreCompleto;//retornamos el contenido de la variable
	}
}

