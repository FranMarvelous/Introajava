package cl.generation.f20221027;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		menu();

	}

	public static void menu() {
		System.out.println("*o*o*o*o*o*o*o*o*o*o*o*o*");
		System.out.println("*          MENU         *");
		System.out.println("*o*o*o*o*o*o*o*o*o*o*o*o*");
		System.out.println("* 1.      SUMAR         *");
		System.out.println("* 2.      RESTAR        *");
		System.out.println("* 3.      MULTIPLICAR   *");
		System.out.println("* 4.      DIVIDIR       *");
		System.out.println("* 0.      SALIR         *");
		System.out.println("*o*o*o*o*o*o*o*o*o*o*o*o*");

		// VARIABLES
		Scanner sc = new Scanner(System.in); // inicia scanner para pedir datos
		int opciones = 0; // opciones de operatoria
		int contadorErrores = 4; // opciones ingresadas que no están dentro de las existentes (cuantas veces te
									// equivocaste); el 4 es la cantidad de errores permitidos.

		// Menu de opciones
		// terminar la ejecucion
		// Preguntar operatoria deseada:
		do {
			System.out.println("* Seleccione una opción: ");
			opciones = sc.nextInt();

			// si la opcion es cero, salir del do-while
			if (opciones == 0) {
				System.out.println("Usted ha salido del programa.");
				break;
			}

			// Control de errores
			contadorErrores--;// descuenta oportunidades de error
			if (contadorErrores == 0) {
				System.out.println("Se agotó la cantidad de intentos, try again!");
				break;

			} else if (opciones < 0 || opciones > 4) {// saber cuantas veces se ha equivocado
				System.out.println("Quedan " + contadorErrores + " intentos restantes.");
			}

		} while (opciones < 0 || opciones > 4);

		if (opciones == 0 || contadorErrores == 0) {
			System.out.println("Adios!!");
		} else {// solo ingresará para opciones 1,2,3,4.
				// Solicitar 2 numero (scanner ya creado antes)
				// capturo 2 numeros

			System.out.println("Ingresa el primer número:");
			float numero1 = sc.nextFloat();
			System.out.println("Ingresa el segundo número:");
			float numero2 = sc.nextFloat();

			float resultado = 0;

			switch (opciones) {
			case 1: // SUMAR
				resultado = numero1 + numero2;
				System.out.println("El resultado de la suma es: " + resultado);
				break;
			case 2:// RESTAR
				resultado = numero1 - numero2;
				System.out.println("El resultado de la resta es: " + resultado);
				break;
			case 3:// MULTIPLICAR
				resultado = numero1 * numero2;
				System.out.println("El resultado de la multiplicación es: " + resultado);
				break;
			case 4:// DIVIDIR
				if (numero2 == 0) {
					System.out.println("NO SE PUEDE DIVIDIR POR CERO!");
				} else {
					resultado = numero1 / numero2;
					System.out.println("El resultado de la división es: " + resultado);
				}
				break;

			default:
				System.out.println("Opción no válida");
				break;
			}

			// calculadora con 4 operaciones basicas
			// solicitar y capturar 2 numeros float (recibir y almacernar)
			// imprimir resultados y guardar variables
			// ofrecer opciones de repeticion (bucles)
			// definir los metodos
			// validaciones
			// limpiar las variables

		}
	}
}
