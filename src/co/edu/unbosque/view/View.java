package co.edu.unbosque.view;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import co.edu.unbosque.controller.Controller;

import java.awt.*;
import java.io.IOException;

/**
 * @author Gabriel Blanco
 * Clase para definir la ventana principal
 */
public class View extends JFrame implements GabenFrame {

	private static final long serialVersionUID = 1L;
	private Dialogos dialogos = new Dialogos();
	private PanelFuncionesSuperiores toolbar = new PanelFuncionesSuperiores();
	
	/**
	 * Método para iniciar la ventana principal
	 * @author Gabriel Blanco
	 * @param control
	 */
	public void start(Controller control) {
		load();
		addComponents();
		listenComponents(control);
	}
	/**
	 * Método para cargar la configuración de la ventana principal
	 * @author Gabriel Blanco
	 */
	public void load() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setVisible(true);
	}
	
	/**
	 * Método para añadir los componentes de la ventana principal
	 * @author Gabriel Blanco
	 */
	public void addComponents() {
		add(toolbar, BorderLayout.NORTH);
		//TODO: Añadir aquí los componentes
		
	}
	
	/**
	 * Método para escuchar los componentes donde <pre>Controller</pre> va a manejar todas
	 * estas excepciones.
	 * @author Gabriel Blanco
	 * @param control
	 */
	public void listenComponents(Controller control) {
		//PanelFuncionesSuperiores
		toolbar.getAcercaDe().addActionListener(control);
		toolbar.getNuevo().addActionListener(control);
		toolbar.getGuardar().addActionListener(control);
		toolbar.getCargar().addActionListener(control);
		toolbar.getSalir().addActionListener(control);
		//TODO: Poner aqui los componentes a escuchar y comentar a que panel pertenece
	}
	
	public String cargarArchivo() throws IOException {
		String path = "";
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Forest Binary Files", new String[] {"TEXTFILES"});
		chooser.addChoosableFileFilter(filter);
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(chooser);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			path = chooser.getSelectedFile().getAbsolutePath();
			return path;
		} else {
			//No hace nada
			return null;
		}
	}
	
	/**
	 * Método para guardar un archivo via JFileChooser
	 * @author Gabriel Blanco
	 * @param linea
	 * @throws IOException
	 */
	public String guardarArchivo() throws IOException {
		String path = "";
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", new String[] {"TXT"});
		chooser.addChoosableFileFilter(filter);
		chooser.setFileFilter(filter);
		int returnVal = chooser.showSaveDialog(chooser);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			path = chooser.getSelectedFile().getAbsolutePath();
		} 
		else {
			//No hace nada
		}
		return path;
	}

	public Dialogos getDialogos() {
		return dialogos;
	}
	public PanelFuncionesSuperiores getToolbar() {
		return toolbar;
	}
	
}
