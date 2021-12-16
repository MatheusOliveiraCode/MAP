public class ControleAcademico {



    public void enroll (Aluno aluno , Disciplina disciplina){
        aluno.addSubject(disciplina);
        disciplina.addStudent(aluno);

    }

    public void hireTeatcher(Professor professor, Disciplina disciplina){
        professor.addSubject(disciplina);
        disciplina.setProfessor(professor);
    }
}
