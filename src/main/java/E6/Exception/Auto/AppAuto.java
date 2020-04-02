package E6.Exception.Auto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//************************************************************************
/*
 * GENERA EN EL ARCHIO OUT.TXT (Declarado dentro del codigo) ARRIBA DEL POM.XML Y README. 
 * La hora y de la acelerada y de la frenada del auto para control
 */
public class AppAuto {

	public static void main(String[] args) {
		
		
		Auto au = new Auto();
		System.out.println("Velocidad: " + au.getVelocidad());
		log(au.getVelocidad());
		Scanner sc = new Scanner(System.in);
		System.out.println("1: Acelerar   2: Frenar  0: Salir");
		int opcion = sc.nextInt();
		while (opcion != 0) {
			Date momentoActual = new Date();
			// fecha - operacion - ultima velocidad 
			switch (opcion) {
			case 1:
				try {
					au.acelerar();
				} catch (ExcesoVelocidadException e) {
					System.out.println("No puede acelerar mas");
				}
				log(au.getVelocidad());
				break;
			case 2:
				try {
					au.frenar();
				} catch (AutoDetenidoException e) {
					System.out.println("Ya esta detenido");
				}
				log(au.getVelocidad());
				break;

			default:
				break;
			}
			
			System.out.println("1: Acelerar   2: Frenar  0: Salir");
			opcion = sc.nextInt();

		}
	}

	private static void log(int velocidad) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("out.txt", true));

		} catch (IOException e1) {
			System.out.println("Archivo no encontrado");
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date momAct = new Date();
		String actual = sdf.format(momAct);
		try {
			bw.write('\n' + actual + " " + velocidad);
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}
