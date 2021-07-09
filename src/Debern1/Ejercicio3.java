package Debern1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Lector = new Scanner(System.in);
		System.out.println("Ingrese el valor del sueldo:");
		int S=Lector.nextInt();
		
		if(S<300) {
			int B = 100;
			int T= S+B;
			System.out.println("El sueldo total:"+T);
		} else if (S>=300&& S>=300&& S <=400) {
			int B =70;
			int T= S+B;
			System.out.println("El sueldo total:"+T);
		}else {
			int B = 50;
			int T = S+B;
			System.out.println("El sueldo total "+T);
			
		}

	}

}
