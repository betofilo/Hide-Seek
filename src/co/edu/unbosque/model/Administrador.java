package co.edu.unbosque.model;

public class Administrador {

	private String adminuser;
	private String password;
	
	public Administrador(String adminuser, String password) {
		super();
		this.adminuser = adminuser;
		this.password = password;
	}

	public String getAdminuser() {
		return adminuser;
	}

	public void setAdminuser(String adminuser) {
		this.adminuser = adminuser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	 
	
}
