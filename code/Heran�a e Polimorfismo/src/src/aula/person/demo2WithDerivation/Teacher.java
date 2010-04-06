package aula.person.demo2WithDerivation;

public class Teacher extends Person {

	//private Person person;
	private int nif;
	
	public Teacher(int number, String name, Gender gender, int nif) 
	{
		//this.person = new Person(number, name, gender);
		super(number, name, gender);	// chamada ao construtor da classe base
		this.nif = nif;
	}
	
	// M�todo adicional de professores (obter o nif)
	public int getNif() {
		return this.nif;
	}
	
	/*
	 * Adicionar e remover coment�rio para ver o efeito da chamada
	 * polim�rfica a bart em App.main()  
	 */ 
	public String toString() {
		// super.toString() serve para chamar EXPLICITAMENTE 
		//  o m�todo toString da classe base (Person)
		return String.format("%s - %s", super.toString(), getNif());
	}
	/* */
}
