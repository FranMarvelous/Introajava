package cl.generation.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class ActividadEstudiante {

	public static void main(String[] args) {
		// Scanner para pedir datos
		Scanner scanner = new Scanner(System.in);
		// CREAR ARREGLO PARA CONTENER LOS ESTUDIANTES
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		// CREAR REPETICION:
		int continuar = 2;

		do {
			// cada vez que queramos agregar un estudiante debemos instanciar(crear) un
			// nuevo estudiante
			Estudiante estudiante1 = new Estudiante();
			// Obtener datos
			System.out.println("Ingrese nombre del estudiante:");
			String nombre = scanner.next();
			estudiante1.setNombre(nombre);

			System.out.println("Ingrese apellido del estudiante:");
			String apellido = scanner.next();
			estudiante1.setApellido(apellido);

			System.out.println("Ingrese edad del estudiante:");
			Integer edad = scanner.nextInt();
			estudiante1.setEdad(edad);

			System.out.println("Ingrese rut del estudiante: ");
			String rut = scanner.next();
			estudiante1.setRut(rut);

			System.out.println("Ingrese curso del estudiante:");
			String curso = scanner.next();
			estudiante1.setCurso(curso);

			System.out.println("Ingrese correo electrónico del estudiante:");
			String correo = scanner.next();
			estudiante1.setCorreo(correo);

			// AGREGAR OBJETO AL ARREGLO:
			estudiantes.add(estudiante1);

			// PREGUNTAR POR REPETICION
			System.out.println("¿Desea agregar otro estudiante?");
			System.out.println("Ingrese: (1)SI | (2)NO");
			continuar = scanner.nextInt();
			scanner.nextLine();// corrige el error de capturar un número y despues solicitar un string

			

		} while (continuar == 1);
		
		// MOSTRAR DATOS:
		for(Estudiante estudiante1 : estudiantes) {
			System.out.println("------------------------------");
			System.out.println("-------FICHA ESTUDIANTE-------");
			System.out.println("------------------------------");
			System.out.println("Nombre y apellido del estudiante: " + estudiante1.getNombre() + " " + estudiante1.getApellido());
			System.out.println("Edad del estudiante: " + estudiante1.getEdad());
			System.out.println("Rut del estudiante: " + estudiante1.getRut());
			System.out.println("Curso del estudiante: " + estudiante1.getCurso());
			System.out.println("Correo electrónico del estudiante: " + estudiante1.getCorreo());
			System.out.println("------------------------------");

		}
		
		//ACCEDER A OBJETO ESPECIFICO DENTRO DEL ARRAY
		System.out.println(estudiantes.get(0));
		//ACCEDER A ATRIBUTO DENTRO DEL OBJETO:
		System.out.println(estudiantes.get(0).getNombre());
	}

}
