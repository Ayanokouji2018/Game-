package Game;

import java.awt.Image;

import javax.swing.JPanel;

import Herramientas.Entorno;
import Herramientas.Imagen;
import Herramientas.Imagenes;

public class Juego extends JPanel{
	//---------------------------------Variables---------------------------------//
	//VENTANA
	Ventana ventana= new Ventana();
	//TITULO JUEGO
	String titulo = "New Game 2";
	//IMAGENES
	int x = -100;
	int y = -100;
	private Imagenes Personaje = new Imagenes ("src/Personaje1.png", x, y);
	private Entorno entorno = new Entorno();
	
	public Juego()
	{
		ventana.iniciar(entorno, titulo);
		Personaje.dibujarse(entorno);
		
	}
	public static void main(String[] args) {
		Juego juego = new Juego();

	}

}
