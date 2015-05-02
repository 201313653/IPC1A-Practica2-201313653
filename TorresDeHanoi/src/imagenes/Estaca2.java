package imagenes;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Estaca2 extends JPanel {

	private Image imagen;
	private URL fondo;
	
	public Estaca2() {
		
		fondo = this.getClass().getResource("/imagenes/Estaca2.png");
		imagen = new ImageIcon(fondo).getImage();
	}

	public void paintComponent (Graphics graph){
		
		graph.drawImage(imagen,0,0,302, 334,null);
		
	}


}
