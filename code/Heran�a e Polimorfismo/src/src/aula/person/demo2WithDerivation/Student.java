package aula.person.demo2WithDerivation;

public class Student extends Person {

	//private Person person;
	private String email;
	
	public Student(int number, String name, Gender gender, String email) 
	{
		//this.person = new Person(number, name, gender);
		super(number, name, gender);	// chamada ao construtor da classe base
		this.email = email;
	}
	
	// M�todo adicional de alunos (obter um email)
	public String getEmail() {
		return this.email;
	}

	/*
	 * Adicionar e remover coment�rio para ver o efeito da chamada
	 * polim�rfica a bart em App.main()  
	 * 
	public String toString() {
		// super.toString() serve para chamar EXPLICITAMENTE 
		//  o m�todo toString da classe base (Person)
		return String.format("%s - %s", super.toString(), getEmail());
	}
	*/
	
}
