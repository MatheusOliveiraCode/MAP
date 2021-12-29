import java.util.ArrayList;
import java.util.Objects;

public class ControleAcademico {


    private ArrayList<RDM> rdmsCadastrados = new ArrayList<RDM>();
    private ArrayList<CadastroProfissional> cadastros = new ArrayList<CadastroProfissional>();
    private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();



    public void enrollStudent(String nome,int register) throws AlunoException {

        RDM rdm = new RDM(nome,register);
        this.rdmsCadastrados.add(rdm);
    }

    public void putSubject(int idAluno,String idDisciplina){
        for (int i = 0; i < rdmsCadastrados.size() ; i++) {
            if (rdmsCadastrados.get(i).getRdmCode() == idAluno){
                rdmsCadastrados.get(i).addSubject(this.getDisciplina(idDisciplina));
            }
        }

    }

    public void hire(String nome, int id,String nomeDisiplina,String idDisciplina, String tempo){

        Disciplina disciplina = new Disciplina(nomeDisiplina,idDisciplina,id,tempo);
        this.disciplina.add(disciplina);


        CadastroProfissional cpr = new CadastroProfissional(nome,id,disciplina);
        cadastros.add(cpr);

    }

    public String showTeacherSubject(int id){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < cadastros.size() ; i++) {
            if (cadastros.get(i).professor.getId() == id){
                str.append(cadastros.get(i).showSubjects()).append(" ,");
            }
        }
        return str.toString();
    }


    public String sheduleTrabalhador(int id){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < cadastros.size() ; i++) {
            if (cadastros.get(i).professor.getId() == id){
                str.append(cadastros.get(i).getShedule()).append(" ,");
            }
        }
    return str.toString();
    }




    public Disciplina getDisciplina (String id){
        for (int i = 0; i < disciplina.size() ; i++) {
            if (Objects.equals(disciplina.get(i).getClassID(), id)){
                return disciplina.get(i);
            }
        }
        return null;
    }

    public RDM getRdm(int rdmCode){
        for (int i = 0; i < rdmsCadastrados.size() ; i++) {
            if(rdmsCadastrados.get(i).getRdmCode() == rdmCode){
                return rdmsCadastrados.get(i);
            }
        }
        return null;
    }
}
