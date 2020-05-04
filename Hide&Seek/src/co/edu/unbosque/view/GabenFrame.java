package co.edu.unbosque.view;

import co.edu.unbosque.controller.Controller;

public interface GabenFrame {
	
	public void start(Controller controller);
	public void load();
	public void addComponents();
	public void listenComponents(Controller controller);

}
