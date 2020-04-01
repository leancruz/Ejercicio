package Eje7Excepciones.auto;

import java.util.Scanner;

import Ejercicio7.Excepciones.banco.CajaAhorro;
import Ejercicio7.Excepciones.banco.CuentaCorriente;
import Ejercicio7.Excepciones.banco.SaldoException;

/**
 * 
 * Se tiene el control de un auto el cual se puede acelerar
 * de 10 km/h en 10 hasta los 40 km/h.
 * 
 * Si supera dicha velicidad debe lanzarse "Exceso de velocidad"
 * (ExcesoVelocidadException
 * 
 * Puede frenar restando de 10 km/h en 10 km/h
 * 
 * Si intenta frenar cuando el auto esta detenido
 * lanzar "Auto detenido" (AutoDetenidoException)
 *  
 * Se pide un menu que se pueda acelerar o frenar el auto 
 * Y debe informar la velocidad despues de cada operacion 
 *
 */

public class AppAuto {
	
	public static void main(String[] args) {
	
		Auto au = new Auto();
		System.out.println("Velocidad: " + au.getVelocidad());
		Scanner sc = new Scanner (System.in);
		
		System.out.println("CONTROL DEL AUTO");
		System.out.println("----------------");
		System.out.println("Ingrese que desea hacer");
		System.out.println("1 - Acelerar");
		System.out.println("2 - Frenar");
		System.out.println("0 - Apagar");
		int opcion = sc.nextInt();

		while (opcion != 0) {
			switch (opcion) {
			case 1:
				try {
					au.acelerar();
				} catch (ExcesoVelocidadException e) {
					System.out.println("No puede acelerar mas");
				}
				
				
				break;
				
//		default;
				
				
			case 2:
				frenar();
				break;

			}

			System.out.println("Opciones: 1 - Acelerar /// 2 - Frenar /// 0 - Salir");
			opcion = sc.nextInt();
		}
	}

	
	
	// ---- PARTE SIN PROGRAMAR ----
	
	private static void frenar() {
//		
//		System.out.println("Opciones: 1. C.Ahorro 2. C.Corriente");
////		int cuenta = sc.nextInt();
//		
////		if (cuenta == 1) {
//			try {
////				ca.extraer(importe);
//			} catch (SaldoException e) {
//				System.out.println(e.getMessage());
//			}
////		} else {
//			try {
////				cc.extraer(importe);
//			} catch (SaldoException e) {
//				System.out.println(e.getMessage());
//			}
//		}
//
	}

	
	
	private static void acelerar() {
//	
//		System.out.println("Aumento de velocidad 10 Km/h");
//		int vel;
//		vel ++;
//
////		if (cuenta == 1) {
////			ca.depositar(importe);
////		} else {
////			cc.depositar(importe);
////		}
//
	}
	

}
