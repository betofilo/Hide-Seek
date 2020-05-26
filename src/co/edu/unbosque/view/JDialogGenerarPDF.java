package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;
/**
 * @author Ricardo Sanchez
 *
 */
public class JDialogGenerarPDF extends JDialog{

	private static final long serialVersionUID = 1L;
	private JButton botonGenerar = new JButton("Generar PDF");
	private JButton cancelar = new JButton("Cancelar");
	public final String PDF ="generarpdf",CANCELAR ="cancelarpdf";
	public JDialogGenerarPDF() {
		try {
			cargar();
			addComponentes();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void cargar() throws Exception {
		setLayout(new BorderLayout());
		setTitle("Generar PDF");
		setSize(600,200);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setBackground(Color.BLACK);
		
	
		
		botonGenerar.setBounds(150, 50, 150, 50);
		botonGenerar.setBackground(Color.WHITE);
		botonGenerar.setActionCommand(PDF);
		
		cancelar.setBounds(350, 50, 100, 50);
		cancelar.setActionCommand(CANCELAR);
		cancelar.setBackground(Color.WHITE);
		
		
		

		
		setVisible(false);
	}
	
	
	public void addComponentes() {
		
		add(botonGenerar);
		add(cancelar);
		
		

	}

	public JButton getBotonGenerar() {
		return botonGenerar;
	}

	public void setBotonGenerar(JButton botonGenerar) {
		this.botonGenerar = botonGenerar;
	}

	public JButton getCancelar() {
		return cancelar;
	}

	public void setCancelar(JButton cancelar) {
		this.cancelar = cancelar;
	}

	public String getPDF() {
		return PDF;
	}

	public String getCANCELAR() {
		return CANCELAR;
	}
	

}
