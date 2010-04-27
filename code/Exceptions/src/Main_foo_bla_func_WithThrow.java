import java.text.MessageFormat;

/**
 * Este exemplo mostra que as excep��es, que n�o s�o capturadas,  
 * provocam o fim da execu��o da aplica��o.
 * 
 * No exemplo, o main executa a fun��o foo que por sua vez executa
 * a fun��o bla, que executa a fun��o func que gera excep��o. � poss�vel
 * verificar que o c�digo que se encontra AP�S as chamadas �s 
 * fun��es indicadas, n�o � executado.
 *
 */
public class Main_foo_bla_func_WithThrow {

	public static void main(String[] args) {
		System.out.println("main: in�cio.");

		foo();

		System.out.println("main: fim.");
	}
	
	public static void foo() {
		System.out.println("  foo: in�cio.");
		
		try {
		
			bla(7, 5);
			//bla(1, 2);
			bla(-2, 2);  // Remover o coment�rio para ver a excep��o ser gerada e o programa terminar
		
		} 
		catch(Exception e) {
			System.out.println("Ups! Ocorreu excep��o.");
			System.out.println("Mensagem: " + e.getMessage());
			System.out.println("Cause type: " + e.getCause().getClass().toString());
			System.out.println("Cause message: " + e.getCause().getMessage());
			
		}
		
		System.out.println("  foo: fim.");
	}
	
	
	public static void bla(int x, int y) throws Exception {
		
		System.out.println();
		System.out.println("    bla: in�cio.");
		System.out.println("     x = " + x + " y = " + y);
		int res;
		if(x > y) {
			res = func(6, x - y);
		} else {
			res = func(6, x + y);
		}
		System.out.println("     res = " + res);
		
		System.out.println("    bla: fim.");
		System.out.println();
		
	}
	
	public static int func(int a, int b) throws Exception {
		
		System.out.println("       func: in�cio.");
		System.out.println("        a = " + a + " b = " + b);
		
		try 
		{
			int x = a / b;	// VAI GERAR Excep��o quando b for ZERO
			return x;
		}
		catch(ArithmeticException ae) 
		{
			System.out.println("Cuidado! O divisor � ZERO!");
			
			//throw new UnsupportedOperationException("Erro na divis�o de a e b", ae);
			throw new Exception("Erro na divis�o de a por b", ae);
		}
		finally
		{ 
			System.out.println("       func: fim.");
		}
		
	}


}
