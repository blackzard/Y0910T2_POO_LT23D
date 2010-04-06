package person.demo1;

/**
 * Esta demo1 mostra uma utiliza��o simples da defini��o de tipos 
 * Nesta demo est� definido o tipo base pessoa [Person]
 * e o tipo derivado [Student] que representa um aluno. 
 * 
 */
public class App {
	
	public static void main(String[] args) {

		Student bart = new Student(123, "Bart Simpson", Gender.Male, "bart@gmail.com");
		
		// Escrita do aluno (string) no standard-output
		System.out.println(bart.toString());
		System.out.println(bart.getEmail());
		
		// Como os alunos tamb�m s�o pessoas, � poss�vel guardar uma refer�ncia
		// para o objecto referido pela vari�vel bart (do tipo concreto Student)
		// numa vari�vel do tipo Person.
		Person person = bart;
		
		// Atrav�s da vari�vel person APENAS � poss�vel utilizar 
		// "funcionalidades" (m�todos) de Person.
		//   -> Pode-se pensar que se est� a usar o Student atrav�s de um filtro
		//      que "apenas deixar passar" chamadas a m�todos definidos em Person
		System.out.println("N�mero: " + person.getNumber());
		
		// Devido � explica��o anterior, � ERRADO aceder ao m�todo getEmail a partir
		// de vari�veis do tipo Person, mesmo que o tipo concreto do objecto referido
		// seja do tipo Student (para o qual est� definido o m�todo getEmail)
		System.out.println("Email: " + bart.getEmail());     // OK.   bart � uma vari�vel do tipo Student
		//System.out.println("Email: " + person.getEmail()); // ERRO. person � uma vari�vel do tipo Person
		
		// NOTA: Para ajudar a perceber a explica��o anterior, imaginem que tinham outro
		//       tipo a derivar de Person (ex: Teacher). Tendo uma refer�ncia para Person,
		//       como � que o compilador sabe se o tipo concreto � um Student ou Teacher?
		// 
		// Na demo2 aborda-se novamente este aspecto.
		
		// � poss�vel guardar directamente uma refer�ncia para um objecto do tipo Student
		// numa vari�vel de um tipo mais abrangente (no caso, Person).
		Person lisa = new Student(234, "Lisa Simpson", Gender.Female, "lisa@gmail.com");
		System.out.println(lisa);
		
		// Nesta demo � ainda poss�vel criar directamente objectos do tipo Person, 
		// apesar de n�o fazer sentido! Na pr�xima demo mostra-se como evitar este 
		// comportamento.
		Person dummyPerson = new Person(1, "Dummy Foo Bar", Gender.Male);
		System.out.println(dummyPerson);
		
	}

}
