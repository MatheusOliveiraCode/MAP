import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DisciplinaTeste {

	@Test
    void getTime() {
        Disciplina dc = new Disciplina("programacao","2" , "Seg 13:00");
        assertEquals(dc.getTime(),"Seg 13:00");
    }

    @Test
    void addSudent() {
        Disciplina dc = new Disciplina("programacao","2" , "Seg 13:00");
        Aluno aluno = new Aluno("Jao",2);
        dc.addStudent(aluno);
        assertEquals(dc.listStudents(),"Jao ");
    }

    @Test
    void listStudents() {
    	
    }

    @Test
    void countStudents(){
        Disciplina dc = new Disciplina("Programacao", "3", "Qui 14:00");
        Aluno aluno = new Aluno("Jao",2);
        Aluno aluno2 = new Aluno("Maria",3);
        Aluno aluno3 = new Aluno("Matheus",4);

        dc.addStudent(aluno);
        dc.addStudent(aluno2);
        dc.addStudent(aluno3);

        assertEquals(3,dc.countStudents());
    }

}
