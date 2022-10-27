package cl.generation.f20221027;

import java.util.Scanner;

public class AreaPerimetro {

	public static void main(String[] args) {
		// CALCULO AREA Y PERIMETRO
		menu();
	}

	// solcitar el programa
	// TRIANGULO:
	// área = (base * altura)/2
	// périmetro = base1 + base2 + base3

	// RECTANGULO:
	// área = base * altura
	// perímetro = base*2 + altura*2

	// CIRCUNFERENCIA
	// área = Math.PI(math.pow(radio,2))
	// perímetro = 2*Math.PI*radio;

	// opcional
	// area de un cuuadrado base * base

	public static void menu() {
		System.out.println("**************************");
		System.out.println("*          Menú          *");
		System.out.println("**************************\n");
		System.out.println("Escoja operación deseada:");
		System.out.println("1. Calcular área y perímetro de TRIANGULO");
		System.out.println("2. Calcular área y perímetro de RECTANGULO");
		System.out.println("3. Calcular área y perímetro de CIRCUNFERENCIA ");
		System.out.println("0. SALIR ");
		System.out.println("**************************\n");

		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		do {
			System.out.println("* Selecciona una opción *");
			opcion = sc.nextInt();

		} while (opcion < 0 || opcion > 3);
		
		//PEDIR BASES:
		//System.out.println("Ingresa la base:");
		//double base1 = sc.nextDouble();
		//System.out.println("Ingrese el lado 2");
		//double base2 = sc.nextDouble();
		//System.out.println("Ingrese el lado 3");
		//double base3 = sc.nextDouble();
		//PEDIR ALTURA:
		//System.out.println("Ingresa la altura:");
		//double altura = sc.nextDouble();
		//PEDIR RADIO:
		//System.out.println("Ingresa el radio:");
		//double radio = sc.nextDouble();*//

		double resultadoArea= 0;
		double resultadoPeri= 0;

		switch (opcion) {
		case 1: // AREA Y PERI TRIANGULO
			System.out.println("Ingresa la base:");
			double base1 = sc.nextDouble();
			System.out.println("Ingrese el lado 2");
			double base2 = sc.nextDouble();
			System.out.println("Ingrese el lado 3");
			double base3 = sc.nextDouble();
			//PEDIR ALTURA:
			System.out.println("Ingresa la altura:");
			double altura = sc.nextDouble();
			resultadoArea = (base1*altura)/2; 
			System.out.println("El área del triángulo es: " + resultadoArea);
			resultadoPeri = (base1 + base2 +base3);
			System.out.println("El perímetro del triángulo es: "+resultadoPeri);
			break;
		case 2:// AREA Y PERI RECTANGULO
			System.out.println("Ingresa la base:");
			double baseRectangulo = sc.nextDouble();
			System.out.println("Ingresa la altura:");
			double alturaRectangulo = sc.nextDouble();
			resultadoArea = (baseRectangulo*alturaRectangulo); 
			System.out.println("El área del rectángulo es: " + resultadoArea);
			resultadoPeri = (baseRectangulo*2 + alturaRectangulo*2);
			System.out.println("El perímetro del rectángulo es: "+resultadoPeri);
			break;
		case 3:// MULTIPLICAR
			
			break;
		case 4:// DIVIDIR
	
				
		
			break;

		default:
			
			break;
		}
	}

}