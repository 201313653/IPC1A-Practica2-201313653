package hanoi;

import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Toolkit;

public class Instrucciones {

	 JFrame ventana3;
	private JTextField manual;


	public Instrucciones() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ventana3 = new JFrame();
		ventana3.setIconImage(Toolkit.getDefaultToolkit().getImage(Instrucciones.class.getResource("/imagenes/Men\u00FA.png")));
		ventana3.setTitle("Instrucciones");
		ventana3.setBounds(100, 100, 450, 300);
		ventana3.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 262);
		ventana3.getContentPane().add(panel);
		panel.setLayout(null);
		
		manual = new JTextField();
		manual.setText("Aca van las instrruciones");
		manual.setBounds(10, 11, 414, 240);
		panel.add(manual);
		manual.setColumns(10);
	}

	
}
