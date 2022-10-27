package cl.generation.f20221027;

import java.util.Scanner;

public class UsoPersona {

	public static void main(String[] args) {
		// Instanciando mi objeto:
		Persona persona1 = new Persona();
		//Scanner para pedir datos
		Scanner scanner = new Scanner(System.in);
	
		//Obtener datos
		System.out.println("Ingrese su nombre:");
		String nombre = scanner.next();
		persona1.setNombre(nombre);
		
		System.out.println("Ingrese su apellido:");
		String apellido = scanner.next();
		persona1.setApellido(apellido);
		
		System.out.println("Ingrese su edad:");
		Integer edad = scanner.nextInt();
		persona1.setEdad(edad);
		
		System.out.println("Ingrese su nacionalidad:");
		String nacionalidad = scanner.next();
		persona1.setNacionalidad(nacionalidad);
		
		System.out.println("Ingrese su mail:");
		String correo = scanner.next();
		persona1.setCorreo(correo);
		
		System.out.println("Ingrese su dirección:");
		String direccion = scanner.next();
		persona1.setDireccion(direccion);
		
		System.out.println("Ingrese su número de teléfono:");
		Integer telefono = scanner.nextInt();
		persona1.setTelefono(telefono);
		
	scanner.close();
	
	System.out.println("****Bienvenidx!!****");
	System.out.println(" Tu nombre completo es: " + persona1.getNombre()+ " " + persona1.getApellido());
	System.out.println(" Tu dirrecion es: "+ persona1.getDireccion());
	System.out.println(" Tu email es: "+ persona1.getCorreo());
	System.out.println(" Tu edad es: "+ persona1.getEdad());
	System.out.println(" Tu numero de teléfono es: "+ persona1.getTelefono());
	System.out.println(" Tu nacionalidad es: "+ persona1.getNacionalidad());

	}	
}
