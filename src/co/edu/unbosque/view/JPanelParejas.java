package co.edu.unbosque.view;

import java.awt.Color;

//import javax.swing.ImageIcon;
import javax.swing.JButton;
//import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelParejas extends JPanel{

	private static final long serialVersionUID = 1L;
	private JButton botonEliminarDatos = new JButton("Eliminar datos cuenta");
	private JButton botonActualizarDatos = new JButton ("Actualizar Datos ");
	private JButton botonHacerPago = new JButton("Realizar Pago");
	private JButton botonListaAfiliados = new JButton("Lista Afiliados");
	public final String ELIMINARDATOS="eliminar datos";
	public final String ACTUALIZARDATOS = "actualizar Datos";
	public final String HACERPAGO = "hacer pago";
	public final String LISTAAFILIADOS ="lista afiliados";
//	private JLabel fondo= new JLabel();;
//	private ImageIcon imagenes= new ImageIcon();

	public JPanelParejas() {
		try {
			cargar();
			addComponentes();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void cargar() throws Exception {
		setLayout(null);
//		fondo.setLayout(null);
//		fondo.setBounds(0, 0, 200, 600);
//		imagenes = new ImageIcon("Resources/fondopareja.png");
//		fondo.setIcon(imagenes);
		
		
		botonListaAfiliados.setBounds(175, 25, 200, 50);
		botonListaAfiliados.setActionCommand(LISTAAFILIADOS);
		botonListaAfiliados.setBackground(Color.WHITE);
		
		botonActualizarDatos.setBounds(425,25 ,200, 50);
		botonActualizarDatos.setActionCommand(ACTUALIZARDATOS);
		botonActualizarDatos.setBackground(Color.WHITE);
		
		botonHacerPago.setBounds(175, 100, 200, 50);
		botonHacerPago.setActionCommand(HACERPAGO);
		botonHacerPago.setBackground(Color.WHITE);
		
		botonEliminarDatos.setBounds(425,100,200,50);
		botonEliminarDatos.setActionCommand(ELIMINARDATOS);
		botonEliminarDatos.setBackground(Color.WHITE);
       
		
		
		setBackground(Color.BLUE);

		

		setVisible(true);
	}

	public void addComponentes() {
		add(botonListaAfiliados);
		add(botonEliminarDatos);
		add(botonActualizarDatos);
        add(botonHacerPago);
//        getRootPane().add(fondo);
//        add(fondo);
      
       
	}


	public JButton getBotonEliminarPareja() {
		return botonEliminarDatos;
	}

	public void setBotonEliminarPareja(JButton botonEliminarPareja) {
		this.botonEliminarDatos = botonEliminarPareja;
	}

	public JButton getBotonActualizarDatos() {
		return botonActualizarDatos;
	}

	public void setBotonActualizarDatos(JButton botonActualizarDatos) {
		this.botonActualizarDatos = botonActualizarDatos;
	}

	

	public JButton getBotonHacerPago() {
		return botonHacerPago;
	}

	public void setBotonHacerPago(JButton botonHacerPago) {
		this.botonHacerPago = botonHacerPago;
	}


	public String getELIMINARPAREJA() {
		return ELIMINARDATOS;
	}

	public String getACTUALIZARDATOS() {
		return ACTUALIZARDATOS;
	}

	public String getHACERPAGO() {
		return HACERPAGO;
	}
	

}
