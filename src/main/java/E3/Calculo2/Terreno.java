package E3.Calculo2;

public abstract class Terreno {

	protected int metraje;

	protected abstract float metros();

	public int getMetraje() {
		return metraje;
	}

	public void setMetraje(int metraje) {
		this.metraje = metraje;
	}

}