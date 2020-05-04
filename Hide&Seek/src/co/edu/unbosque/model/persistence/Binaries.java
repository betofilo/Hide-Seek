package co.edu.unbosque.model.persistence;

import java.io.*;

/**
 * @author Gabriel Blanco Clase para hacer archivos binarios
 */
public class Binaries {

	/**
	 * Método para escribir archivos con datos de tipo double
	 * @author Gabriel Blanco
	 * @param location
	 * @param value
	 * @return
	 * @throws IOException
	 */
	public String writeDouble(String location, double value) throws IOException {
		File f = new File(location);
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeDouble(value);
		dos.flush();
		dos.close();
		return f.getAbsolutePath();
	}

	/**
	 * Método para leer archivos con datos de tipo double
	 * @author Gabriel Blanco
	 * @param location
	 * @return
	 * @throws IOException
	 */
	public double readDouble(String location) throws IOException {
		File f = new File(location);
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		double bin = dis.readDouble();
		dis.close();
		return bin;

	}

	/**
	 * Método para escribir archivos de tipo int
	 * @author Gabriel Blanco
	 * @param location
	 * @param value
	 * @return
	 * @throws IOException
	 */
	public String writeInt(String location, int value) throws IOException {
		File f = new File(location);
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(value);
		dos.flush();
		dos.close();
		return f.getAbsolutePath();
	}

	/**
	 * Método para leer archivos de tipo int
	 * @author Gabriel Blanco
	 * @param location
	 * @return
	 * @throws IOException
	 */
	public int readInt(String location) throws IOException {
		File f = new File(location);
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		int bin = dis.readInt();
		dis.close();
		return bin;
	}

	/**
	 * Método para escribir archivos de tipo byte Si quiere, puede cambiarle los
	 * valores a la variable "encryption_val" para que el archivo sea encryptado.
	 * @author Gabriel Blanco
	 * @param location
	 * @param value
	 * @return
	 * @throws IOException
	 */
	public String writeBytes(String location, String value) throws IOException {
		int encryption_val = 0;
		File f = new File(location);
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		byte[] val = value.getBytes();
		for (int i = 0; i < val.length; i++) {
			dos.writeInt(val[i] + encryption_val);
		}
		dos.flush();
		dos.close();
		return f.getAbsolutePath();
	}

	/**
	 * Método para leer archivos de tipo byte Si escribió un archivo con un valor
	 * diferente al de "encryption_val" por defecto, debe cambiarle los valores a la
	 * variable "encryption_val" para que el archivo sea desencryptado.
	 * @author Gabriel Blanco
	 * @param location
	 * @param value
	 * @return
	 * @throws IOException
	 */
	public String readBytes(String location) throws IOException {
		int encryption_val = 0;
		File f = new File(location);
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		byte[] mybin = dis.readAllBytes();
		String bin = "";
		for (int i = 0; i < mybin.length; i++) {
			if (!(mybin[i] == 0)) {
				int value = Byte.valueOf(mybin[i]) - encryption_val;
				mybin[i] = (byte) value;
				byte[] realbin = { mybin[i] };
				bin += new String(realbin);
			}
		}
		dis.close();
		return bin;
	}

}
