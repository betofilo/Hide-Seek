package co.edu.unbosque.model;

public class Horario {
	
	
	private String horainicio;
	private String horafinal;
	private String dia;
	
	
	public Horario(String horainicio, String horafinal, String dia) {
		super();
		this.horainicio = horainicio;
		this.horafinal = horafinal;
		this.dia = dia;
	}


	public String getHorainicio() {
		return horainicio;
	}


	public void setHorainicio(String horainicio) {
		this.horainicio = horainicio;
	}


	public String getHorafinal() {
		return horafinal;
	}


	public void setHorafinal(String horafinal) {
		this.horafinal = horafinal;
	}


	public String getDia() {
		return dia;
	}


	public void setDia(String dia) {
		this.dia = dia;
	}
	
	
	

}
