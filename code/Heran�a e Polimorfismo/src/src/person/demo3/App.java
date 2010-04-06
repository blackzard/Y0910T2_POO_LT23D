package person.demo3;

/**
 * A demo3 apresenta o conceito de POLIMORFISMO.
 * 
 *  ver: http://www.priberam.pt/dlpo/default.aspx?pal=polimorfismo
 *  
 *    "POLIMORFISMO -> O mesmo que polimorfia. -> Particularidade de certas subst�ncias que tomam formas muito diversas."
 * 
 * A ideia principal do polimorfismo � ser poss�vel executar c�digo diferente
 *  de acordo com o tipo concreto associado a determinada vari�vel. 
 *
 * Por exemplo:
 * ------------------
 * Ter uma vari�vel do tipo Person (que ser� do tipo concreto Student ou  
 *   Teacher - mas "s� sabemos que � uma Pessoa"), e ao executar determinado 
 *   m�todo, o c�digo executado ser dependente do tipo concreto, ou seja,
 *   ser executado o c�digo definido em Student ou Teacher de acordo com 
 *   o tipo contreto da vari�vel.
 *   
 *   
 *   
 * ------------------
 * NOTA
 * ------------------
 * Nesta demo, vamos mudar um pouco a l�gica dos tipos existentes.
 *   1) At� agora, s� o Student tinha um email, e podia ser definido no construtor. 
 *   2) Agora, vamos admitir que todas as pessoas t�m um email, e � da responsabilidade
 *      das classes derivadas gerar o email a partir do seu tipo e dados existentes.
 *   3) Nos alunos, o email segue o formato <NUMALUNO>@alunos.isel.pt
 *   4) Nos docentes, o email segue o formato <NUMDOCENTE>@docentes.isel.pt  
 * 
 */
public class App {
	
	public static void main(String[] args) {

		Person pBart = new Student(123, "Bart Simpson", Gender.Male);
		Person pHomer = new Teacher(123, "Hommer Simpson", Gender.Male, 123456789);
		
		// Escrita do email do aluno e professor no standard-output
		System.out.println(pBart.getEmail());	
		System.out.println(pHomer.getEmail());
		
		// Reparem que, no c�digo anterior, � executado o m�todo getEmail relativo
		// ao tipo concreto Student e Teacher, respectivamente.
	}

}
