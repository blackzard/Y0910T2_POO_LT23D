package person.demo2;

public class Student extends Person {

	private String email;
	
	public Student(int number, String name, Gender gender, String email) 
	{
		// Chamada ao construtor da classe base (super)
		//  - TEM que ser o primeiro m�todo a executar num construtor
		//  - Se n�o existir uma chamada explicita a este m�todo, 
		//    o compilador coloca uma chamada ao construtor por 
		//    omiss�o (e.g: super()). Note-se que se este construtor
		//    n�o estiver definido na classe base (neste caso Person),
		//    � gerado erro de compila��o.
		super(number, name, gender);
		
		this.email = email;
	}
	
	// M�todo adicional de alunos (obter um email)
	public String getEmail() {
		return this.email;
	}
	
}
