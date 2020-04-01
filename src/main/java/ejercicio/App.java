package ejercicio;

import java.util.Scanner;

public class App {

	private static int TOTAL_PUBLICACIONES = 4;
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int pos=0; 
	
	Recuadro [] portada = new Recuadro [TOTAL_PUBLICACIONES]; 
	for (int i=0; i < TOTAL_PUBLICACIONES; i++) {
		
		System.out.println("----------------");
		System.out.println("Periodico Online");
		System.out.println("----------------");
		System.out.println("----------------");
		System.out.println("Ingrese que quiere mostrar");
		
		
		System.out.println("1 - Publicidad /// 2 - Notas");
		int opcion = sc.nextInt();
		
		System.out.println("Ingrese dimension");
		int dimension = sc.nextInt();
		
		
		if (opcion==1) {
			
	        System .out.println("Ingrese marca: ");
	        String marca = sc.next();
			Publicidad pub = new Publicidad();
			pub.setDimension(dimension);
			pub.setMarca(marca);
			portada[pos] = pub;
		}
		else {
			
			System.out.println("Ingrese titulo: ");
	        String titulo = sc.next();
	        System.out.println("Ingrese texto");
	        String texto = sc.next();
	        Nota not = new Nota();
	        not.setDimension(dimension);
	        not.setTitulo(titulo);
	        not.setTexto(texto);
	        portada [pos] = not;
		
		}
		
		
		float total = 0;
		for (int a=0; a < TOTAL_PUBLICACIONES ; a++) {
			total = total + portada[pos].facturar();
		}
		
		
		System.out.println("Ingreso total: " + total);
		
		
		}
	}
}