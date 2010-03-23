
public class Aula07e08 {

	public static void main(String[] args) 
	{
		showEvenDigits(1234567890); System.out.println();
		int gd = greaterDigit(1281238237); checkValue(8, gd);
		int ed = evenDigits(1234567890);   checkValue(5, ed);
		int cw = countWords("sou uma frase com uma ou mais palavras com a palavra uma", "uma"); checkValue(3, cw);
		int no = numberOfOccurrences(new int[] {4,5,3,4,6,5,6,7,8,7,5}, 5); checkValue(3, no);
	}

	/**
	 * Apresenta os d�gitos pares do n�mero number na consola
	 */
	public static void showEvenDigits(int number) 
	{
		if(number < 10 ) { 
			if(number % 2 == 0) System.out.print(number); 
			return; 
		}
		showEvenDigits(number / 10);   // exprimentem trocar estas duas linhas 
		showEvenDigits(number % 10);   // e vejam o resultado obtido. 
		
		/* 
		 * Esta � outra forma de implementar este exerc�cio.
		 * 
		if(number >= 10) showEvenDigits(number / 10);
		int d = number % 10;
		if(d % 2 == 0) System.out.print(d);
		*/
	}

	/**
	 * Retorna o maior d�gito do n�mero number
	 */
	public static int greaterDigit(int number) 
	{
		if(number < 10) return number;
		int d = number % 10;
		int max = Math.max(d, greaterDigit(number / 10));
		return max;
	}

	/**
	 * Retorna o n�mero d�gitos pares de number
	 */
	public static int evenDigits(int number) 
	{
		// Facto: Sei o que fazer quando o n�mero � apenas um d�gito 
		//  -> 1 caso seja par, 0 caso contr�rio 
		if(number < 10) return number % 2 == 0 ? 1 : 0;

		// soma do n�mero de d�gitos pares presentes no d�gito das unidades (n%10),
		// com o n�mero de d�gitos presentes no resto dos digitos (n/10).
		return evenDigits(number % 10) + evenDigits(number / 10);	 
	}

	/**
	 * Retorna o n�mero de ocorr�ncias de word em phrase
	 * @param phrase 
	 * 	 Conjunto de caracteres que forma uma frase. 
	 *   N�o tem necessariamente que cumprir as regras do portugu�s :-)
	 * @param word
	 * 	 Palavra a procurar. Deve ser ententido como um conjunto de 
	 *   caracteres de pesquisa, n�o tendo que ser uma "palavra" do portugu�s.
	 *   Em particular, pode estar dentro de outra palavra.
	 */
	public static int countWords(String phrase, String word) 
	{
		int idx = phrase.indexOf(word);
		if(idx == -1) return 0;
		return 1 + countWords(phrase.substring(idx + word.length()), word);
	}

	/**
	 * Retorna o n�mero de ocorr�ncias de ref no array vals
	 * Este m�todo utiliza um m�todo auxiliar que indica a partir 
	 *  de que ponto � que se devem considerar valores no array vals.  
	 */
	public static int numberOfOccurrences(int[] vals, int ref) 
	{
		return numberOfOccurrences(vals, ref, 0);
	}
	
	private static int numberOfOccurrences(int[] vals, int ref, int i) {
		int val = vals[i];
		int counter = val == ref ? 1 : 0;
		if(i == vals.length - 1) return counter;
		return counter + numberOfOccurrences(vals, ref, i + 1);
	}


	/**
	 * M�todo auxiliar que ajuda a perceber se o valor que 
	 * estamos � espera (expected) � igual ao valor passado 
	 * como segundo par�metro (value)
	 */
	private static void checkValue(int expected, int value) 
	{
		System.out.println(expected + " == " + value + " ?");
	}

}
