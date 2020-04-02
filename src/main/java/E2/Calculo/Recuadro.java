package E2.Calculo;

public abstract class Recuadro {

	protected int dimension;
	
	protected abstract float facturar();
	
	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	
	
}
