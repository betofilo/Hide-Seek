package co.edu.unbosque.model;

import java.util.ArrayList;

public class Tienda {

	public String nombre;
	
	private ArrayList <Sucursal> sucursales;
	private ArrayList <Administrador> administradores;
	private ArrayList <Compra> compras;
	
	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
		sucursales = new ArrayList<Sucursal>();
		administradores = new ArrayList<Administrador>();
		compras= new ArrayList<Compra>();
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
	
	public ArrayList<Compra> getCompras() {
		return compras;
	}


	public void setCompras(ArrayList<Compra> compras) {
		this.compras = compras;
	}
	
	
	

	
	public Compra[] buscarCompraSucursal( String nombresucursal) {
		int p=0;
		Compra[] logcompras= new Compra[noComprasSucursal(nombresucursal)];
		for (int i = 0; i < compras.size(); i++) {
			String aux=compras.get(i).getTienda();
		
			if(aux==nombresucursal) {
			Compra auxc=compras.get(i);
			logcompras[p]=auxc;
			p++;
			}
			
		}
			
			return logcompras;
	}
	
	public int noComprasSucursal(String nombresucursal) {
		int p=0;
		for (int i = 0; i < compras.size(); i++) {
			String aux=compras.get(i).getTienda();
		
			if(aux==nombresucursal) {
				p++;
			}
		}
		
		return p;
	}
	
	//comprascliente
	
	public Compra[] buscarCompraCliente( String usercliente) {
		int p=0;
		Compra[] logcompras= new Compra[noComprasClientes(usercliente)];
		for (int i = 0; i < compras.size(); i++) {
			String aux=compras.get(i).getCliente();
		
			if(aux==usercliente) {
			Compra auxc=compras.get(i);
			logcompras[p]=auxc;
			p++;
			}
			
		}
			
			return logcompras;
	}
	
	public int noComprasClientes(String usercliente) {
		int p=0;
		for (int i = 0; i < compras.size(); i++) {
			String aux=compras.get(i).getCliente();
		
			if(aux==usercliente) {
				p++;
			}
		}
		
		return p;
	}
	
	
	//aqui termina compras por cliente
	
	
	
	
	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + "]";
	}
  
	
}
