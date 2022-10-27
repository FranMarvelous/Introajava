package cl.generation.f20221026;

import java.util.Scanner;

public class BucleDoWhileTest {

	public static void main(String[] args) {
		// doWhile
		// a lo menos se ejecuta una vez
		Scanner scanner = new Scanner(system.in);
		int edad = 0;

		do {//ingresa lo que va a imprimir o ejecutar hasta q la condicion sea false
			System.out.println("Ingresa tu edad: ");
			edad = scanner.nextInt();
		
		} while (edad < 18 || edad > 120); //aqui condicionamos para que vuelva a pedir la edad siempre que sea menor a 18
			System.out.println("Edad ingresada: " + edad);

			//Peso
		do { 
			System.out.println("Ingresa tu peso en kilos: ");
			kilos = scanner.nextFloat();

		} while (kilos );
	}

}
