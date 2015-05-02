package hanoi;

import java.util.Stack;

public class Pila {
	int [] pila;
	int cima;
	
	public Pila(int a){
		pila = new int[a];
		cima= -1;
	}
	
	public void push(int a){
		pila[++cima]=a;
		
		
	}
	
	public void pop(){
		cima--;
	}
	
	public void mostrar(){
		System.out.print("[ ");
		for (int i=0; i<=cima; i++){
			System.out.println(" ]");
		}
	}
	
}
	
 
	
	


