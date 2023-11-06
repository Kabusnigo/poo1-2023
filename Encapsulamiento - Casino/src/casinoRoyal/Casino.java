package casinoRoyal;

public class Casino {
	public static void main(String[] args) {
		Tragamonedas miTragamonedas = new Tragamonedas();
		int intentos=1;
		miTragamonedas.activar();
		while (!miTragamonedas.entregaPremio()) {
			miTragamonedas.activar();
			intentos++;
		}
		System.out.println(miTragamonedas);
		System.out.println(intentos);
		
	}
}
