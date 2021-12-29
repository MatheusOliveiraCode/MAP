import java.util.ArrayList;

public class Disciplina {
	
    private String name;
    private  String classID;
    private String time;
    private int  idProfessor;
    private ArrayList<Aluno> students = new ArrayList<Aluno>();

    public Disciplina(String name, String classID, int idProfessor, String time){
         this.name =  name ;
         this.classID =  classID;
         this.time = time;
         this.idProfessor = idProfessor;
    }
    
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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

    public void addStudent(Aluno aluno){
        this.students.add(aluno);
    }

    public String listStudents(){
        StringBuffer aux = new StringBuffer();
        for (int i = 0; i < students.size(); i++) {
               aux.append(students.get(i).getName());

            if(i != students.size()-1) aux.append(',');

        }
        return aux.toString();
    }
    
    public ArrayList<Aluno> getListStudents(){
    	return this.students;
    }

    public int countStudents(){
        return students.size();
    }


}