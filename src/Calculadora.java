
public class Calculadora {

	public int valor() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	public double dividir(int i, int j) {
		// TODO Auto-generated method stub
		double res = 0.0;
		
	    if (j == 0) {
	        throw new ArithmeticException("error, division por cero");
	    } else {
	        return i / j;
	    }
	}

}
