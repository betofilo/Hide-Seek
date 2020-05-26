package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Ricardo Sanchez
 *
 */
public class JDialogLogin extends JDialog{
	
	private static final long serialVersionUID = 1L;
	private JLabel labeluser = new JLabel("Usuario:");
	private JLabel labelcorreo = new JLabel("Correo:");
	private JLabel labelclave = new JLabel("Clave: ");
	
	private JButton botonLogin = new JButton("Iniciar Sesion");
	private JButton botonRegistrarse = new JButton("Registrarse");
	private JTextField textcorreo = new JTextField("");
	private JTextField textclave = new JTextField("");
	private JTextField textusuario = new JTextField("");
	private JComboBox<String> combo = new JComboBox<String>();
	public final String LOGIN = "login";
	public final String REGISTRAR = "registrar";
	public JDialogLogin() {
		try {
			cargar();
			addComponentes();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void cargar() throws Exception {
		
		setTitle("Login");
		setSize(600,400);
		setBackground(new Color(255,255,255));
		getContentPane().setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		
		/**
		 * TODO Agregar un text para que ingrese el nombre de usuario en caso de pareja 
		 */
		labeluser.setBounds(150,65,100, 50);
		textusuario.setBounds(215,80, 200, 25);
		labeluser.setVisible(false);
		textcorreo.setVisible(false);
		
		labelcorreo.setBounds(150, 125, 100, 50);
		textcorreo.setBounds(215,135, 200, 25);
		labelcorreo.setForeground(Color.BLACK);
	
		
		labelclave.setBounds(150,175,100,50);
		textclave.setBounds(215,190,200,25);
	    labelclave.setForeground(Color.BLACK);
	    
	  
	    
		botonLogin.setBounds(125,250, 150, 50);
		botonLogin.setBackground(Color.white);
		
		botonRegistrarse.setBounds(325,250,150,50);
		botonRegistrarse.setBackground(Color.white);
		
		combo.addItem("Usuario");
		combo.addItem("Admin");
		combo.addItem("Pareja");
		combo.setBounds(475,10, 100, 25);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		
		setVisible(false);
	}
	
	public void addComponentes() {
		add(labeluser);
		add(labelcorreo);
		add(labelclave);
		
		add(textusuario);
		add(textcorreo);
		add(textclave);
		
		add(botonLogin);
		add(botonRegistrarse); 
		
	    add(combo);
		
	}
	public void clean() {
		textcorreo.setText("");
		textclave.setText("");
	}

	public JLabel getLabelcorreo() {
		return labelcorreo;
	}

	public void setLabelcorreo(JLabel labelcorreo) {
		this.labelcorreo = labelcorreo;
	}

	public JLabel getLabelclave() {
		return labelclave;
	}

	public void setLabelclave(JLabel labelclave) {
		this.labelclave = labelclave;
	}
	public JTextField getTextcorreo() {
		return textcorreo;
	}

	public void setTextcorreo(JTextField textcorreo) {
		this.textcorreo = textcorreo;
	}

	public JTextField getTextclave() {
		return textclave;
	}

	public void setTextclave(JTextField textclave) {
		this.textclave = textclave;
	}
	

	public JComboBox<String> getCombo() {
		return combo;
	}
    

	public JButton getBotonRegistrarse() {
		return botonRegistrarse;
	}

	public String getREGISTRAR() {
		return REGISTRAR;
	}

	public JButton getBotonCancelar() {
		return botonRegistrarse;
	}

	public void setBotonCancelar(JButton botonCancelar) {
		this.botonRegistrarse = botonCancelar;
	}

	public JButton getBotonLogin() {
		return botonLogin;
	}

	public void setBotonLogin(JButton botonLogin) {
		this.botonLogin = botonLogin;
	}

	public String getLOGIN() {
		return LOGIN;
	}
	
    
}
