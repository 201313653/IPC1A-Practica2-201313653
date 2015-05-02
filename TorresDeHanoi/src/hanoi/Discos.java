package hanoi;

public class Discos {
	
	VentanaDeJuego discos= new VentanaDeJuego();
	Hanoi1 cantidad= new Hanoi1();
	Hanoi1 principal = new Hanoi1();
	int matrizTorres[][] = new int[11][11];
	int escalones = 9 ;
	int vertical=77;
	int posicionTorre1=10;
	void torres3(){
	
		
		discos.dUno.setVisible(true);
		discos.dDos.setVisible(true);
		discos.dTres.setVisible(true);
		discos.dCuatro.setVisible(false);
		discos.dCinco.setVisible(false);
		discos.dSeis.setVisible(false);
		discos.dSiete.setVisible(false);
		discos.dOcho.setVisible(false);
		discos.dNueve.setVisible(false);
		cantidad.niveles.getSelectedIndex();
		mostrarTorre();
		cargarMatriz();
		discos.ventana2.setVisible(true);
		
		
		
	}
	void torres4(){
	
		
		discos.dUno.setVisible(true);
		discos.dDos.setVisible(true);
		discos.dTres.setVisible(true);
		discos.dCuatro.setVisible(true);
		discos.dCinco.setVisible(false);
		discos.dSeis.setVisible(false);
		discos.dSiete.setVisible(false);
		discos.dOcho.setVisible(false);
		discos.dNueve.setVisible(false);
		cantidad.niveles.setSelectedIndex(4);
		mostrarTorre();
		cargarMatriz();
		discos.ventana2.setVisible(true);
		
		
		
	}
	
	void cargarMatriz(){
		for (int i = 1; i <= cantidad.niveles.getSelectedIndex(); i++) {
            for (int j = 1; j <= 3; j++) {
                matrizTorres[i][j] = 0;
                matrizTorres[i][1] = i;
            }
        }
	}
		
	 public void mostrarTorre() {

	        //1.- Coodenada vertical 2.- Coordinada horizontal 3.- ancho del objeto 4.-Alto del objeto 
	        for (int i = 1; i <= cantidad.niveles.getSelectedIndex(); i++) {

	            if (i == 1) {
	                discos.dUno.setBounds(0, 277, 302, 33);
	            }
	            if (i == 2) {
	                discos.dDos.setBounds(76, 77, 302, 33);
	            }
	            if (i == 3) {
	                discos.dTres.setBounds(64, 109, 302, 33);
	            }
	            if (i == 4) {
	                discos.dCuatro.setBounds(49, 139, 302, 33);
	            }
	            if (i == 5) {
	                discos.dCinco.setBounds(35, 168, 302, 33);
	            }
	            if (i == 6) {
	                discos.dSeis.setBounds(22, 198, 302, 33);
	            }
	            if (i == 7) {
	                discos.dSiete.setBounds(22, 228, 302, 33);
	            }
	            if (i == 8) {
	                discos.dOcho.setBounds(10, 255, 302, 33);
	            }
	            if (i == 9) {
	                discos.dNueve.setBounds(0, 277, 302, 33);
	            }
	        }
	    }
		
	
	
		public void mostrarMatrizTorres(int selectedIndex) {
		        System.out.println("------------------------------");
		        for (int i = 1; i <= cantidad.niveles.getSelectedIndex(); i++) {

		            System.out.println("matrizTores[i][j]= " + matrizTorres[i][1] + " / " + matrizTorres[i][2] + " / " + matrizTorres[i][3]);
		        }
		    }
		public void torres3(int selectedIndex) {
		
			discos.dUno.setVisible(true);
			discos.dDos.setVisible(true);
			discos.dTres.setVisible(true);
			discos.dCuatro.setVisible(false);
			discos.dCinco.setVisible(false);
			discos.dSeis.setVisible(false);
			discos.dSiete.setVisible(false);
			discos.dOcho.setVisible(false);
			discos.dNueve.setVisible(false);
			
			mostrarTorre();
			cargarMatriz();
			discos.ventana2.setVisible(true);
			
		}
		public void mostrarTorre(int selectedIndex) {
			  //1.- Coodenada vertical 2.- Coordinada horizontal 3.- ancho del objeto 4.-Alto del objeto 
	        for (int i = 1; i <= cantidad.niveles.getSelectedIndex(); i++) {

	            if (i == 1) {
	                discos.dUno.setBounds(0, 277, 302, 33);
	            }
	            if (i == 2) {
	                discos.dDos.setBounds(76, 77, 302, 33);
	            }
	            if (i == 3) {
	                discos.dTres.setBounds(64, 109, 302, 33);
	            }
	            if (i == 4) {
	                discos.dCuatro.setBounds(49, 139, 302, 33);
	            }
	            if (i == 5) {
	                discos.dCinco.setBounds(35, 168, 302, 33);
	            }
	            if (i == 6) {
	                discos.dSeis.setBounds(22, 198, 302, 33);
	            }
	            if (i == 7) {
	                discos.dSiete.setBounds(22, 228, 302, 33);
	            }
	            if (i == 8) {
	                discos.dOcho.setBounds(10, 255, 302, 33);
	            }
	            if (i == 9) {
	                discos.dNueve.setBounds(0, 277, 302, 33);
	            }
	        }
		}
		public void cargarMatriz(int selectedIndex) {
			for (int i = 1; i <= cantidad.niveles.getSelectedIndex(); i++) {
	            for (int j = 1; j <= 3; j++) {
	                matrizTorres[i][j] = 0;
	                matrizTorres[i][1] = i;
	            }
	        }
			
		}
        
	}

	
	
	

