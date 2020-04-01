package Ejercicio8Archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class AppLecturaArchivo {

	public static void main(String args[]) {
		
		
		//BLOQUE LECTURA
		try {
			
		FileReader fr = new FileReader ("C:\\Users\\leand\\datos\\ejercicio");
		
		BufferedReader br = new BufferedReader(fr);
		
		String i;
		while ((i = br.readLine()) != null) {
			System.out.println(i);
		}
		br.close();
		fr.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
		//BLOQUE ESCRITURA
		
		File fout = new File ("C:\\Users\\leand\\datos\\ejercicio");
		FileOutputStream fos;
	
		try {
			fos = new FileOutputStream(fout);
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			
			
			bw.write("---BUENOS DIAS---");
			bw.newLine();
			bw.write("-------TyC-------");
			bw.newLine();
			bw.write("Todo los dias desde las 12 horas pasaran los partidos de la seleccion argentina en el mundial 2014");
			
			
			
//			for (int j = 0; j < 10; j++) {
//				bw.write("something " + j);
//				bw.newLine();
//			}
			
			bw.close();
		} catch (FileNotFoundException e) {
			//
			e.printStackTrace();
		} catch (IOException e) {
			//
			e.printStackTrace();
		}
		
}

}