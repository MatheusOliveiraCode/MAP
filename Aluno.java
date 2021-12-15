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

    public void showSubjects() {
        for (int i=0 ; i < subjects.size(); i++){
            System.out.print(subjects.get(i).getName() + " ");

        }
    }


    public ArrayList<Disciplina> getSubjects(){
        return this.subjects;
    }
    public void showschedule() {
        for (int i=0 ; i < subjects.size(); i++){
            System.out.print(subjects.get(i).getTime() + " ");

        }

    }


    public void addSubject(Disciplina subject){

        this.subjects.add(subject);

    }






}
