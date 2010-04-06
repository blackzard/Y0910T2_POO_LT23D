package person.demo4;

public class Student extends Person {

	public Student(int number, String name, Gender gender) 
	{
		super(number, name, gender);
	}
	
	// @Override � uma marca (anota��o JAVA) que indica que 
	//           este m�todo � a defini��o de um m�todo existente
	//           na classe base (e.g. m�todos abstractos)
	@Override
	public String getEmail() {
		// retornar email no formato <NUMALUNO>@alunos.isel.pt
		return String.format("%d@alunos.isel.pt", this.getNumber());
	}
	
}
