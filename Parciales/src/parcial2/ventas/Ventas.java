package parcial2.ventas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Se dispone del archivo ventas.in con las ventas realizadas por la empresa de
 * los productos enviados por el depósito número 5. Cada línea del archivo
 * contiene: Código de producto (5 caracteres alfanuméricos) y Cantidad vendida
 * (entero 1 y 1000). Los campos están separados por un espacio en blanco.
 * Generar el archivo ventasPorProducto.out con el siguiente formato (una línea
 * por producto). Nota: Se espera un adecuado tratamiento de excepciones.
 * Ejemplo:
 */

public class Ventas {

	private Map<String, Integer> productos;

	public Ventas() {
		this.productos = new HashMap<String, Integer>();
	}

	public void leerVentas(String entrada) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(entrada);
			br = new BufferedReader(fr);
			String linea;
			
			while ((linea = br.readLine()) != null) {
				String[] datos = linea.split(" ");
				String codigoProducto = datos[0]; 
				Integer cantidadVentas = Integer.parseInt(datos[1]); 
				
				if (productos.containsKey(datos[0]))
					productos.put(codigoProducto, productos.get(codigoProducto) + cantidadVentas);
				else 
					productos.put(codigoProducto, cantidadVentas);
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		}
	}

	public void escribirVentasPorProducto(String salida) {
		
		File archivo = new File(salida);
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(archivo));
			for (Map.Entry<String, Integer> entry : productos.entrySet()) {
				String codigoProdcuto = entry.getKey();
				Integer cantVentas = entry.getValue();
				bw.write(codigoProdcuto + " " + cantVentas);
				bw.newLine();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Ventas ventas = new Ventas();
		
		ventas.leerVentas("ventas.in");
		ventas.escribirVentasPorProducto("ventasPorProducto.txt");
		
	}

}
