package co.edu.unbosque.model;



/**
 * @author Gabriel Blanco Clase "multitoma" donde se define la soluci�n de la
 *         problem�tica
 */
public class Mundo {
	private GabenFile archivo = new GabenFile();
	private GabenProperties propiedad = new GabenProperties();
	private Binaries binarios = new Binaries();

	public String login(String user, String password) throws Exception {
		String data[] = archivo.leerArchivo("./docs/Required/db's/users.csv").split("\n");
		for (int i = 0; i < data.length; i++) {
			String[] profile = data[i].split(",");
			if(checkRegistry(user, password)) {
				return profile[0]+","+profile[1]+","+profile[2]+",";
			}
		}
		return null;
	}

	public boolean checkRegistry(String user, String password) throws Exception {
		String data[] = archivo.leerArchivo("./docs/Required/db's/users.csv").split("\n");
		for (int i = 0; i < data.length; i++) {
			String[] profile = data[i].split(",");
			if (user.equals(profile[0]) && password.equals(profile[1])) {
				return true;
			}
		}
		return false;
	}

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
