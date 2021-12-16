import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProfessorTeste {

	  @Test
	    void addSubject() {
	        Professor pf = new Professor("Charles" , 2);
	        Disciplina dc = new Disciplina("Matematica","23","12:00");
	        pf.addSubject(dc);
	        assertEquals(pf.ShowSubjects(),"Matematica ");
	    }

	    @Test
	    void showSubjects() {
	        Professor pf = new Professor("Charles" , 2);
	        Disciplina dc = new Disciplina("Matematica","23","12:00");
	        Disciplina dc2 = new Disciplina("Fisica","34","21:00");
	        pf.addSubject(dc);
	        pf.addSubject(dc2);
	        assertEquals(pf.ShowSubjects(),"Matematica Fisica ");
	    }

	    @Test
	    void showSchedulle() {
	        Professor pf = new Professor("Charles" , 2);
	        Disciplina dc = new Disciplina("Quimica","2","16:00");
	        Disciplina dc2 = new Disciplina("Fisica","34","13:00");
	        pf.addSubject(dc);
	        pf.addSubject(dc2);
	        assertEquals(pf.ShowSchedulle(),"16:00 13:00 ");
	    }

}
