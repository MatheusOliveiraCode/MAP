import java.util.ArrayList;
import java.util.Arrays;

public class Professor {
    private String name;
    private int id;

    private ArrayList<Disciplina> subjects = new ArrayList<Disciplina>();

    public  Professor(String name, int id ){
        this.name = name;
        this.id = id;


    }

    public ArrayList<Disciplina> getSubjects() {
        return subjects;
    }

    public void addSubject(Disciplina subject){
        this.subjects.add(subject);
    }

    public void ShowSubjects(){
        System.out.print("\nProfessor: " + this.name + "| Horários ");
        for (int i = 0 ; i < subjects.size();i++){
            System.out.print(subjects.get(i).getName() +" ,");
        }
    }

    public void ShowSchedulle(){
        System.out.print("\nProfessor: " + this.name + "| Disciplinas: ");
        for (int i = 0 ; i < subjects.size();i++){
            System.out.print(subjects.get(i).getTime() +" ,");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
