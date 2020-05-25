package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Ricardo Sanchez
 *
 */
public class JDialogAgregar extends JDialog {
	private static final long serialVersionUID = 1L;

	private JLabel labelcorreo = new JLabel("Correo:");
	private JLabel labelconfcorreo = new JLabel("Confirmar Correo:");
	private JLabel labelclave = new JLabel("Clave: ");
	private JLabel labelconfclave = new JLabel("Confirmar Clave: ");
	private JButton botonRegistrar = new JButton("Registrar");
	private JButton botonCancelar = new JButton("Cancelar");
	private JTextField textcorreo = new JTextField("");
	private JTextField textconfcorreo = new JTextField("");
	private JTextField textclave = new JTextField("");
	private JTextField textconfclave = new JTextField("");
	public final String AGREGAR = "agregar";
	public final String CANCELAR = "cancelaregistropa";

	public JDialogAgregar() {
		try {
			cargar();
			addComponentes();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void cargar() throws Exception {
		getContentPane().setLayout(new BorderLayout());
		setTitle("Agregar Pareja");
		setSize(600, 400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setBackground(Color.WHITE);

		labelcorreo.setBounds(170, 40, 125, 50);
		textcorreo.setBounds(250, 55, 200, 25);

		labelconfcorreo.setBounds(95, 85, 160, 50);
		textconfcorreo.setBounds(250, 95, 200, 25);

		labelclave.setBounds(180, 125, 100, 50);
		textclave.setBounds(250, 135, 200, 25);

		labelconfclave.setBounds(105, 165, 200, 50);
		textconfclave.setBounds(250, 175, 200, 25);

		botonRegistrar.setBounds(200, 225, 100, 50);
		botonRegistrar.setActionCommand(AGREGAR);
		botonRegistrar.setBackground(Color.BLACK);
		botonRegistrar.setForeground(Color.WHITE);

		botonCancelar.setBounds(350, 225, 100, 50);
		botonCancelar.setActionCommand(CANCELAR);
		botonCancelar.setBackground(Color.BLACK);
		botonCancelar.setForeground(Color.WHITE);

		setVisible(false);
	}

	public void addComponentes() {

		getContentPane().add(labelcorreo);
		getContentPane().add(labelconfcorreo);
		getContentPane().add(textconfcorreo);
		getContentPane().add(labelclave);
		getContentPane().add(labelconfclave);
		getContentPane().add(textcorreo);
		getContentPane().add(textclave);
		getContentPane().add(textconfclave);
		getContentPane().add(botonRegistrar);
		getContentPane().add(botonCancelar);

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

	public JLabel getLabelconfclave() {
		return labelconfclave;
	}

	public void setLabelconfclave(JLabel labelconfclave) {
		this.labelconfclave = labelconfclave;
	}

	public JButton getBotonRegistrar() {
		return botonRegistrar;
	}

	public void setBotonRegistrar(JButton botonRegistrar) {
		this.botonRegistrar = botonRegistrar;
	}

	public JButton getBotonCancelar() {
		return botonCancelar;
	}

	public void setBotonCancelar(JButton botonCancelar) {
		this.botonCancelar = botonCancelar;
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

	public JTextField getTextconfclave() {
		return textconfclave;
	}

	public void setTextconfclave(JTextField textconfclave) {
		this.textconfclave = textconfclave;
	}

	public String getREGISTRAR() {
		return AGREGAR;
	}

	public String getCANCELAR() {
		return CANCELAR;
	}

	public JLabel getLabelconfcorreo() {
		return labelconfcorreo;
	}

	public JTextField getTextconfcorreo() {
		return textconfcorreo;
	}

	
}
