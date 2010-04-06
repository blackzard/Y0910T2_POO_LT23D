package aula.person.demo2WithDerivation;

/**
 * Esta demo usa DERIVA��O para relacionar Pessoa e Aluno/Professor.
 * 
 */
public class App {
	
	public static void main(String[] args) {
		
		Student bart = new Student(123, "Bart Simpson", Gender.Male, "bart@acme.org");
		// Mostrar o email do bart (usar m�todo de Student)
		System.out.println(bart.getEmail());
		
		// Como estamos a usar deriva��o, � poss�vel guardar 
		// refer�ncias para alunos (Student) em vari�veis do
		// tipo Person.
		Person pBart = new Student(123, "Bart Simpson", Gender.Male, "bart@acme.org");
		System.out.println(pBart);	// uso do polimorfismo (m�todo toString de Object)

		Teacher lisa = new Teacher(321, "Lisa Simpson", Gender.Female, 987654321);
		// Mostrar o nif da lisa (usar m�todo de Teacher)
		System.out.println(lisa.getNif());
		System.out.println(lisa);
		
	}

}
