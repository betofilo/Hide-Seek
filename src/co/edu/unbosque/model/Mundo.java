package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Binaries;
import co.edu.unbosque.model.persistence.GabenFile;
import co.edu.unbosque.model.persistence.GabenProperties;

/**
 * @author Gabriel Blanco
 * Clase "multitoma" donde se define la solución de la problemática
 */
public class Mundo {
	private GabenFile archivo = new GabenFile();
	private GabenProperties propiedad = new GabenProperties();
	private Binaries binarios = new Binaries();
	
	public String toString() {
		return "Buena Hackerman, crack, leyenda";
	}

	public GabenFile getArchivo() {
		return archivo;
	}

	public GabenProperties getPropiedad() {
		return propiedad;
	}

	public Binaries getBinarios() {
		return binarios;
	}
}
