package person.demo3;

/**
 * NOTA: a palavra reservada => abstract <= NO M�TODO getEmail, 
 *       indica que o m�todo TEM que SER DEFINIDO NA CLASSE 
 *       DERIVADA (a n�o ser que tamb�m seja abtracta - faz sentido!)
 *                                                      
 * NOTA: As classes com m�todos abstractos T�M QUE SER abstractas
 *        -> Tamb�m me parece que faz sentido.
 *        -> Pensem o que seria criar uma inst�ncia e depois chamar o m�todo em causa!!!
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

	public void setGender(Gender g) { gender = g; }
	public Gender getGender() { return gender; }

	public void setName(String n) { this.name = n; }
	public String getName() { return name; }
	
	public void setNumber(int n) { this.number = n; }
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

