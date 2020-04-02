package EjercicioBanco;

import E6.Exception.Banco.CajaAhorro;
import E6.Exception.Banco.SaldoException;
import junit.framework.TestCase;

public class TestBanco extends TestCase{

	public void testDepositoCA() {
		CajaAhorro ca = new CajaAhorro("001", 100);
		ca.depositar(2);
		assertTrue(ca.getSaldo() == 102);
	}
	
	public void testRetiroCA() {
		CajaAhorro ca = new CajaAhorro("001", 100);
		
		try {
			ca.extraer(101);
		} catch (SaldoException e) {
			e.printStackTrace();
		}
		
		assertTrue(ca.getSaldo() == 100);
	}
	
	
}
