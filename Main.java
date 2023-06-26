package Agenda;

public class Main {

	public static void main(String[] args) {
		
		
	Agenda agenda1 = new Agenda();
		
		
		Domicilio domicilio1 = new Domicilio("zapiola", "2323", "caba");
		Domicilio domicilio2 = new Domicilio("cabildo", "2323", "caba");
		
		agenda1.agregarPersona("agustin", "suarez", "33203112", domicilio1);
		agenda1.agregarPersona("martin", "martinez", "232323233", domicilio1);
		agenda1.agregarPersona("marta", "Colombini", "23322232", domicilio1);
		
		
		
		agenda1.removerPersona("23");
		agenda1.removerPersona("33203112");
		
		agenda1.modificarDomicilio("23", domicilio2);
		agenda1.modificarDomicilio("33203112", domicilio2);
		
		
		agenda1.listarPersonas();

	}

}
