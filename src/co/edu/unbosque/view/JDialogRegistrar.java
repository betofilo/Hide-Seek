package co.edu.unbosque.view;

import javax.swing.*;

import java.awt.*;

/**
 * @author Ricardo Sanchez
 *
 */
public class JDialogRegistrar extends JDialog {

	private static final long serialVersionUID = 1L;
	private JLabel labelcorreo = new JLabel("Correo: ");
	private JLabel labelconfcorreo = new JLabel("Confirmar Correo: ");
	private JLabel labelclave = new JLabel("Clave: ");
	private JLabel labelconfclave = new JLabel("Confirmar Clave: ");
	private JButton botonRegistrar = new JButton("Registrar");
	private JButton botonCancelar = new JButton("Cancelar");
	private JTextField textcorreo = new JTextField("");
	private JTextField textconfcorreo = new JTextField("");
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

		labelcorreo.setBounds(265, 100, 100, 50);
		textcorreo.setBounds(335, 115, 200, 25);
		labelcorreo.setForeground(Color.BLACK);

		labelconfcorreo.setBounds(200, 150, 200, 50);
		textconfcorreo.setBounds(335, 165, 200, 25);
		labelconfcorreo.setForeground(Color.BLACK);

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
	public void clean() {
		textconfcorreo.setText("");
		textclave.setText("");
		textconfclave.setText("");
	}

	public void addComponentes() {
		add(labelcorreo);
		add(labelconfcorreo);
		add(labelclave);
		add(labelconfclave);
		add(textcorreo);
		add(textconfcorreo);
		add(textclave);
		add(textconfclave);
		add(botonRegistrar);
		add(botonCancelar);

	}

	public JLabel getLabelnom() {
		return labelcorreo;
	}

	public void setLabelnom(JLabel labelnom) {
		this.labelcorreo = labelnom;
	}

	public JLabel getLabelcorreo() {
		return labelconfcorreo;
	}

	public void setLabelcorreo(JLabel labelcorreo) {
		this.labelconfcorreo = labelcorreo;
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
		return textcorreo;
	}

	public void setTextnom(JTextField textnom) {
		this.textcorreo = textnom;
	}

	public JTextField getTextcorreo() {
		return textconfcorreo;
	}

	public void setTextcorreo(JTextField textcorreo) {
		this.textconfcorreo = textcorreo;
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
