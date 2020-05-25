package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Ricardo Sanchez
 *
 */
public class JDialogListar extends JDialog {
    private static final long serialVersionUID = 1L;
    private JTable tabla;
	private DefaultTableModel model;
	private JScrollPane scrollpane;
	private JButton Mostrar = new JButton("Mostrar");
	private JButton Cancelar = new JButton("Cancelar");
	private JButton Limpiar = new JButton("Limpiar");
	public final String MOSTRAR = "mostrardatos";
	public final String CANCELAR = "cancelarlista";
	public final String LIMPIAR = "Limpiarlista";
	private int counter = 0;
	
	public JDialogListar() {
		cargar();
		agregarcomponentes();
		panelbotones();
	}

	public void cargar() {
		
		
		setLayout(new BorderLayout());
		setTitle("Asignar Cupo");
		setSize(800,600);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setBackground(Color.BLACK);
		
	
		
		tabla = new JTable(new DefaultTableModel(new Object[] {"Correo", "Tienda", "Activa", "Dinero en cuenta"}, counter));
		model = (DefaultTableModel) tabla.getModel();
		tabla.setAutoscrolls(true);
		tabla.setColumnSelectionAllowed(false);
		scrollpane = new JScrollPane(tabla);
		scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollpane.setViewportView(tabla);
		setLayout(new BorderLayout());
		counter++;
		
	}
	public void panelbotones()  {
		JPanel panelboton = new JPanel();
		panelboton.setLayout(new GridLayout(3,1));
		Mostrar.setBackground(Color.BLACK);
		Mostrar.setForeground(Color.WHITE);
		Limpiar.setBackground(Color.BLACK);
		Limpiar.setForeground(Color.WHITE);
		Cancelar.setBackground(Color.BLACK);
		Cancelar.setForeground(Color.WHITE);
		panelboton.add(Mostrar);
		panelboton.add(Limpiar);
		panelboton.add(Cancelar);
		add(panelboton, BorderLayout.EAST);
	}

	public void agregarcomponentes() {
		add(scrollpane, BorderLayout.CENTER);
		
		
	}
	
	public void clean() {
		for (int i = 0; i < tabla.getRowCount(); i++) {
			model.removeRow(i);
		}
	}
	
	
	public String traerTabla() {
		String[] data = new String[tabla.getRowCount()];
		String ladata = "";
		for (int i = 0; i < data.length; i++) {
			data[i] = tabla.getModel().getValueAt(i, 0).toString();
			ladata += data[i]+";";
		}
		return ladata;
	}
	
	public void anadirPareja(String Correo, String Tienda, String Activa, String Dinero) {
		model.addRow(new Object[] {Correo, Tienda, Activa, Dinero});
		counter++;
	}
	
	public String traerColumna() {
		String data = "";
		for (int i = 0; i < tabla.getColumnCount(); i++) {
			data += tabla.getModel().getValueAt(tabla.getSelectedRow(), i).toString()+";";
		}
		return data;
	}
	
	public String leerJugador() {

		return tabla.getModel().getValueAt(tabla.getSelectedRow(), 0).toString();
	}
	
	public void actualizarJugador(String Correo, String Tienda, String Activa, String Dinero) {
		for (int i = 0; i < tabla.getRowCount(); i++) {
			if(Correo.equals(tabla.getModel().getValueAt(i, 0))) {
				model.removeRow(i);
				model.addRow(new Object[] {Correo, Tienda, Activa, Dinero});
			}
		}
	}
	
	public void eliminarJugador(String Nickname) {
		for (int i = 0; i < tabla.getRowCount(); i++) {
			if(Nickname.equals(tabla.getModel().getValueAt(i, 0))) {
				model.removeRow(i);
			}
		}
	}

	public JTable getTabla() {
		return tabla;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public JScrollPane getScrollpane() {
		return scrollpane;
	}

	public int getCounter() {
		return counter;
	}

	public JButton getMostrar() {
		return Mostrar;
	}

	public JButton getCancelar() {
		return Cancelar;
	}

	public JButton getLimpiar() {
		return Limpiar;
	}
}
