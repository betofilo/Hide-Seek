package co.edu.unbosque.model.persistence;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Gabriel Blanco Clase para usar Archivos. Usar leerArchivo() para leer
 *         archivos y escribirArchivo() para escribirlos. Suena redudante pero
 *         funciona
 */
public class GabenFile {

	private File carpetaDocs = new File("./docs");
	private File carpetaOutput = new File("./docs/Output");

	public GabenFile() {
		if (!carpetaDocs.exists())
			carpetaDocs.mkdir();
		if (!carpetaOutput.exists())
			carpetaOutput.mkdir();
	}

	/**
	 * Método para leer un archivo
	 * 
	 * @author Gabriel Blanco
	 * @param ubicacion
	 * @return
	 * @throws IOException
	 */
	public String leerArchivo(String ubicacion) throws IOException {
		String pastLine = "";
		File archivoAyuda = new File(ubicacion);
		FileReader reader = new FileReader(archivoAyuda);
		BufferedReader buffer = new BufferedReader(reader);
		String ayuda = buffer.readLine();
		while (ayuda != null) {
			pastLine += ayuda + "\n";
			ayuda = buffer.readLine();
		}
		reader.close();
		return pastLine;
	}

	/**
	 * Método para sobreescribir un archivo. Va al final del archivo y escribe la
	 * nueva informacion.
	 * 
	 * @author Gabriel Blanco
	 * @param linea
	 * @param ubicacion
	 * @throws IOException
	 */
	public String sobreescribirArchivo(String linea, String ubicacion) throws IOException {
		File file = new File(ubicacion);
		FileWriter writer = new FileWriter(file, true);
		PrintWriter printer = new PrintWriter(writer);
		printer.println(linea);
		writer.close();
		return file.getAbsolutePath();
	}

	/**
	 * Método para escribir un archivo. <b>ADVERTENCIA!</b> Si esta pensando en usar
	 * este método para sobreescribir un archivo, va a borrar el contenido de este e
	 * ingresar uno nuevo. Usar
	 * 
	 * <pre>
	 * sobreescribirArchivo(linea, ubicacion)
	 * </pre>
	 * 
	 * en ese caso.
	 * 
	 * @author Gabriel Blanco
	 * @param linea
	 * @param ubicacion
	 * @throws IOException
	 */
	public String escribirArchivo(String linea, String ubicacion) throws IOException {
		File file = new File(ubicacion);
		FileWriter writer = new FileWriter(file);
		PrintWriter printer = new PrintWriter(writer);
		printer.println(linea);
		writer.close();
		return file.getAbsolutePath();
	}
	
	/** 
	 * Método para eliminar un archivo
	 * @author Gabriel Blanco
	 * @param ubicacion
	 * @return
	 * @throws IOException
	 */
	public String eliminarArchivo(String ubicacion) throws IOException {
		File file = new File(ubicacion);
		file.delete();
		return file.getAbsolutePath();
	}
	
	/**
	 * Método para crear directorios
	 * @author Gabriel Blanco
	 * @param ubicacion
	 */
	public void crearDirectorios(String ubicacion) {
		String[] location = ubicacion.split("/");
		for (int i = 1; i < location.length; i++) {
			File file = new File(location[i]);
			if(!file.exists()) {
				file.mkdir();
			}
		}
	}
	
	/**
	 * Método para eliminar directorios
	 * @author Gabriel Blanco
	 * @param ubicacion
	 * @throws IOException
	 */
	public void eliminarDirectorios(String ubicacion) throws IOException {
		String[] location = ubicacion.split("/");
		for (int i = (location.length-1); i > 1; i--) {
			File file = new File(location[i]);
			file.delete();
		}
	}

	/**
	 * Método para guardar un log con las excepciones.
	 * 
	 * @author Gabriel Blanco
	 * @param linea
	 * @throws IOException
	 */
	public String makeLog(String linea) throws IOException {
		Date date = new Date();
		SimpleDateFormat datef = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat date2f = new SimpleDateFormat("HH:mm:ss");
		File myLog = new File(carpetaOutput + "/myLog " + datef.format(date) + ".log");
		if (!myLog.exists()) {
			escribirArchivo(
					"An exception has occured on " + date2f.format(date) + "\n===================================\n"
							+ linea + "\n" + "===================================\n",
					carpetaOutput + "/myLog " + datef.format(date) + ".log");
		} else {
			sobreescribirArchivo(
					"An exception has occured on " + date2f.format(date) + "\n===================================\n"
							+ linea + "\n" + "===================================\n",
					carpetaOutput + "/myLog " + datef.format(date) + ".log");
		}
		return myLog.getAbsolutePath();
	}
	
	/**
	 * Método para escribir un archivo encriptado
	 * 
	 * @author Gabriel Blanco
	 * @param linea
	 * @param ubicacion
	 * @return
	 * @throws IOException
	 */
	public String escribirArchivoEncriptado(String linea, String ubicacion) throws IOException {
		int encryption_val = 5;
		File file = new File(ubicacion);
		FileWriter writer = new FileWriter(file);
		PrintWriter printer = new PrintWriter(writer);
		byte[] data = linea.getBytes();
		for (int i = 0; i < data.length; i++) {
			printer.write(data[i]+encryption_val);
		}
		printer.close();
		return file.getAbsolutePath();
	}
	
	/**
	 * Método para leer un archivo encriptado
	 * 
	 * @author Gabriel Blanco
	 * @param ubicacion
	 * @return
	 * @throws IOException
	 */
	public String leerArchivoEncriptado(String ubicacion) throws IOException {
		int encryption_val = 5;
		File file = new File(ubicacion);
		FileReader reader = new FileReader(file);
		BufferedReader buffer = new BufferedReader(reader);
		byte[] encrypted = buffer.readLine().getBytes();
		String finaldata = "";
		for (int i = 0; i < encrypted.length; i++) {
			if(!(encrypted[i] == 0)) {
				int decryptor = Byte.valueOf(encrypted[i])-encryption_val;
				encrypted[i] = (byte) decryptor;
				byte[] utfData = {encrypted[i]};
				finaldata += new String(utfData);
			}
		}
		buffer.close();
		return finaldata;
	}

}
