package Debern1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =new Scanner(System.in);
		System.out.println("Ingrese un numero A:");
		int A= teclado.nextInt();
	System.out.println("Ingrese un numero B:");
	int B = teclado.nextInt();
	if(B>1) {
	
		int D=A/B;
		System.out.println ("La division es:" +D);
	}else {
		System.out.println("la division es imposible");
				
		
	}

	}

}
