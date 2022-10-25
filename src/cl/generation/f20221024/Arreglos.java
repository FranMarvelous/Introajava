package cl.generation.f20221024;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		// Arreglos(Array) en Java, estáticos = no cambia de tamaño.
		int[] arreglo = new int[3];
		// arreglo.length; tamaño del arreglo
		// agregar datos
		arreglo[0] = 4;
		arreglo[1] = 8;
		arreglo[2] = 12;
		// arreglo[3]=24; -> Index 3 out of bounds for length 3

		System.out.println(arreglo.toString()); // PYTHON
		System.out.println(Arrays.toString(arreglo)); // imprimir arreglo en string
		System.out.println(arreglo[0]);

		// {}
		int[] sinNumeros = {};// cero -> se crea el array con 0 elementos
		System.out.println(sinNumeros.length);

		String[] vocales = { "a", "e", "i", "o", "u" };
		System.out.println("cantidad de elementos: " + vocales.length);
		vocales[1] = "o";
		vocales[3] = "e";

		System.out.println(Arrays.toString(vocales));

		// crear un array de numeros flotantes de tamaño 6
		float[] numeros = new float[6];
		// agregar 6 elementos al arreglo
		numeros[0] = 33; // permite un numero entero porque igualmente entra en decimales como "33.0"
		numeros[0] = -0.6f;// tambien permite numeros negativos.

		int[] numerosInt = new int[2];
		numerosInt[0] = (int) 0.2;// al castear se queda el entero y se pierde el decimal
		System.out.println(numerosInt[0]);

		/*
		 * crear un arreglo de enteros tamaño 100 y agregar valores dinamicamente, desde
		 * el 1 al 100
		 */

		int[] numbers = new int[100];
		for (int i = 1; i <= numbers.length; i++) {
			numbers[i - 1] = i;
		}

		System.out.println(Arrays.toString(numbers));

		/*
		 * crear un arreglo de enteros tamaño 100 y agregar valores dinamicamente, desde
		 * el 100 al 1
		 */

		int[] numbers100a1 = new int[100];
		for (int i = numbers100a1.length; i > 0; i--) {
			numbers100a1[numbers100a1.length - i] = i;
		}

		System.out.println(Arrays.toString(numbers100a1));

		//

		int[] numeroInt = { -3, -5, 4, 12, 3, 35, -35, 77, -1, 0 };
		int numeroMax = 0;
		int numeroMin = 0;

		for (int i = 0; i < numeroInt.length; i++) {
			if (numeroInt[i] > numeroMax) { // 12 > 4
				numeroMax = numeroInt[i]; // numeroMax = 4
			}
			if (numeroInt[i] < numeroMin) {
				numeroMin = numeroInt[i];
			}
		}
		System.out.println(numeroMax);
		System.out.println(numeroMin);

		// Array impares y pares
		
		//El mismo arreglo crear otros 2 arreglos, 
		//uno con solo los pares y otro arreglo solo con los impares.

		int[] impares = new int [numeroInt.length];
		int[] pares = new int [numeroInt.length];
		//impares: 
		for (int i = 0; i < numeroInt.length; i++){
		  	if(numeroInt[i] %2 == 0){ //obtenemos el par
		      pares[i] = numeroInt[i]; //{0,0,4,12,0,0,0,0,0,0}
		    }else{
		      impares[i] = numeroInt[i]; //{-3,-5,0,0,3,35,-35,77,-1,0}
		    }
		}

		// Promedio
		int suma1 = 0;
		int promedio = 0;
		for (int i = 0; i < numeroInt.length; i++) {

			suma1 += numeroInt[i];
			promedio = suma1 / numeroInt.length;
		}
		System.out.println(promedio);
	}

}
