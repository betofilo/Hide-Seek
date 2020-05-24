package co.edu.unbosque.view;



import java.awt.BorderLayout;
import java.awt.Color;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import co.edu.unbosque.controller.Controller;



public class JDialogHorario extends JDialog {
	private static final long serialVersionUID = 1L;
	private JLabel labelfecha = new JLabel("Fecha: ");
	private JButton botonaceptar = new JButton("Aceptar");
	private JButton botoncancelar = new JButton("Cancelar");
//	private DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	private JDateChooser datechooser = new JDateChooser();
	public final String ACEPTAR ="aceptarfecha",CANCELAR="cancelarfecha";
	public JDialogHorario(Controller control) {
		try {
			cargar();
			addComponentes();
			escucharComponentes(control);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void cargar() throws Exception {
		getContentPane().setLayout(new BorderLayout());
		setTitle("Asignar Horario");
		setSize(600,400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.BLACK);
		
		
        
		
		labelfecha.setBounds(150, 100, 300, 50);
		labelfecha.setForeground(Color.WHITE);
		
		datechooser.setBounds(225,115, 150, 25);
		datechooser.getCalendarButton().setBackground(Color.WHITE);

		botonaceptar.setBounds(150,200, 100, 50);
		botonaceptar.setActionCommand(ACEPTAR);
		botonaceptar.setBackground(Color.WHITE);
		
		botoncancelar.setBounds(300,200, 100, 50);
		botoncancelar.setActionCommand(CANCELAR);
		botoncancelar.setBackground(Color.WHITE);
		setVisible(true);
	}

	public void addComponentes() {
		add(botonaceptar);
		add(botoncancelar);
		add(labelfecha);
		getContentPane().add(datechooser);

	}
	public void escucharComponentes(Controller control) {
		datechooser.getCalendarButton().addActionListener(control);
		botonaceptar.addActionListener(control);
	}

	public JLabel getLabelfecha() {
		return labelfecha;
	}

	public void setLabelfecha(JLabel labelfecha) {
		this.labelfecha = labelfecha;
	}

	public JButton getBotonaceptar() {
		return botonaceptar;
	}

	public void setBotonaceptar(JButton botonaceptar) {
		this.botonaceptar = botonaceptar;
	}

	public JDateChooser getDatechooser() {
		return datechooser;
	}

	public void setDatechooser(JDateChooser datechooser) {
		this.datechooser = datechooser;
	}

	public String getACEPTAR() {
		return ACEPTAR;
	}
	
}
