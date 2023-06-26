package Agenda;

public class Persona {
	String nombre;
	String apellido;
	String dni;
	Domicilio domicilio;
	
	
	public Persona(String nombre, String apellido, String dni, Domicilio domicilio) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
	}


	public String getDni() {
		return dni;
	}


	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", domicilio=" + domicilio
				+ "]";
	}
	
	
	

}
