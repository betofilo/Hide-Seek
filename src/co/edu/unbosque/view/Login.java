package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class Login extends JDialog implements GabenDialog {
	
	private static final long serialVersionUID = 1L;
	private JLabel lbUser = new JLabel("Usuario"), lbPassword = new JLabel("Contraseña");
	private JTextField txUser = new JTextField();
	private JPasswordField txPassword = new JPasswordField();
	private JButton signin = new JButton("Iniciar Sesion"), signup = new JButton("Registrarse");
	public static final String SIGNIN = "LOGSIGNIN", SIGNUP = "LOGSIGNUP";
	
	public Login() {
		load();
		addComponents();
	}

	@Override
	public void load() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(300, 200);
		setTitle("Hide & Seek");
		setLayout(new GridLayout(3, 2));
		setLocationRelativeTo(null);
		signin.setActionCommand(SIGNIN);
		signup.setActionCommand(SIGNUP);
	}

	@Override
	public void addComponents() {
		add(lbUser); add(txUser);
		add(lbPassword); add(txPassword);
		add(signin); add(signup);
	}

	public JTextField getTxUser() {
		return txUser;
	}

	public JPasswordField getTxPassword() {
		return txPassword;
	}

	public JButton getSignin() {
		return signin;
	}

	public JButton getSignup() {
		return signup;
	}
}
