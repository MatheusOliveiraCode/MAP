import java.util.ArrayList;

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

    public String ShowSubjects(){
        StringBuffer aux = new StringBuffer();

        for (int i = 0 ; i < subjects.size();i++){
            aux.append(subjects.get(i).getName() +" ");
        }
        return aux.toString();
    }

    public String  ShowSchedulle(){
        StringBuffer aux = new StringBuffer();
        for (int i = 0 ; i < subjects.size();i++){
            aux.append(subjects.get(i).getTime() +" ");
        }

        return aux.toString();
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