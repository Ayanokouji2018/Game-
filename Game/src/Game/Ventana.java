package Game;

import javax.swing.JFrame;

import Herramientas.Entorno;	

public class Ventana extends JFrame {
	//VARIABLES DEL TAMAÑO DE LA VENTANA
	private int anchoVentana=900;
	private int altoVentana=700;
	
	public Ventana() {
		this.setSize(anchoVentana, altoVentana);	
	}
	public void iniciar(Entorno entorno, String titulo) {
		this.setTitle(titulo);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(entorno);
	}

}
