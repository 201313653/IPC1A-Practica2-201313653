package imagenes;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Imagen extends JPanel {

	private Image imagen;
	private URL fondo;
	
	public Imagen() {
		
		fondo = this.getClass().getResource("/imagenes/Menú.png");
		imagen = new ImageIcon(fondo).getImage();
	}

	public void paintComponent (Graphics graph){
		
		graph.drawImage(imagen,0,0,375,375,null);
		
	}

}
