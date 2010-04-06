package person.demo3;

public class Teacher extends Person {

	private int nif;

	public Teacher(int number, String name, Gender gender, int nif) {
		super(number, name, gender);
		this.setNif(nif);
	}

	public void setNif(int nif) { this.nif = nif; }
	public int getNif() { return nif; 	}
	
	// @Override � uma marca (anota��o JAVA) que indica que 
	//           este m�todo � a defini��o de um m�todo existente
	//           na classe base (e.g. m�todos abstractos)
	@Override
	public String getEmail() {
		// retornar email no formato <NUMDOCENTE>@docentes.isel.pt
		return String.format("%d@docentes.isel.pt", this.getNumber());
	}

}
