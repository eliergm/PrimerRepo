package Orden;

public class Persona implements Comparable <Persona>{
	
	private String nombre;
	private String dni;
	private String apellido;
	private int edad;
	private double peso;
	
	public Persona(){}
	
	public Persona(String nombre, String dni, String apellido, int edad, double peso){
		this.nombre= nombre;
		this.dni= dni;
		this.apellido= apellido;
		this.edad= edad;
		this.peso= peso;		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Persona: " + nombre + ", dni:" + dni + ", apellido:"
				+ apellido + ", edad:" + edad + ", peso:" + peso + ".";
	}

	@Override
	public int compareTo(Persona otra) {
		// TODO Auto-generated method stub
		
		return this.nombre.compareTo(otra.getNombre());
	}
	


}
