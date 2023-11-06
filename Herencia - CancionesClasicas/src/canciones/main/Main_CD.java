package canciones.main;

import java.util.Scanner;

public class Main_CD {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		CD cd = new CD();
		int opc;

		do {
			System.out.println("1- Crear Base de datos de Canciones Clasicas.");
			System.out.println("2- Eliminar Canciona por numero de referencia...");
			System.out.println("3- Listar todas las canciones.");
			System.out.println("0- Salir.\n");
			opc = read.nextInt();

			switch (opc) {

			case 1:
				cd.crearCancion(134, "Innuendo", "Innuendo", "Queen", "Guitarra, Bateria, Bajo, Piano");
				cd.crearCancion(2102, "The Show Must Go On", "Innuendo", "Queen", "Guitarra, Bateria, Bajo, Piano");
				cd.crearCancion(5199, "Delilah", "Innuendo", "Queen", "Guitarra, Bateria, Bajo, Piano");
				break;

			case 2:
				System.out.print("\n Ingrese numero de referencia: ");
				cd.eliminarCancionPorReferencia(read.nextLong());
				break;

			case 3:
				cd.listarTodasLasCanciones();
				break;

			default:
				if (opc == 0) {
					System.out.print("\n El programa finalizó.");
					break;
				}
				System.out.print("\n Opción incorrecta.");
			}

		} while (opc != 0);

	}

}
