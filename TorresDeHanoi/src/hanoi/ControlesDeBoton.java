package hanoi;

public class ControlesDeBoton {
	
	
	int desde=0;
	int hasta=0;
	VentanaDeJuego labels = new VentanaDeJuego();
	
	void desdeHasta1(){
		
		 if (desde==0) {
	            desde = 1;
	            labels.movInicial.setText("" + desde);
	        } else if (hasta==0) {

	                hasta = 1;
	                labels.movFinal.setText("" + hasta);

	            }
	}

}
