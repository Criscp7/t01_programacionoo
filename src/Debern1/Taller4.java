package Debern1;
import java.util.Scanner;

public class Taller4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ingrese el numero de filas:");
		Scanner lector=new Scanner(System.in);
		int N =lector.nextInt();
		// es el bluce grande
		for(int fila=1; fila<=N; fila++) {
			//bucle chiquito dentro del bluque grande
			for(int ast=N; ast>=fila;ast--) {
				System.out.print("*");
			}
			System.out.println();//salto de linea)
			}
			
		}

	}


