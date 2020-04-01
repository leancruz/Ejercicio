package Ejercicio8Archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class AppLecturaArchivo2 {

	public static void main(String args[]) {
		
		
		//BLOQUE LECTURA
		try {
			
		FileReader fr = new FileReader ("C:\\Users\\leand\\datos\\ejercicio");
		BufferedReader br = new BufferedReader(fr);
		
		File fout = new File ("C:\\Users\\leand\\datos\\ejercicio");
		FileOutputStream fos;
		fos = new FileOutputStream(fout);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		
		
		
		String i;
		while ((i = br.readLine()) != null) {
			bw.write(i);
			bw.newLine();
		}
		
		
		br.close();
		fr.close();
		bw.close();
		
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
}

}