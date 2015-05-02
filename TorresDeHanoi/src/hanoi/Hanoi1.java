package hanoi;

import imagenes.Imagen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;

public class Hanoi1 {

	JFrame ventana1;
	VentanaDeJuego juego;
	Instrucciones instrucciones;
	JComboBox niveles;
	

	

	
	public Hanoi1() {
		
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ventana1 = new JFrame();
		ventana1.setBounds(100, 100, 424, 431);
		ventana1.setTitle("Menú");
		ventana1.setResizable(false);
		ventana1.setLocationRelativeTo(null);
		ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana1.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		Imagen imagen = new Imagen();
		panel.add(imagen);
		imagen.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 5, 362, 40);
		imagen.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Hanoi1.class.getResource("/imagenes/Hanoi2.png")));
		
		
		JButton comenzar = new JButton();
		comenzar.setBackground(Color.WHITE);
		comenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VentanaDeJuego juego = new VentanaDeJuego();
				MatrizTorres matDiscos = new MatrizTorres();
			    if (niveles.getSelectedItem().equals("3")){
			    	
			    	matDiscos.torres3();}
			    else if(niveles.getSelectedItem().equals("4")){
			    	matDiscos.torres4();}
			    else if(niveles.getSelectedItem().equals("5")){
			    	matDiscos.torres5();}
			    else if(niveles.getSelectedItem().equals("6")){
			    	matDiscos.torres6();}
			    else if(niveles.getSelectedItem().equals("7")){
			    	matDiscos.torres7();}
			    else if(niveles.getSelectedItem().equals("8")){
			    	matDiscos.torres8();
			    
			    
			    }
				
			}
		});
		
		comenzar.setIcon(new ImageIcon(Hanoi1.class.getResource("/imagenes/Iniciar.png")));
		comenzar.setBounds(10, 48, 85, 28);
		imagen.add(comenzar);
		
		
		
		niveles = new JComboBox();
		niveles.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		niveles.setBackground(Color.WHITE);
		niveles.setModel(new DefaultComboBoxModel(new String[] {"3", "4", "5", "6", "7", "8"}));
		niveles.setBounds(10, 100, 85, 20);
		imagen.add(niveles);
		
		JList list = new JList();
		list.setBounds(347, 176, -54, -32);
		imagen.add(list);
		
		JLabel nivelesLabel = new JLabel("New label");
		nivelesLabel.setIcon(new ImageIcon(Hanoi1.class.getResource("/imagenes/Niveles.png")));
		nivelesLabel.setBounds(10, 77, 85, 28);
		imagen.add(nivelesLabel);
		panel.setBounds(0, 0, 383, 390);
		ventana1.getContentPane().add(panel);
		
		JMenuBar menuBar = new JMenuBar();
		ventana1.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Opciones");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmInstrucciones = new JMenuItem("Instrucciones");
		mntmInstrucciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Instrucciones instrucciones = new Instrucciones();
				instrucciones.ventana3.setVisible(true);
				
			}
		});
		mnNewMenu.add(mntmInstrucciones);
		
		JMenuItem mntmDemo = new JMenuItem("Demo");
		mnNewMenu.add(mntmDemo);
		
	}
	

}
