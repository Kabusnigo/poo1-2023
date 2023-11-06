package pandolfo.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

public class FileSystem {

	public static void main(String[] args) throws IOException {
		
		File file = new File("./io/prueba.txt");
		System.out.println("El archivo " + file.getName() + " existe: " + file.exists());
		System.out.println("Ruta: " + file.getPath());
		System.out.println("Es de lectura: " + file.canRead());
		System.out.println("Es de escritura: " + file.canWrite());
		System.out.println("Es un archivo: " + file.isFile());
		System.out.println("Es un directorio: " + file.isDirectory());
		System.out.println("Es un archivo oculto: " + file.isHidden());
		System.out.println("Tamaño del archivo: " + file.length());
		System.out.println("Ultima modificacion: " + (new Date(file.lastModified())));
		
		System.out.println("\n--Listar archivos dentro de io: ");
		File directorio = new File("./io");
		String [] archivos = directorio.list();
		for (String string : archivos)
			System.out.println(string);
		
		System.out.println("\n--Listar el peso de varios archivos: ");
		File[] files = directorio.listFiles();
		for (File dFile : files)
			System.out.println(dFile.getName() + "  " + dFile.length());
		
		System.out.println("\n--Listar archivos que empiezan con a: ");
		File[] filesConA = directorio.listFiles(new MiFiltro("a"));
		for (File dFile : filesConA)
			System.out.println(dFile.getName() + "  " + dFile.length());
		
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String linea = br.readLine();
			
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fr != null)
				fr.close();

		}
	}
	
}
