package cl.generation.f20221026;

import java.util.Scanner;

public class CapturarDatos {

	public static void main(String[] args) {
		Float IMC = calculoIMC();
		nivelIMC(IMC);

	}

	public static Float calculoIMC() {
		// Capturar datos ingresado por el usuario
		// abrir una variable tipo scanner
		// TIPODATO(Scanner) nombre = new TIPODATO(System.in);-> el sistem in INGRESA y
		// CAPTURA datos.
		Scanner scanner = new Scanner(System.in);
		// Cálculo de IMC;
		// imc = kilos/(estatura*estatura);
		// Pedir datos al usuario
		System.out.println("Ingrese su peso en kilogramos:");
		Float peso = scanner.nextFloat();
		System.out.println("El peso del paciente es de: " + peso + " kilogramos.");
		System.out.println("Ingrese su estatura en metros:");
		Float estatura = scanner.nextFloat();
		System.out.println("La estatura del paciente es de: " + estatura + " metros.");
		// Hacer calculo
		Float IMC = peso / (estatura * estatura);
		System.out.println("El IMC del paciente es: " + IMC);
		scanner.close();// el scanner debe cerrarse para dejar de scannear

		return IMC;
	}

	public static void nivelIMC(Float IMC) {
		/*
		 * Por debajo de 18.5 bajo peso 18.5 - 24.9 normal 25.0 - 29.9 sobrepeso 30.0 o
		 * más obesidad
		 */
		if (IMC < 18.5F) {
			System.out.println("El paciente está bajo peso.");
		} else if (IMC >= 18.5F && IMC < 25) {
			System.out.println("El paciente está en un rango normal de peso.");
		} else if (IMC >= 25F && IMC < 30) {
			System.out.println("El paciente está en sobrepeso.");
		} else {
			System.out.println("El paciente está en rango de obesidad");
		}
	}
}
