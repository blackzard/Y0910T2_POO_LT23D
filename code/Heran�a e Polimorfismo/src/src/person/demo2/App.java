package person.demo2;

/**
 * Esta demo2 mostra uma utiliza��o de HERAN�A, com v�rios tipos derivados.
 * No caso, temos o tipo base Person e os tipos derivados Student e Teacher. 
 * 
 * � tamb�m apresentado o operador instanceof
 * 
 */
public class App {
	
	public static void main(String[] args) {

		Person pBart = new Student(123, "Bart Simpson", Gender.Male, "bart@gmail.com");
		Person pHomer = new Teacher(123, "Hommer Simpson", Gender.Male, 123456789);
		
		// Escrita do aluno e professor (string) no standard-output
		System.out.println(pBart.toString());
		System.out.println(pHomer.toString());
		
		// Mais uma vez, como bart e homer s�o vari�veis do tipo Person, e apesar
		// de referirem objectos do tipo Student e Teacher, respectivamente, n�o
		// � poss�vel usar os seus m�todos espec�ficos (getEmail e getNif) atrav�s
		// destas vari�veis (remover coment�rio do seguinte c�digo e ver o erro!).

		//System.out.println("Email: " + pBart.getEmail()); // ERRO. pBart � uma vari�vel do tipo Person e o m�todo getEmail apenas est� dispon�vel em Student!
		//System.out.println("Nif: "   + pHomer.getNif());  // ERRO. pHomer � uma vari�vel do tipo Person e o m�todo getNif apenas est� dispon�vel em Teacher!
		
		// Quando temos a certeza do tipo concreto associado a vari�veis de tipos base (no caso Person),
		// � poss�vel fazer uma convers�o EXPLICITA da refer�ncia para outro tipo
		Student sBart = (Student)pBart;
		Teacher tHomer = (Teacher)pHomer;
		System.out.println("Email: " + sBart.getEmail()); // OK :-)
		System.out.println("Nif: "   + tHomer.getNif());  // OK :-)
		
		// � gerado um erro de execu��o (excep��o ClassCastException) numa 
		// convers�o inv�lida (remover coment�rio seguinte)
		//Student sBartBum = (Student)pHomer;
		
		// � poss�vel usar o operador instanceof (var instanceof TYPE) 
		// para determinar se determinada vari�vel (var) �  
		// compat�vel ("afect�vel") com determinado tipo (TYPE).
		boolean pBartIsPerson  = pBart instanceof Person;
		boolean pBartIsStudent = pBart instanceof Student;
		boolean pBartIsTeacher = pBart instanceof Teacher;
		System.out.println("pBartIsPerson = "  + pBartIsPerson);	// true
		System.out.println("pBartIsStudent = " + pBartIsStudent);	// true
		System.out.println("pBartIsTeacher = " + pBartIsTeacher);	// false (naturalmente)
		
		// Como coloc�mos a classe Person como ABSTRACTA (abstract), 
		// deixou de ser poss�vel criar inst�ncias dela.
		//   -> � um conceito abstracto, logo n�o se pode contretizar (criar inst�ncia).
		//   -> At� faz sentido :-)
		//Person dummyPerson = new Person(1, "Dummy Foo Bar", Gender.Male);
		//System.out.println(dummyPerson);
	}

}
