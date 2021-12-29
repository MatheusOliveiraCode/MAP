import java.util.ArrayList;

public class RDM {
    private Aluno aluno;
    private ArrayList<Disciplina> subjects = new ArrayList<Disciplina>();
    private int rdmCode;

    public RDM(String nomeAluno, int register) throws AlunoException {
        this.aluno = new Aluno(nomeAluno,register);
        this.rdmCode = aluno.getRegister();

    }

    public void addSubject(Disciplina disciplina){
        subjects.add(disciplina);
    }


    public String showSubjects() {
        StringBuilder aux = new StringBuilder();
        for (int i=0 ; i < subjects.size(); i++){
            aux.append(subjects.get(i).getName() );

            if(i != subjects.size()-1) aux.append(',');
        }
        return aux.toString();
    }

    public int getRdmCode() {
        return rdmCode;
    }

    public String showschedule() {
        StringBuffer aux = new StringBuffer();

        for (int i=0 ; i < subjects.size(); i++){
            aux.append(subjects.get(i).getTime());

            if(i != subjects.size()-1) aux.append(',');

        }
        return aux.toString();
    }
}
