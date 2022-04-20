package edu.unlam.ar;

//import java.util.ArrayList;

public class Ascensor {

	private Integer pisoActual;
	private Integer maximoPersonas;
	private Integer personasActualesEnAscensor;
	//private ArrayList <Persona> personas = new ArrayList<>();

	public Ascensor(Integer pisoActual, Integer maximoPersonas, Integer personasActualesEnAscensor) {
		this.pisoActual = pisoActual;
		this.maximoPersonas = maximoPersonas;
		this.personasActualesEnAscensor = personasActualesEnAscensor;
	}

	public void subirPiso(Persona persona) {
		this.pisoActual++;
	}
	
	public void bajarPiso(Persona persona) {
		this.pisoActual--;		
	}
	
	public Integer getPisoActual() {
		return pisoActual;
	}

	public Integer getPersonasActualesEnAscensor() {
		return personasActualesEnAscensor;
	}

	public Integer getMaximoPersonas() {
		return maximoPersonas;
	}

	public Boolean subirPersonaAlAscensor(Persona persona) {
		Boolean personaIngresadaExitosamente = false;
		if(this.verificadorDeMaximoPermitidoEnAscensor() == true) {
			personaIngresadaExitosamente = true;
			personasActualesEnAscensor++;
		}
		return personaIngresadaExitosamente;
	}

	public boolean verificadorDeMaximoPermitidoEnAscensor() {
		if(personasActualesEnAscensor < maximoPersonas) {
			return true;
		}
		return false;
	}

//	public Persona buscarPersonaPorNombre(String nombre) {
//		Persona personaBuscada = new Persona();
//		
//		for (Persona persona : personas) {
//			if(nombre == persona.getNombre()) {
//				persona = personaBuscada;
//			}
//		} 
//		return personaBuscada;
//	}

	public Boolean bajarPersonaDelAscensor(Persona persona) {
		personasActualesEnAscensor--;
		return true;
	}


	
	
}
