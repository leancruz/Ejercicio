package E3.Calculo2;

import java.util.Scanner;


import E3.Calculo2.Rectangular;
import E3.Calculo2.Triangular;

public class App3 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int pos=0; 
		
		System.out.println("----------------");
		System.out.println("----TERRENOS----");
		System.out.println("----------------");
		System.out.println("----------------");
		
		System.out.println("Opcion 1: AREA DEL TRIANGULO");
		System.out.println("Opcion 2: AREA DEL RECTANGULO");
		System.out.println("Opcion 0: SALIR");
		int opcion = sc.nextInt();

		
		
		while (opcion!=0) {
			
		
		
		if (opcion==1) {
			
			System.out.println("Ingrese la Base: ");
			int base = sc.nextInt();
			System.out.println("Ingrese la Altura: ");
			int altura = sc.nextInt();
			Triangular tri = new Triangular();
			tri.setBase1(base);
			tri.setAltura1(altura);
		}
		
		else {
			
			System.out.println("Ingrese la Base: ");
			int base = sc.nextInt();
			System.out.println("Ingrese la Altura: ");
			int altura = sc.nextInt();
			Rectangular rec = new Rectangular();
			rec.setBase(base);
			rec.setAltura(altura);
		}
		
		
		
		}	
	}
}
	