package hanoi;

import imagenes.Estaca1;
import imagenes.Estaca2;
import imagenes.Estaca3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JLabel;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaDeJuego {

	JFrame ventana2;
	public JLabel dOcho;
	public JLabel dSiete;
	public JLabel dSeis;
	public JLabel dCinco;
	public JLabel dCuatro;
	public JLabel dTres;
	public JLabel dDos;
	public JLabel dUno;
	public JLabel dNueve;
	public Estaca1 estaca1;
	public Estaca2 estaca2;
	public Estaca3 estaca3;
	public JLabel movInicial;
	public JLabel movFinal;
	int desde=0;
	int hasta=0;

	
	
	public VentanaDeJuego() {
		initialize();
	}

	
	private void initialize() {
		ventana2= new JFrame();
		ventana2.setBounds(100, 100, 996, 502);
		ventana2.setLocationRelativeTo(null);
		ventana2.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 970, 464);
		ventana2.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 302, 334);
		panel_1.setLayout(new BorderLayout(0, 0));
		estaca1=new Estaca1();
		panel_1.add(estaca1);
		estaca1.setLayout(null);
		
		dOcho = new JLabel("8");
		
		dOcho.setIcon(new ImageIcon(VentanaDeJuego.class.getResource("/imagenes/Disco11.png")));
		estaca1.add(dOcho);
		
		dSiete = new JLabel("7");
		
		dSiete.setIcon(new ImageIcon(VentanaDeJuego.class.getResource("/imagenes/Disco2222.png")));
		estaca1.add(dSiete);
		
		dSeis = new JLabel("6");
		
		dSeis.setIcon(new ImageIcon(VentanaDeJuego.class.getResource("/imagenes/Disco33.png")));
		estaca1.add(dSeis);
		
		dCinco = new JLabel("5");
		
		dCinco.setIcon(new ImageIcon(VentanaDeJuego.class.getResource("/imagenes/Disco444.png")));
		estaca1.add(dCinco);
		
		dCuatro = new JLabel("4");
		
		dCuatro.setIcon(new ImageIcon(VentanaDeJuego.class.getResource("/imagenes/Disco55.png")));
		estaca1.add(dCuatro);
		
		dTres = new JLabel("3");
		
		dTres.setIcon(new ImageIcon(VentanaDeJuego.class.getResource("/imagenes/Disco66.png")));
		estaca1.add(dTres);
		
		dDos = new JLabel("2");
		dDos.setIcon(new ImageIcon(VentanaDeJuego.class.getResource("/imagenes/Disco77.png")));
		
		estaca1.add(dDos);
		
		dUno = new JLabel("1");
		dUno.setIcon(new ImageIcon(VentanaDeJuego.class.getResource("/imagenes/Disco88.png")));
		
		estaca1.add(dUno);
		
		dNueve = new JLabel("");
		
		estaca1.add(dNueve);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(325, 11, 302, 334);
		panel_2.setLayout(new BorderLayout(0, 0));
		estaca2= new Estaca2();
		panel_2.add(estaca2);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(637, 11, 302, 334);
		panel_3.setLayout(new BorderLayout(0, 0));
		estaca3= new Estaca3();
		panel_3.add(estaca3);
		panel.add(panel_3);
		
		JLabel lblNewLabel = new JLabel("Contador");
		lblNewLabel.setBounds(861, 391, 99, 35);
		panel.add(lblNewLabel);
		
		//Accion de mi boton 1
		JButton movUno = new JButton("1");
		movUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 if (desde==0) {
			            desde = 1;
			            movInicial.setText("" + desde);
			        } else if (hasta==0) {

			                hasta = 1;
			                movFinal.setText("" + hasta);

			            }
				
				
			}
		});
		movUno.setBounds(115, 374, 89, 23);
		panel.add(movUno);
		
		//Accion de mi boton 2
		JButton movDos = new JButton("2");
		movDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 if (desde==0) {
			            desde = 2;
			            movInicial.setText("" + desde);
			        } else if (hasta==0) {

			                hasta = 2;
			                movFinal.setText("" + hasta);

			            }
				
				
				
			}
		});
		movDos.setBounds(432, 374, 89, 23);
		panel.add(movDos);
		
		//Accion de mi boton 3
		JButton mov3 = new JButton("3");
		mov3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 if (desde==0) {
			            desde = 3;
			            movInicial.setText("" + desde);
			        } else if (hasta==0) {

			                hasta = 3;
			                movFinal.setText("" + hasta);

			            }
			}
		});
		mov3.setBounds(752, 374, 89, 23);
		panel.add(mov3);
		
		/*Este va a contener la accion de mover los discos y 
			limpiar los labels final e inicial.
		*/
		JButton mover = new JButton("Mover");
		mover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					desde = 0;
			        movInicial.setText("");
			        hasta = 0;
			        movFinal.setText("");
				
			}
		});
		mover.setForeground(new Color(60, 179, 113));
		mover.setFont(new Font("OCR A Extended", Font.PLAIN, 16));
		mover.setBounds(10, 397, 89, 23);
		panel.add(mover);
		
		movInicial = new JLabel();
		movInicial.setBounds(20, 439, 46, 14);
		panel.add(movInicial);
		
		JLabel lblA = new JLabel("a");
		lblA.setBounds(85, 439, 27, 14);
		panel.add(lblA);
		
		movFinal = new JLabel();
		movFinal.setBounds(126, 439, 46, 14);
		panel.add(movFinal);
		
	}
}
