package E6.Exception.Ainicial;


import java.util.Scanner;

public class AppException {

	/*
	 * Actividad: Se venden viajes en auto de 3 pasajeros y en caso de que vendan
	 * los tres pasajes se debe informar al usuario que se ha producido una
	 * excepcion y se solicita ingresar el dia siguiente array[3] Pasaje: incluye
	 * dni y nombre de persona
	 * Mostrar el contenido del array listando dni y nombre de cada persona
	 * 
	 */
	public static void main(String[] args) {

		Pasaje[] pasajes = new Pasaje[3];
		int contador = 0;
		Scanner sc = new Scanner(System.in);

		try {
			
			while (true) {
				System.out.println("Ingrese dni:");
				int numDni = sc.nextInt();
				System.out.println("Ingrese nombre:");
				String nombre = sc.next();
				Pasaje pasa1 = new Pasaje(numDni, nombre);
				pasajes[contador] = pasa1;
				contador++;
				System.out.println("Pasaje ingresado correctamente");
			}
			
		}
		catch (Exception e) {
			
		}
/* EJEMPLO
		try {
			int num = 0;
			int resultado = num / num;
			System.out.println("El resultado es " + resultado);
		} catch (ArithmeticException eexecp) {
//			System.out.println("Execpcion: " + eexecp.getMessage());
//			System.out.println("debe ingresar un numero diferente de cero");
		} catch (NullPointerException e) {
			System.out.println("Null pointer");
		}

		System.out.println("Fin aplicacion");
		*/
	}
}
