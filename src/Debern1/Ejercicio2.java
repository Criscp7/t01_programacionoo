package Debern1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese dos numeros");
		Scanner teclado =new Scanner(System.in);
		
		int A=teclado.nextInt();
		int B=teclado.nextInt();
		int R=A%B;
		if(R==0) {
			System.out.println(A+"si es multiplo de:"+B);
		}
		else {
			System.out.println(A+"no es multiplo de:"+A);
		
		}

	}

}
