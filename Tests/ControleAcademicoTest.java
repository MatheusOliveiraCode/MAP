import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControleAcademicoTest {

    @Test
    void enroll() {
        Aluno aluno = new Aluno("maria",1);
        Disciplina dc = new Disciplina("matematica","253B","QUA 15:00");
        ControleAcademico ca = new ControleAcademico();

        ca.enroll(aluno,dc);

        assertEquals(aluno.showSubjects(),"matematica ");
        assertEquals(dc.listStudents(), "maria ");
    }

    @Test
    void hireTeatcher() {
        Professor pf = new Professor("Jon",5);
        Disciplina dc = new Disciplina("Fisica","223A","QUI 13:00");
        ControleAcademico ca = new ControleAcademico();

        ca.hireTeatcher(pf,dc);

        assertEquals(pf.ShowSubjects(), "Fisica ");
        assertEquals(dc.getProfessor().getName(), "Jon");
    }
}