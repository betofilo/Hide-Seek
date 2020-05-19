package co.edu.unbosque.model;

import java.util.ArrayList;

public class Tienda {

	public String nombre;
	
	private ArrayList <Sucursal> sucursales;
	private ArrayList <Administrador> administradores;
	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
		sucursales = new ArrayList<Sucursal>();
		administradores = new ArrayList<Administrador>();
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Sucursal> getSucursales() {
		return sucursales;
	}
	public void setSucursales(ArrayList<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}
	public ArrayList<Administrador> getAdministradores() {
		return administradores;
	}
	public void setAdministradores(ArrayList<Administrador> administradores) {
		this.administradores = administradores;
	}
	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", sucursales=" + sucursales + ", administradores=" + administradores + "]";
	}
  
	
}
