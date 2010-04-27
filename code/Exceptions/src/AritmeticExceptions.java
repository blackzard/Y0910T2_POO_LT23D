import java.text.MessageFormat;


public class AritmeticExceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Cen�rios relativo a excep���o aritm�tica (divis�o por zero)
		// NOTA: O texto da excep��o pode surgir, na consola, em local arbitr�rio!
		//       Normalmente � no final.
		int a = 3, b = 4, res;

		res = a / b;
		System.out.println(MessageFormat.format("{0} / {1} = {2}", a, b, res));
		
		a = 0;
		res = a / b;
		System.out.println(MessageFormat.format("{0} / {1} = {2}", a, b, res));

		a = 4;
		b = 0;
		res = a / b;	// Esta linha gera excep��o (ArithmeticException)!
		System.out.println(MessageFormat.format("{0} / {1} = {2}", a, b, res));
	}


}
