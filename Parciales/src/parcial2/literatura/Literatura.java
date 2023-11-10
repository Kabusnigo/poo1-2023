package parcial2.literatura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 1. [3 puntos]. Implemente un método que dado un archivo de entrada (archivo
 * que será leído) y uno de salida (archivo que será escrito), especificados con
 * su ruta, y dos palabras: palabraAReemplazar y nuevaPalabra, escriba en el
 * archivo de salida el contenido del archivo de entrada, pero con la primer
 * palabra reemplazada por la segunda.
 * 
 */

public class Literatura {

	public void reemplazar(String archivoOrigen, String archivoDestino, String palabraAReemplazar,
			String nuevaPalabra) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			fr = new FileReader(archivoOrigen);
			br = new BufferedReader(fr);
			fw = new FileWriter(archivoDestino);
			pw = new PrintWriter(fw);
			String linea;

			while ((linea = br.readLine()) != null) {
				linea.replace(palabraAReemplazar, nuevaPalabra);
				pw.println(linea);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			pw.close();
		}
	}
	
	public List<Libro> eliminarLibrosRepetidos(List<Libro> libros){
		Set<Libro> aux = new TreeSet<Libro>(libros);
		
		List<Libro> listaSinLibrosRepetidos = new ArrayList<>(aux);
		
		return listaSinLibrosRepetidos;
	}
	
	public static void main(String[] args) {
		Literatura lit = new Literatura();
		
		lit.reemplazar("Texto.txt", "TextoReemplazado.txt", "kit", "set");
		
		List<Libro> libros = new ArrayList<>();
		
		libros.add(new Libro((long)(2123), "Koala"));
		libros.add(new Libro((long)(21), "Loki"));
		libros.add(new Libro((long)(21), "Loki"));
		libros.add(new Libro((long)(735), "Aveztrus"));
		libros.add(new Libro((long)(2123), "Koala"));
		
		List<Libro> nuevoslibros = lit.eliminarLibrosRepetidos(libros);
		
		for (Libro libro : nuevoslibros)
			System.out.println(libro);
		
	}

}
