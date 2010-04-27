import java.text.MessageFormat;


public class SystemExceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Apresenta��o de v�rios cen�rios relativos a excep��es geradas por tipos "built-in" do java
		// Para que os exemplos funcionem correctamente, apenas um dos m�todos deve estar sem coment�rio.
		
		//showArrayException();
		//capturedArrayException();
		capturedStringException();
	}


	/**
	 * Exemplo que mostra os efeitos da gera��o de excep��o no acesso a um �ndice inv�lido do array
	 * 
	 */
	private static void showArrayException()
	{
		int[] data = { 3, 5, 4, 7, 9 };
		
		// a) Acesso a um �ndice v�lido do array n�o gera erro
		int validIndex = 2;
		int validIndexValue = data[validIndex];
		System.out.println("O valor " + validIndexValue + " est� no �ndice " + validIndex + " do array data.");
		
		// b) Acesso a um �ndice inv�lido do array GERA ERRO! (excep��o)
		int invalidIndex = 12;
		// A PR�XIMA INSTRU��O, de indexa��o, GERA EXCEP��O (java.lang.ArrayIndexOutOfBoundsException)
		int invalidIndexValue = data[invalidIndex];	
		System.out.println("O valor " + invalidIndexValue + " est� no �ndice " + invalidIndex + " do array data.");
	}
	
	/**
	 * Exemplo que mostra a CAPTURA de excep��o no acesso a um �ndice inv�lido do array
	 */
	private static void capturedArrayException() 
	{
		int[] data = { 3, 5, 4, 7, 9 };
		
		// O bloco try-catch permite a captura de excep��es geradas no seu corpo (no exemplo, a excep��o ArrayIndexOutOfBoundsException)
		try 
		{
			int index = 123;	// Exprimente colocar aqui diferentes valores. < 5 e >= 5
			int value = data[index];
			System.out.println(MessageFormat.format("O valor {0} est� no �ndice {1} do array data.", value, index));
		}
		catch(ArrayIndexOutOfBoundsException exp) {
			// Este block captura TODAS as excep��es do tipo ArrayIndexOutOfBoundsException geradas
			//   dentro do try-catch anterior. Depois de executar o c�digo do "catch", a execu��o do 
			//   m�todo capturedArrayException continua.
			System.out.println("Ups! Ocorreu excep��o.");
			System.out.println(MessageFormat.format("A excep��o tem a mensagem: {0}", exp.getMessage()));
			System.out.println("A excep��o tem a seguinte descri��o t�cnica:");
			exp.printStackTrace(System.out);
			
			// Se, no bloco try-catch for gerada uma excep��o de outro tipo, funciona como no exemplo 
			//  anterior (showArrayException). 
		}
		
		System.out.println("NOTA: reparem que, como foi usado o bloco try-catch, estas ");
		System.out.println("      instru��es s�o executadas, logo aparece este texto na consola.");
		
	}
	
	/**
	 * Exemplo com string 
	 */
	private static void capturedStringException() {

		String text = "Sou uma string com dimens�o 30";
		System.out.println(MessageFormat.format("Dimens�o da string: {0}", text.length()));
		
		try 
		{
			showCharAt(text, 20);
			
			//String s = null;
			//int x = s.length();
			
			showCharAt(text, 40);
			
		
		} 
		catch(StringIndexOutOfBoundsException strExp) 
		{
			System.out.println("StringIndexOutOfBoundsException catch code!");
		}
		catch(ArrayIndexOutOfBoundsException strExp) 
		{
			// Esta excep��o nunca � gerada!! 
			System.out.println("ArrayIndexOutOfBoundsException catch code!");
		}
		finally 
		{ 
			System.out.println("finally code!");
		}
		

		System.out.println("end");
			
	}


	private static void showCharAt(String text, int index) 
	{
		char c = text.charAt(index);
		System.out.println(MessageFormat.format("O char {0} est� no �ndice {1} da string text.", c, index));
	}
}
