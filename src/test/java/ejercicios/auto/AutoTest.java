package ejercicios.auto;

import E6.Exception.Auto.Auto;
import E6.Exception.Auto.AutoDetenidoException;
import E6.Exception.Auto.ExcesoVelocidadException;
import junit.framework.TestCase;

public class AutoTest extends TestCase {

	public void testAutoAcelerar() {
		Auto au = new Auto();
		try {
			au.acelerar();

		} catch (ExcesoVelocidadException e) {
			e.printStackTrace();
		}

		int velo = au.getVelocidad();
		assertTrue(velo == 10);
	}

	// ***************************************************

	public void testAutoFrenar() {
		Auto au = new Auto();
		try {
			au.acelerar();
			au.acelerar();
			au.frenar();
			au.frenar();
		} catch (ExcesoVelocidadException e) {
			e.printStackTrace();
		} catch (AutoDetenidoException e) {
			e.printStackTrace();
		}

		int velo = au.getVelocidad();
		assertFalse(velo == 10);
		// assertTrue()
	}
}
