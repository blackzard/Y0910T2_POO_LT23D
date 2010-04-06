package person.demo4;

/**
 * A demo4 introduz o modificador de acesso protected.
 * 
 * ver: http://java.sun.com/docs/books/tutorial/java/javaOO/accesscontrol.html
 * 
 * ------------------
 * MOTIVA��O
 * ------------------
 * At� agora, os m�todos setNumber, setName e setGender t�m acesso publico (modificador public).
 * 
 * Q: Ser� que faz sentido existirem?
 * R: Sim, permite evitar o acesso �s respectivas vari�veis de inst�ncia, 
 *         tornando poss�vel executar c�digo de verifica��o na escrita dos valores
 *         
 * Q: Faz sentido que todos tenham acesso a estes m�todos?
 * R: N�o, no caso particular, as pessoas n�o mudam de n�mero ou nome depois de criadas
 * 
 * Q: Devo colocar acesso privado (private)?
 * R: Sim, tipicamente faz-se isso, mas dessa forma APENAS o c�digo dessa classe 
 *         tem acesso ao m�todo, ou seja, as classes derivadas "perdem" acesso.
 * 
 * Q: Como "contornar" este "problema"?
 * R: Definido o acesso como PROTEGIDO (protected), de forma a que, al�m da pr�pria classe,
 *    as classes derivadas tamb�m tenham acesso, assim como no mesmo package,
 *    continuando a n�o ser poss�vel aceder ao m�todo do exterior da hierarquia 
 *    (tipo, derivados e mesmo package).
 *    
 * Q: Ent�o devo passar a usar protected em vez private?
 * R: Claro que n�o! Apenas quando fizer sentido, ou seja, quando n�o fizer sentido ser
 *    p�blico e quando se pretender dar acesso �s classes derivadas. Tipicamente � usado
 *    em m�todos utilit�rios definidos na classe base que ser�o usados nas derivadas.
 *    
 * Q: � tudo?
 * R: Sim :-)
 * 
 */
public class App {
	
	public static void main(String[] args) {

		Person pBart = new Student(123, "Bart Simpson", Gender.Male);
		Person pHomer = new Teacher(123, "Hommer Simpson", Gender.Male, 123456789);
		
		// Escrita do email do aluno e professor no standard-output
		System.out.println(pBart.getEmail());	
		System.out.println(pHomer.getEmail());
		
		// Reparem que, nesta vers�o (demo) � POSS�VEL usar os m�todos de setXXX
		// porque este c�digo **est� definido no mesmo package que Person**
		pBart.setNumber(999);
		System.out.println(pBart.getEmail());
		
	}

}
