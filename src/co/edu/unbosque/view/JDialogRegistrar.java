package co.edu.unbosque.view;

import javax.swing.*;

import java.awt.*;

/**
 * @author Ricardo Sanchez
 *
 */
public class JDialogRegistrar extends JDialog {

	private static final long serialVersionUID = 1L;
	private JLabel labelnom = new JLabel("Nombre: ");
	private JLabel labelcorreo = new JLabel("Correo:");
	private JLabel labelclave = new JLabel("Clave: ");
	private JLabel labelconfclave = new JLabel("Confirmar Clave: ");
	private JButton botonRegistrar = new JButton("Registrar");
	private JButton botonCancelar = new JButton("Cancelar");
	private JTextField textnom = new JTextField("");
	private JTextField textcorreo = new JTextField("");
	private JTextField textclave = new JTextField("");
	private JTextField textconfclave = new JTextField("");
	public final String REGISTRAR = "registrar";
	public final String CANCELAR = "cancelaregistro";

	public JDialogRegistrar() {
		try {
			cargar();
			addComponentes();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void cargar() throws Exception {
		setLayout(new BorderLayout());
		setTitle("Registro");
		setSize(800, 600);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setBackground(Color.BLACK);

//		labelnom.setBounds(265, 100, 100, 50);
//		textnom.setBounds(335, 115, 200, 25);
//		labelnom.setForeground(Color.BLACK);

		labelcorreo.setBounds(265, 150, 100, 50);
		textcorreo.setBounds(335, 165, 200, 25);
		labelcorreo.setForeground(Color.BLACK);

		labelclave.setBounds(270, 200, 100, 50);
		textclave.setBounds(335, 215, 200, 25);
		labelclave.setForeground(Color.BLACK);

		labelconfclave.setBounds(215, 250, 200, 50);
		textconfclave.setBounds(335, 265, 200, 25);

		botonRegistrar.setBounds(250, 400, 100, 50);
		botonRegistrar.setBackground(Color.BLACK);

		botonCancelar.setBounds(400, 400, 100, 50);
		botonCancelar.setBackground(Color.BLACK);

		setVisible(false);
	}

	public void addComponentes() {
//		add(labelnom);
		add(labelcorreo);
		add(labelclave);
		add(labelconfclave);
//		add(textnom);
		add(textcorreo);
		add(textclave);
		add(textconfclave);
		add(botonRegistrar);
		add(botonCancelar);

	}

	public JLabel getLabelnom() {
		return labelnom;
	}

	public void setLabelnom(JLabel labelnom) {
		this.labelnom = labelnom;
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

	public JButton getBotonRegistrar() {
		return botonRegistrar;
	}

	public void setBotonRegistrar(JButton botonRegistrar) {
		this.botonRegistrar = botonRegistrar;
	}

	public JTextField getTextnom() {
		return textnom;
	}

	public void setTextnom(JTextField textnom) {
		this.textnom = textnom;
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

	public String getREGISTRAR() {
		return REGISTRAR;
	}

	public String getCANCELAR() {
		return CANCELAR;
	}

	public JButton getBotonCancelar() {
		return botonCancelar;
	}

	public void setBotonCancelar(JButton botonCancelar) {
		this.botonCancelar = botonCancelar;
	}

}
