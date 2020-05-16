package co.edu.unbosque.model;

public class Tienda {

	private String idtienda;
	private String dirección;
	
	
	public Tienda(String idtienda, String dirección) {
		super();
		this.idtienda = idtienda;
		this.dirección = dirección;

	}
	
	public String getIdtienda() {
		return idtienda;
	}
	public void setIdtienda(String idtienda) {
		this.idtienda = idtienda;
	}
	public String getDirección() {
		return dirección;
	}
	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	
}
