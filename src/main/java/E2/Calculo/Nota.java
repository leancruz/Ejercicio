package E2.Calculo;

import E2.Calculo.Recuadro;

public class Nota extends Recuadro {
	
public static final int VALOR_NOTA = 2;

	private String texto;
	private String titulo;
	public String getTexto() {
		return texto;
	}
	
	
	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	@Override
	public float facturar() {
		return dimension * VALOR_NOTA * -1;
	}
}