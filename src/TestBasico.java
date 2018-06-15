

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class TestBasico {

	private Calculadora calc = new Calculadora();
	
	@Test
	public void iniciar_en_cero() {

		Assert.assertEquals(0, calc.valor());
		
	}
	
	

	@Test
	public void divdir() {
		
		double res = calc.dividir(30,5);
		assertEquals(6.0, res, 0.0);
		
	}

	@Test
	public void divdirPorCero() {
	
		try
		  {
			double res = calc.dividir(30,0);
		  }
		  catch( ArithmeticException e )
		  {
			final String msg = "error, division por cero";
		    assertEquals(msg, e.getMessage());
		  }
		
	
	}
	
}
