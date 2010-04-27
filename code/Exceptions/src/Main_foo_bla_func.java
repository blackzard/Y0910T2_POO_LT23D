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
public class Main_foo_bla_func {

	public static void main(String[] args) {
		System.out.println("main: in�cio.");

		foo();

		System.out.println("main: fim.");
	}
	
	public static void foo() {
		System.out.println("  foo: in�cio.");
		
		bla(7, 5);
		//bla(1, 2);
		bla(-2, 2);  // Remover o coment�rio para ver a excep��o ser gerada e o programa terminar
		
		System.out.println("  foo: fim.");
	}
	
	
	public static void bla(int x, int y) {
		
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
	
	public static int func(int a, int b) {
		
		System.out.println("       func: in�cio.");
		System.out.println("        a = " + a + " b = " + b);
		
		int x = a / b;	// VAI GERAR Excep��o quando b for ZERO
		
		System.out.println("       func: fim.");
		
		return x;
	}


}
