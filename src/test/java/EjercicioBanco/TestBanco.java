package EjercicioBanco;

/*
 * Falta hacer la parte de cuenta sin saldo
 */


import E6.Exception.Banco.CajaAhorro;
import E6.Exception.Banco.CuentaCorriente;
import E6.Exception.Banco.SaldoException;
import junit.framework.TestCase;

public class TestBanco extends TestCase{

	
	//Deposito Caja Ahorro
	
	public void testDepositoCA() {
		CajaAhorro ca = new CajaAhorro("001", 100);
		ca.depositar(2);
		assertTrue(ca.getSaldo() == 102);
	}
	
	
	//Extracción Caja Ahorro
	
	public void testRetiroCA() {
		CajaAhorro ca = new CajaAhorro("001", 100);
		
		try {
			ca.extraer(101);
		} catch (SaldoException e) {
			e.printStackTrace();
		}
		
		assertTrue(ca.getSaldo() == 100);
	}
	
	
	
	//Deposito Core
	
	public void testCorrienteCC() {
		CuentaCorriente cc = new CuentaCorriente("001", 100, 0);
		cc.depositar(2);
		assertTrue(cc.getSaldo() == 102);
	}
	
	//Descubierto Corriente
	
		public void testCorrienteDescubiertoCC() {
			CuentaCorriente cc = new CuentaCorriente("100",0,100);
			
			try {
				cc.extraer(100);
			} catch (SaldoException e) {
				e.printStackTrace();
			}
			
			assertTrue(cc.getSaldo() == -100);
		
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
