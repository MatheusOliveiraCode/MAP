import java.util.ArrayList;

public class Aluno {
    private String name;
    private int register;

    private ArrayList<Disciplina> subjects = new ArrayList<Disciplina>();

    public Aluno(String name, int register) {
        this.name = name;
        this.register = register;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String showSubjects() {
        StringBuffer aux = new StringBuffer();
        for (int i=0 ; i < subjects.size(); i++){
            aux.append(subjects.get(i).getName() + " ");

        }
        return aux.toString();
    }


    public ArrayList<Disciplina> getSubjects(){
        return this.subjects;
    }

    public String showschedule() {
        StringBuffer aux = new StringBuffer();

        for (int i=0 ; i < subjects.size(); i++){
            aux.append(subjects.get(i).getTime() + " ");

        }
        return aux.toString();
    }


    public void addSubject(Disciplina subject){

        this.subjects.add(subject);

    }






}
