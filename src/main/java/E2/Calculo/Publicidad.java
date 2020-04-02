package E2.Calculo;

import E2.Calculo.Recuadro;

public class Publicidad extends Recuadro {

	public static final int VALOR_PUBLICIDAD = 10;
	private String marca;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public float facturar() {
		return dimension * VALOR_PUBLICIDAD;
	}
	
	
	
	
}
