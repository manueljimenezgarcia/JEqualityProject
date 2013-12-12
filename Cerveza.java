public class Cerveza {

	private static String MARCA = "CRUZCAMPO";

	private boolean llena = true;

	public void beber() {

		if(llena) {
			llena = false;
			System.out.println("Ay que rica, compadre!");
		} else {
			System.out.println("Camarero, esto esta vacio");
		}

	}

	public void rellenar() {
		llena = true;
	}
}
