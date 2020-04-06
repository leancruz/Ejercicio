package E7.Exception;

import java.util.Scanner;

/**
 * 
 * Se tiene el control de un auto el cual se puede acelerar de 10 km/h en 10
 * hasta los 40 km/h.
 * 
 * Si supera dicha velicidad debe lanzarse "Exceso de velocidad"
 * (ExcesoVelocidadException
 * 
 * Puede frenar restando de 10 km/h en 10 km/h
 * 
 * Si intenta frenar cuando el auto esta detenido lanzar "Auto detenido"
 * (AutoDetenidoException)
 * 
 * Se pide un menu que se pueda acelerar o frenar el auto Y debe informar la
 * velocidad despues de cada operacion
 *
 */

//public class AppAuto {

//	public static void main(String[] args) throws Exception {
//	
//		Auto au = new Auto();
//		System.out.println("Velocidad: " + au.getVelocidad());
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.println("CONTROL DEL AUTO");
//		System.out.println("----------------");
//		System.out.println("Ingrese que desea hacer");
//		System.out.println("1 - Acelerar");
//		System.out.println("2 - Frenar");
//		System.out.println("0 - Apagar");
//		int opcion = sc.nextInt();
//		while (opcion != 0) {
//			switch (opcion) {
//			case 1:
//				try {
//					au.acelerar();
//				} catch (ExcesoVelocidadException e) {
//					System.out.println("No puede acelerar mas");
//				}
//				Log(au.getVelocidad());
//				break;		
//				
//			case 2:
//				au.frenar();
//			} catch (AutoDetenidoException e) {
//				System.out.println("Ya esta detenido");
//			}
//			log(au.getVelocidad());
//				break;
//				
//	//		default:
//				break;
//
//			}
//
//			System.out.println("Opciones: 1 - Acelerar /// 2 - Frenar /// 0 - Salir");
//			opcion = sc.nextInt();
//	}
//
//	private static void Log(int velocidad) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
