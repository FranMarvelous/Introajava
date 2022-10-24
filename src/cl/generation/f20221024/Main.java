package cl.generation.f20221024;

public class Main {

	public static void main(String[] args) {
		//las variables
		//var nombre_variable
		
		//variables ;primitivas, caracter estatico
		int numero1 = 2;//variable numerica -2^31 y +2^31-1
		//tamaño mínimo -2,147,483,648 y máximo 2,147,483,647
		long numero2 = 2147483648l;//-2^63 y +2^63-1
		
		float decimal= 2.5f;
		float decimal2= (float) 2.5;//castear
		double decimal3 = 9.8d;
		
		char caracter = '4';//Siempre en 'comilla simple'
		
		boolean respuesta= true;//false
		
		//short y byte son otras primitivas
		
		System.out.println(numero1+ " "+numero2+" "+decimal+" "+decimal2);
		System.out.println(decimal3+" "+caracter+" "+respuesta);
		
		String palabra= "holajajsdojas";//siempre con "doble comilla", es un array, objeto.
		//palabra
		
		//variables objeto
		Integer numero3= 2;//variable numerica -2^31 y +2^31-1
		//numero2.
		Long numero4 = 123567890L;
		Float numero5 = 34993274F;
		Double numero6 = 34824986423D;
		
		//conversion a otros tipos de datos numericos
		
		float f1 = 55.055F;
		
		Float f2 = new Float(f1);
				
		 double d1 = f2.doubleValue();
		
		System.out.println(d1);
		
	
	}

}
