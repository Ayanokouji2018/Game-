package Herramientas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Imagen {


	public static Image cargarImagen(String ruta) {
		return Toolkit.getDefaultToolkit().getImage(ruta);
	}
	
}
 