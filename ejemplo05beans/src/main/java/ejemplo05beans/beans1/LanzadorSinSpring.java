package ejemplo05beans.beans1;

public class LanzadorSinSpring {
	private static 
		MorcillaDeLeon morcilla;
	public static void main(String[] args) {
		MorcillaDeLeon morcilla = 
				new MorcillaDeLeon();
		morcilla.setColor("Sangre");
		morcilla.setSabor("Riquisimo");
		LanzadorSinSpring.morcilla =
				morcilla;
		cambiame();

	}
	public static void cambiame() {
		
		morcilla.setColor("Sangre negra");

	}

}
