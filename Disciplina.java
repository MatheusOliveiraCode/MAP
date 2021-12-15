import java.util.ArrayList;

public class Disciplina {
    private String name;

    private  String classID;
    private String time;
    private ArrayList<Aluno> students = new ArrayList<Aluno>();


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Disciplina(String name, String classID, String time){

         this.name =  name ;
         this.classID =  classID;
         this.time = time;



    }


    public void addSudent(Aluno aluno){
        this.students.add(aluno);

    }

    public void listStudents(){
        System.out.println("ALunos Cursando " + this.name + ": ");
        for (int i = 0; i < students.size(); i++) {
               System.out.print(students.get(i).getName() +',');
        }
    }

    public int countStudents(){
        return students.size();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }
}
