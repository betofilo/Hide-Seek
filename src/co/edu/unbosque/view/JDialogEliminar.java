package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import co.edu.unbosque.controller.Controller;

public class JDialogEliminar extends JDialog {
private static final long serialVersionUID = 1L;
	
	private JLabel labelBuscador = new JLabel("Buscador:");
	private JButton botonEliminar = new JButton("Eliminar");
	private JButton botonCancelar = new JButton("Cancelar");
	private JTextField textbuscador = new JTextField("");
	public final String ELIMINAR= "eliminarpa";
	public final String CANCELAR = "cancelareliminacion";
    
	public JDialogEliminar(Controller control) {
		try {
			cargar();
			addComponentes();
			escucharComponentes(control);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void cargar() throws Exception {
		setLayout(new BorderLayout());
		setTitle("Buscador Eliminar");
		setSize(600,400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setBackground(Color.BLACK);
		

		labelBuscador.setBounds(150, 100, 100, 50);
		textbuscador.setBounds(250, 115, 200, 25);
		

		botonEliminar.setBounds(50,200, 200, 50);
		botonEliminar.setActionCommand(ELIMINAR);
		botonEliminar.setBackground(Color.BLACK);
		botonEliminar.setForeground(Color.WHITE);

		botonCancelar.setBounds(300, 200, 200, 50);
		botonCancelar.setActionCommand(CANCELAR);
		botonCancelar.setBackground(Color.BLACK);
		botonCancelar.setForeground(Color.WHITE);
		setVisible(true);
	}

	public void addComponentes() {
		
		add(labelBuscador);
		add(textbuscador);
		add(botonEliminar);
		add(botonCancelar);

	}
	public void escucharComponentes(Controller control) {
		botonEliminar.addActionListener(control);
		botonCancelar.addActionListener(control);
	}

	public JLabel getLabelBuscador() {
		return labelBuscador;
	}

	public void setLabelBuscador(JLabel labelBuscador) {
		this.labelBuscador = labelBuscador;
	}

	public JButton getBotonEliminar() {
		return botonEliminar;
	}

	public void setBotonEliminar(JButton botonEliminar) {
		this.botonEliminar = botonEliminar;
	}

	public JButton getBotonCancelar() {
		return botonCancelar;
	}

	public void setBotonCancelar(JButton botonCancelar) {
		this.botonCancelar = botonCancelar;
	}

	public JTextField getTextbuscador() {
		return textbuscador;
	}

	public void setTextbuscador(JTextField textbuscador) {
		this.textbuscador = textbuscador;
	}

	public String getELIMINAR() {
		return ELIMINAR;
	}

	public String getCANCELAR() {
		return CANCELAR;
	}
	
}
