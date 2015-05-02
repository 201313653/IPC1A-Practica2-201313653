package hanoi;

public class MatrizTorres {
	
	VentanaDeJuego discos= new VentanaDeJuego();
	Hanoi1 cantidad= new Hanoi1();
	Hanoi1 principal = new Hanoi1();
	int posicionTorre1=10;
	Object [] almDiscos={discos.dUno, discos.dDos, discos.dTres, discos.dCuatro, discos.dCinco, discos.dSeis, discos.dSiete,discos.dOcho,discos.dNueve};
	
void torres3(){
//aca le doy la visibilidad a mis discos
		discos.dTres.setVisible(true);
		discos.dDos.setVisible(true);
		discos.dUno.setVisible(true);
//aca cargo mi matriz		
		cargarMatriz(3);
		matrizTorres(3);
		discos.ventana2.setVisible(true);
		
		
	}

void torres4(){
	//aca le doy la visibilidad a mis discos
			discos.dCuatro.setVisible(true);
			discos.dTres.setVisible(true);
			discos.dDos.setVisible(true);
			discos.dUno.setVisible(true);
	//aca cargo mi matriz		
			cargarMatriz(4);
			matrizTorres(4);
			discos.ventana2.setVisible(true);
			
			
		}
void torres5() {
	
	//aca le doy la visibilidad a mis discos
	discos.dCinco.setVisible(true);
	discos.dCuatro.setVisible(true);
	discos.dTres.setVisible(true);
	discos.dDos.setVisible(true);
	discos.dUno.setVisible(true);
//aca cargo mi matriz		
	cargarMatriz(5);
	matrizTorres(5);
	discos.ventana2.setVisible(true);
}

 void torres6() {
	//aca le doy la visibilidad a mis discos
	 discos.dSeis.setVisible(true);
	discos.dCinco.setVisible(true);	
	 discos.dCuatro.setVisible(true);
		discos.dTres.setVisible(true);
		discos.dDos.setVisible(true);
		discos.dUno.setVisible(true);
//aca cargo mi matriz		
		cargarMatriz(6);
		matrizTorres(6);
		discos.ventana2.setVisible(true);
	
}
 void torres7() {

	//aca le doy la visibilidad a mis discos
	 discos.dSiete.setVisible(true);
	 discos.dSeis.setVisible(true);
		discos.dCinco.setVisible(true);	
		discos.dCuatro.setVisible(true);
		discos.dTres.setVisible(true);
		discos.dDos.setVisible(true);
		discos.dUno.setVisible(true);
//aca cargo mi matriz		
		cargarMatriz(7);
		matrizTorres(7);
		discos.ventana2.setVisible(true);
}

void torres8() {
	//aca le doy la visibilidad a mis discos
			discos.dOcho.setVisible(true);	 
			discos.dSiete.setVisible(true);
			discos.dSeis.setVisible(true);
			discos.dCinco.setVisible(true);	
			discos.dCuatro.setVisible(true);
			discos.dTres.setVisible(true);
			discos.dDos.setVisible(true);
			discos.dUno.setVisible(true);
	//aca cargo mi matriz		
			cargarMatriz(8);
			matrizTorres(8);
			discos.ventana2.setVisible(true);
	
	
}
	
//Este metodo ira contando la cantidad de discos que voy a colocar
	void matrizTorres(int a){
		
		for (int i=0; i<=a; i++){
			
            if (i == 3) {
            	discos.dUno.setBounds(70,215,302,33);
            	discos.dDos.setBounds(60,245,302,33);
                discos.dTres.setBounds(50, 275, 302, 33);
            }
            if (i == 4) {
            	discos.dUno.setBounds(75,185,302,33);
            	discos.dDos.setBounds(60,215,302,33);
                discos.dTres.setBounds(50, 245, 302, 33);
                discos.dCuatro.setBounds(40, 275, 302, 33);
            }
            if (i == 5) {
            	discos.dUno.setBounds(85,155,302,33);
            	discos.dDos.setBounds(75,185,302,33);
                discos.dTres.setBounds(60, 215, 302, 33);
                discos.dCuatro.setBounds(50, 245, 302, 33);
                discos.dCinco.setBounds(40, 275, 302, 33);
            }
            if (i == 6) {
            	discos.dUno.setBounds(75,130,302,33);
            	discos.dDos.setBounds(65,160,302,33);
                discos.dTres.setBounds(55, 190, 302, 33);
                discos.dCuatro.setBounds(40, 220, 302, 33);
                discos.dCinco.setBounds(30, 250, 302, 33);
                discos.dSeis.setBounds(25, 275, 302, 33);
            }
            if (i == 7) {
            	discos.dUno.setBounds(75,110,302,33);
            	discos.dDos.setBounds(60,140,302,33);
                discos.dTres.setBounds(50, 170, 302, 33);
                discos.dCuatro.setBounds(35, 200, 302, 33);
                discos.dCinco.setBounds(25, 225, 302, 33);
                discos.dSeis.setBounds(20, 250, 302, 33);
                discos.dSiete.setBounds(10, 275, 302, 33);
            }
            if (i == 8) {
            	discos.dUno.setBounds(75,85,302,33);
            	discos.dDos.setBounds(65,115,302,33);
                discos.dTres.setBounds(50, 145, 302, 33);
                discos.dCuatro.setBounds(40, 175, 302, 33);
                discos.dCinco.setBounds(25, 205, 302, 33);
                discos.dSeis.setBounds(20, 230, 302, 33);
                discos.dSiete.setBounds(10, 255, 302, 33);
                discos.dOcho.setBounds(0, 275, 302, 33);
            }
            if (i == 9) {
                discos.dNueve.setBounds(0, 277, 302, 33);
            }
		}	
		
	}
	
	//En este metodo estoy almacenando mis objetos y me recorre la matriz, para poder ver mis datos almacenados
	void cargarMatriz(int a){
		int contador = 0;
		
		for (int i=0; i<=a; i++){
			almDiscos[i]=contador++;
			
			
			System.out.println(almDiscos[i]);
			
		}
		System.out.println("-------------------------");
		
	}

	
	

}
