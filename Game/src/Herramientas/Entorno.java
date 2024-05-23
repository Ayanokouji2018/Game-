package Herramientas;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class Entorno extends JPanel {
	public void dibujarImagen(Image imagen, int x, int y) {
		Graphics g = this.getGraphics();
		if (g != null && imagen != null) {
			g.drawImage(imagen, x, y, null);
			g.dispose();
		}
	}

}
