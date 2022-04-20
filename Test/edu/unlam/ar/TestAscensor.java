package edu.unlam.ar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TestAscensor {
	@Test
	public void testParaSubirDePisoAUnaPersona() {
		
		Integer maximoPersonas = 4;
		Integer personasActualesEnAscensor = 0;
		Integer pisoActual = 0;
		Persona persona = new Persona();
		Ascensor ascensor = new Ascensor(pisoActual, maximoPersonas, personasActualesEnAscensor);
		
		ascensor.subirPiso(persona);
		
		Integer resultadoEsperado = pisoActual + 1;
		
		assertEquals(resultadoEsperado, ascensor.getPisoActual());
	}
	
	@Test
	public void testParaBajarDePisoAUnaPersona() {
		
		Integer maximoPersonas = 4;
		Integer personasActualesEnAscensor = 0;
		Integer pisoActual = 0;
		Persona persona = new Persona();
		Ascensor ascensor = new Ascensor(pisoActual, maximoPersonas, personasActualesEnAscensor);
		
		ascensor.bajarPiso(persona);
		
		Integer resultadoEsperado = pisoActual - 1;
		
		assertEquals(resultadoEsperado, ascensor.getPisoActual());
		
	}
	
	@Test
	public void testParaSubirPersonasAlAscensor() {
		
		String nombre = "Lucas";
		Integer edad = 25;
		Double peso = 74.0;
		Integer maximoPersonas = 4;
		Integer personasActualesEnAscensor = 0;
		Integer pisoActual = 0;
		
		Persona persona = new Persona(nombre, edad, peso);
		Ascensor ascensor = new Ascensor(pisoActual, maximoPersonas, personasActualesEnAscensor);
		
		
		Boolean valorEsperado = ascensor.subirPersonaAlAscensor(persona);
		
		assertTrue(valorEsperado);
	}
	
	@Test
	public void testParaBajarPersonasDelAscensor() {
		
		String nombre = "Lucas";
		Integer edad = 25;
		Double peso = 74.0;
		Integer maximoPersonas = 4;
		Integer personasActualesEnAscensor = 0;
		Integer pisoActual = 0;
		
		Persona persona = new Persona(nombre, edad, peso);
		Ascensor ascensor = new Ascensor(pisoActual, maximoPersonas, personasActualesEnAscensor);
		
		
		Boolean valorEsperado = ascensor.bajarPersonaDelAscensor(persona);
		
		assertTrue(valorEsperado);
	}

	@Test
	public void testParaVerificarElMaximoDePersonas() {
		
		Integer maximoPersonas = 4;
		Integer personasActualesEnAscensor = 0;
		Integer pisoActual = 0;
		Persona persona = new Persona();
		Ascensor ascensor = new Ascensor(pisoActual, maximoPersonas, personasActualesEnAscensor);
		
		ascensor.subirPersonaAlAscensor(persona);
		
		Boolean resultadoEsperado = ascensor.verificadorDeMaximoPermitidoEnAscensor();;
		
		assertTrue(resultadoEsperado);
	}
	
}
