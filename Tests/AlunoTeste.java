/*import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlunoTeste {

	 @Test
	    void addSubjectShouldPutSubjectsInList() throws AlunoException {
	        Aluno alunoTeste = new Aluno("teste",2);
	        Disciplina disciplinaTeste = new Disciplina("Matematica","2","21:00");
	        alunoTeste.addSubject(disciplinaTeste);
	        assertEquals(alunoTeste.showSubjects(),"Matematica");
	    }

	    @Test
	    void showSheduleShouldDisplayCorrectTimes() throws AlunoException {
	        Aluno alunoTest = new Aluno("Tester",3);
	        Disciplina dc = new Disciplina("Geografia","2", "13:00");
	        Disciplina dc2 = new Disciplina("artes","3","14:00");

	        alunoTest.addSubject(dc);
	        alunoTest.addSubject(dc2);

	        assertEquals(alunoTest.showschedule(),"13:00,14:00");
	    }


	    @Test
	    void addSubjectShouldDisplayObjectsInList() throws AlunoException {
	        Aluno alunoTeste = new Aluno("teste",2);
	        Disciplina disciplinaTeste = new Disciplina("Computacao","2","21:00");
	        Disciplina disciplinaTeste2 = new Disciplina("Quimica" , "3" ,"23:00" );
	        alunoTeste.addSubject(disciplinaTeste);
	        alunoTeste.addSubject(disciplinaTeste2);
	        assertEquals(alunoTeste.showSubjects(),"Computacao,Quimica");
	    }


		@Test
		void testRepeatedSubject() throws  AlunoException{
			Aluno alunoTeste = new Aluno("teste",2);
			Disciplina disciplinaTeste = new Disciplina("Computacao","2","21:00");
			Disciplina disciplinaTeste2 = new Disciplina("Quimica" , "2" ,"23:00" );
			alunoTeste.addSubject(disciplinaTeste);


			AlunoException exception = Assertions.assertThrows(AlunoException.class,() -> {
				alunoTeste.addSubject(disciplinaTeste2);
			},"Sem erro detectado");
		}

}
*/