package Agenda;
import java.util.ArrayList;

public class Agenda {
	
	
	ArrayList <Persona> personas = new ArrayList<>();
	
	
	Agenda(){
		this.personas = personas;
	}
	
	
	public void eliminarElementos() {
		
		if(!personas.isEmpty()) {
			this.personas.remove(0);
		}
		
	}
	
	public Persona devolverUltimo() {
	    if (!personas.isEmpty()) {
	        return this.personas.get(personas.size() - 1);
	    } else {
	        return null;
	    }
	}


	public void listarPersonas() {
		
		if(!personas.isEmpty()) {
		for(Persona persona : personas) {
			
			System.out.print(persona.toString());
			}
		}
	}
	
	
	public void modificarDomicilio(String dni, Domicilio domicilio) {
		
		Persona personaModificar = this.buscarPersona(dni);
		
		if(personaModificar != null) {
			personaModificar.setDomicilio(domicilio);
		}
	}
	
	
	public Persona removerPersona(String dni) {
		
		Persona personaRemover = this.buscarPersona(dni);
		
		if(personaRemover != null) {
			personas.remove(personaRemover);
		}
		
		return personaRemover;
	}
	
	public boolean agregarPersona(String nombre, String apellido, String dni, Domicilio domicilio) {
		
		Persona personaBuscada = this.buscarPersona(dni);
		boolean agregado = false;
		
		if(personaBuscada == null) {
			Persona personaNueva = new Persona(nombre,apellido,dni,domicilio);
			this.personas.add(personaNueva);
			agregado = true;
		}
		return agregado;
			
	}
	
	
	public Persona buscarPersona(String dni) {
		
		Persona personaBuscada = null;
		int i = 0;
		
		while(i < this.personas.size() && personaBuscada == null) {
			if(this.personas.get(i).getDni().equalsIgnoreCase(dni)) {
				personaBuscada = this.personas.get(i);
			}
			i++;
		}
			return personaBuscada;
		
	}
	

	

}
