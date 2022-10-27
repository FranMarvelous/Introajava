package cl.generation.f20221027;

public class Auto {
	// ATRIBUTOS
	// private TIPODATO nombrevar;
	private String marca;// "Nissan"
	private String color;// "Negro"
	private String modelo;// "ñuñuki"
	private Float cilindrada;// 1.6 cc
	private Float rendimiento;// 10.5 kms/litro
	private Float velocidad;// km/hr

	// Generar constructor -> boton derecho>source>generate constructor.
	// nos permite instanciar el objeto
	// nos permite inicializar los atributos(variables)
	public Auto() { // constructor vacío, lo creamos solo para asignar espacio (inicializar) y agregar datos en el futuro.
		super();
	}

	public Auto(String marca, String color, String modelo, Float cilindrada, Float rendimiento, Float velocidad) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.rendimiento = rendimiento;
		this.velocidad = velocidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Float cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Float getRendimiento() {
		return rendimiento;
	}

	public void setRendimiento(Float rendimiento) {
		this.rendimiento = rendimiento;
	}

	public Float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Float velocidad) {
		this.velocidad = velocidad;
	}

	// getters y setter (accesadores y mutadores) >>source>create getter and setters
	// mutar = cambiar, modificar, sobreescribir, etc.
	//ej: public void setVelocidad(Float velocidad){
	    //this.velocidad = velocidad;
	
	//metodos del objeto = acciones
	
	public void avanzar() {
		System.out.println("estoy dentro del avanzar");
	}

	@Override //ESTAMOS HEREDANDO UN METODO
	public String toString() {
		return "Auto [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", cilindrada=" + cilindrada
				+ ", rendimiento=" + rendimiento + ", velocidad=" + velocidad + "]";
	}
	
	
	
	
	
	
	
	
}
