package Herramientas;

import java.awt.Image;

public class Imagenes {
	private int x, y;
	private Image imagen;
	
	public Imagenes(String ruta, int x, int y) {
		this.x = x;
		this.y = y;
		this.imagen = Imagen.cargarImagen(ruta);
	}
	
	public void dibujarse(Entorno entorno) {
		entorno.dibujarImagen(imagen, x,y);
	}

}
