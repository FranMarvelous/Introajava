package cl.generation.f20221028;

public class UsoEstudiante {

	public static void main(String[] args) {
		// INSTANCIAR OBJETO (ESTUDIANTE)
		Estudiante estudiante = new Estudiante("Rebecco","Marvelous","27869745-3");
		System.out.println(estudiante.toString());//vemos que tenemos dentro del objeto
		estudiante.setEdad(3);
		estudiante.setCorreo("rebeccomarvelous@gmail.com");
		estudiante.setCurso("1A");
		System.out.println(estudiante.toString());
	}

}
