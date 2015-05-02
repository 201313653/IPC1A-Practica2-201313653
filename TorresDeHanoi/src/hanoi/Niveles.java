package hanoi;
import java.util.*;
public class Niveles {
	
	public static Pila niveles;
	public static VentanaDeJuego discos;
	
	
	
	public static int Tres( int a, int y){
		
		int resultado=0;
		
		return resultado= a+y;
		
		
	}
	
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		int uno=0;
		int dos=0;
		
		System.out.println("Ingrese un numero: ");
		
		uno= Integer.parseInt(in.nextLine());
		
		System.out.println("Ingrese otro numero: ");
		
		dos= Integer.parseInt(in.nextLine());
		
		System.out.println(Tres(uno,dos));
		 
		
	}

}
