package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import co.edu.unbosque.controller.Controller;

public class JDialogLogin extends JDialog{
	private static final long serialVersionUID = 1L;
	
	private JLabel labelcorreo = new JLabel("Correo:");
	private JLabel labelclave = new JLabel("Clave: ");
	
	private JButton botonLogin = new JButton("Iniciar Sesion");
	private JButton botonRegistrarse = new JButton("Registrarse");
	private JTextField textcorreo = new JTextField("");
	private JTextField textclave = new JTextField("");
	private JComboBox<String> combo = new JComboBox<String>();
	public final String LOGIN = "login";
	public final String REGISTRAR = "registrar";
	public void iniciar(Controller control) throws Exception {
		cargar();
		addComponentes();
		escucharComponentes(control);
	}
	
	
	public void cargar() throws Exception {
		
		setTitle("Login");
		setSize(600,400);
		setBackground(new Color(255,255,255));
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		
		
		labelcorreo.setBounds(150, 50, 100, 50);
		textcorreo.setBounds(215,65, 200, 25);
		labelcorreo.setForeground(Color.BLACK);
	
		
		labelclave.setBounds(150,100,100,50);
		textclave.setBounds(215,115,200,25);
	    labelclave.setForeground(Color.BLACK);
	    
	  
	    
		botonLogin.setBounds(125,200, 150, 50);
		botonLogin.setBackground(Color.white);
		
		botonRegistrarse.setBounds(325,200,150,50);
		botonRegistrarse.setBackground(Color.white);
		
		combo.addItem("Usuario");
		combo.addItem("Admin");
		combo.addItem("Pareja");
		combo.setBounds(475,10, 100, 25);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		
		setVisible(true);
	}
	
	public void addComponentes() {
		
		add(labelcorreo);
		add(labelclave);
		
		
		add(textcorreo);
		add(textclave);
		
		add(botonLogin);
		add(botonRegistrarse); 
		
		add(combo);
	}
	public void escucharComponentes(Controller control) {
		botonRegistrarse.addActionListener(control);
		botonLogin.addActionListener(control);
		combo.addActionListener(control);
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
	

	public JComboBox getCombo() {
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
