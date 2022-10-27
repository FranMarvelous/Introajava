package cl.generation.f20221027;

public class UsoObjeto {

	public static void main(String[] args) {
		// Instancia de clase (creamos variable de tipo AUTO)
		Auto auto1 = new Auto(); //después del "=" estamos inicializando, el parentesis es el constructor vacío de auto.
		
		//asignar valores a los atributos privados con setters, a través de constructor vacío
		auto1.setColor("Rojo");
		auto1.setMarca("Peugeot");
		
		//Saber el contenido de los atributos:
		System.out.println(auto1.toString());

		//consultar un el contenido de un atributo en particular
		System.out.println(auto1.getColor());
		System.out.println(auto1.getModelo());//si arroja null es porque no tiene valor
		
		//Instancia con constructor con parametros (sin valores pero con las cajitas esperando sus valor)
		Auto car = new Auto("Nissan","Negro","Qashqai",1.6f,10.0f,240f);
		System.out.println(car.getModelo());
	}

}
