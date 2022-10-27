package cl.generation.f20221027;

public class Persona {
	//Objeto persona
	//Atributos Objeto:
	private String nombre;
	private String apellido;
	private Integer edad;
	private String nacionalidad;
	private String correo;
	private String direccion;
	private Integer telefono;
	
	//Constructor vacío:
	public Persona() {
		super();
	}

	//constructor con parámetros
		public Persona(String nombre, String apellido, Integer edad, String nacionalidad, String correo, String direccion,
			Integer telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.correo = correo;
		this.direccion = direccion;
		this.telefono = telefono;
	}

		//Getters y setters
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public Integer getEdad() {
			return edad;
		}

		public void setEdad(Integer edad) {
			this.edad = edad;
		}

		public String getNacionalidad() {
			return nacionalidad;
		}

		public void setNacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public Integer getTelefono() {
			return telefono;
		}

		public void setTelefono(Integer telefono) {
			this.telefono = telefono;
		}
	//

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", nacionalidad=" + nacionalidad
					+ ", correo=" + correo + ", direccion=" + direccion + ", telefono=" + telefono + "]";
		}
		


}
