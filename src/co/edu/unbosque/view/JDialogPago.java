package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import co.edu.unbosque.controller.Controller;

public class JDialogPago extends JDialog {
	private static final long serialVersionUID = 1L;
	private JButton pagar = new JButton("Realizar Pago");
	private JButton cancelar = new JButton("Cancelar");
	private JLabel label = new JLabel("Ingrese el monto que desea usar: ");
	private JTextField textcantidad = new JTextField();
	public final String PAGAR ="pagar",CANCELAR ="cancelarpago";
	public JDialogPago(Controller control) {
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
		setTitle("Buscador");
		setSize(600,400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setBackground(Color.BLACK);
		
		label.setBounds(75,100 , 300, 25);
		textcantidad.setBounds(325, 100, 200, 25);
		
		pagar.setBounds(150, 200, 150, 50);
		pagar.setBackground(Color.BLACK);
		pagar.setForeground(Color.WHITE);
		pagar.setActionCommand(PAGAR);
		
		cancelar.setBounds(350, 200, 100, 50);
		cancelar.setActionCommand(CANCELAR);
		cancelar.setBackground(Color.BLACK);
		cancelar.setForeground(Color.WHITE);
		
		

		
		setVisible(true);
	}

	public void addComponentes() {
		add(label);
		add(pagar);
		add(cancelar);
		add(textcantidad);
		

	}
	public void escucharComponentes(Controller control) {
		pagar.addActionListener(control);
		cancelar.addActionListener(control);
	}

	public JButton getPagar() {
		return pagar;
	}

	public void setPagar(JButton pagar) {
		this.pagar = pagar;
	}

	public JButton getCancelar() {
		return cancelar;
	}

	public void setCancelar(JButton cancelar) {
		this.cancelar = cancelar;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JTextField getTextcantidad() {
		return textcantidad;
	}

	public void setTextcantidad(JTextField textcantidad) {
		this.textcantidad = textcantidad;
	}

	public String getPAGAR() {
		return PAGAR;
	}

	public String getCANCELAR() {
		return CANCELAR;
	}
 
}
