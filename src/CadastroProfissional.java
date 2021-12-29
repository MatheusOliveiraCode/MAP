import java.util.ArrayList;

public class CadastroProfissional {

    Professor professor;
    private ArrayList<Disciplina> subjects = new ArrayList<Disciplina>();

    public CadastroProfissional(String nome,int id,Disciplina dc){
        this.professor= new Professor(nome,id);
        subjects.add(dc);

    }



    public String showSubjects() {
        StringBuilder aux = new StringBuilder();
        for (int i = 0; i < subjects.size(); i++) {
            aux.append(subjects.get(i).getName());

            if (i != subjects.size() - 1) aux.append(',');
        }
        return aux.toString();
    }

    public String getShedule(){

        StringBuilder aux = new StringBuilder();

        for (int i = 0; i < subjects.size(); i++) {
            aux.append(subjects.get(i).getTime());

            if (i != subjects.size() - 1) aux.append(',');
        }
        return aux.toString();
    }

}
