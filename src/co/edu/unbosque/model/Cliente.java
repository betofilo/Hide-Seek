package co.edu.unbosque.model;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private double cupo;
	private String userid;
	private String correo;
	private String contraseña;
	private String genero;
	private String tipo;
	private double gasto;
	private ArrayList <Pareja> parejas;
	private ArrayList <Horario> horarios;
	
	
	
	
	
	
	
	public Cliente(String nombre, double cupo,String userid, String correo, String contraseña, String genero) {
		super();
		this.nombre = nombre;
		this.cupo = cupo;
		this.userid = userid;
		this.correo = correo;
		this.contraseña = contraseña;
		this.genero = genero;
		this.tipo = "0";
		this.gasto=0;
		parejas = new ArrayList<Pareja>();
		horarios = new ArrayList<Horario>();
	}
	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCupo() {
		return cupo;
	}
	public void setCupo(double cupo) {
		this.cupo = cupo;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}


	public double getGasto() {
		return gasto;
	}


	public void setGasto(double gasto) {
		this.gasto = gasto;
	}


	public ArrayList<Pareja> getParejas() {
		return parejas;
	}

	public void setParejas(ArrayList<Pareja> parejas) {
		this.parejas = parejas;
	}


	public ArrayList<Horario> getHorarios() {
		return horarios;
	}


	public void setHorarios(ArrayList<Horario> horarios) {
		this.horarios = horarios;
	}

	public double saldoCliente() {
		
		return cupo-gasto;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", cupo=" + cupo + ", userid=" + userid + ", correo=" + correo
				+ ", genero=" + genero + ", tipo=" + tipo + "]";
	}
	
	
	
}
