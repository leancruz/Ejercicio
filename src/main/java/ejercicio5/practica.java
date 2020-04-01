package ejercicio5;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;


public class practica {

	public static void main(String[] args ) {
		
		String texto = "La embajada de china en españa asegura que los kits rapidos" +
					"\r\n" + "\r\n" +
					"El embajador de comercio ofrecido sanidad" +
					"\r\n" + " ";
		
		String [] arrayPalabras = texto.split(" ");
//		System.out.println(arrayPalabras.length);
//		System.out.println(arrayPalabras[0]);
		
		
		Map<String, Integer> mapa = new HashMap<String , Integer>();
		
		for (int i=0; i< arrayPalabras.length; i++) {
			String palabra = arrayPalabras[i];
			
			
			if (mapa.get(palabra) != null) {
				//existe entonces sumo uno al total (value)
				int cant = mapa.get(palabra);
				cant++;
				mapa.put(palabra , cant);
				
			}
			else {
				//agrego palabra al mapa con total = 1
				mapa.put(palabra, 1);
				
			}
			
		}
		
		Set<String> claves = mapa.keySet();
		Iterator <String> it = claves.iterator();
		int max = 0;
		String maxPal = "" ;
		List<contador>listaFinal = new ArrayList<contador>();
		while (it.hasNext()) {
			String palabra = it.next();
			int valor = mapa.get(palabra);
			
			if (valor > max ) {
				max = valor;
				maxPal = palabra;
			}
		
		/**
		 * Comando de contador para codigo anterior	
		 */
			
		contador cp = new contador();
		cp.setContador(valor);
		cp.setPalabra(palabra);
		listaFinal.add(cp);
		}
		
		
		System.out.println("La palabra repetida es " + maxPal + " con " + max);
		
		for (int j=0; j < listaFinal.size(); j++) {
			contador contPal = listaFinal.get(j);
			System.out.println(contPal.getPalabra() + ": " + contPal.getContador());
		}
		
		
		
		
	}
	
	
	
	
}
