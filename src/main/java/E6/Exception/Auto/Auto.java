package E6.Exception.Auto;

public class Auto {

	private int velocidad;

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int acelerar() throws ExcesoVelocidadException {
		int diez = 10;
		int nueva = getVelocidad() + diez;
		if (nueva > 40) {
			throw new ExcesoVelocidadException();
		}
		this.setVelocidad(nueva);
		System.out.println("Nueva velocidad: " + nueva);
		return getVelocidad();
	}
	
	public int frenar() throws AutoDetenidoException {
		int nueva = getVelocidad() - 10;
		if (nueva < 0) {

		}
		this.setVelocidad(nueva);
		System.out.println("Nueva velocidad: " + nueva);
		return nueva;
	}
}
