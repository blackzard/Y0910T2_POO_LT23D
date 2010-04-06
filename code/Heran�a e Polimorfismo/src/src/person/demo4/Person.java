package person.demo4;

/**
 * Nesta classe foi alterado o acesso public para protected nos 
 * m�todos setGender, setName e setNumber.
 * 
 * Desta forma, apenas � poss�vel aceder a estes m�todos a partir 
 * desta classe, ou das classes derivadas.
 *                                                      
 */
public abstract class Person {
	
	private Gender gender;
	private String name;
	private int number;

	public Person(int number, String name, Gender gender) {
		setNumber(number);
		setName(name);
		setGender(gender);
	}

	protected void setGender(Gender g) { gender = g; }
	public Gender getGender() { return gender; }

	protected void setName(String n) { this.name = n; }
	public String getName() { return name; }
	
	protected void setNumber(int n) { this.number = n; }
	public int getNumber() { return this.number; }
	
	public String toString() {
		return String.format("%d: %s (%s)", getNumber(), getName(), getGender());
	}
	
	/**
	 * M�todo ABSTRACTO (a definir nas classes derivadas - n�o est�ticas) que
	 * retorna o email da pessoa de acordo com determinado crit�rio.
	 * 
	 * @return email da pessoa
	 */
	public abstract String getEmail(); 
		
}

