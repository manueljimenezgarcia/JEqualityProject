package src;

public class JE {

	public static void main(String[] args) {
		
		Puticlub puticlub = new Puticlub();
		Cerveza cerveza = new Cerveza();
		Siesta siesta = new Siesta();
		Tapa tapa = new Tapa();

		cerveza.beber();
		cerveza.beber();
		cerveza.rellenar();
		cerveza.beber();

		for(int i = 0; i < 4; i++) {
			System.out.println(tapa.dameTapa(i) + " ñam ñam");
		}

		System.out.println(puticlub.getChica(0) + " te voy a dar candela");

		System.out.println("Ay que cansao estoy, mi arrrma!!!");
		System.out.println(siesta.echar());

	}

}
