import java.nio.file.FileSystemAlreadyExistsException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws AlunoException {

        //TODO


        ControleAcademico controleAcademico = new ControleAcademico();



        controleAcademico.hire("Sabrina",1,"MAP","1","SEG 14:00");
        controleAcademico.hire("Sabrina",1,"Algoritimos","2","SEG 16:00");
        controleAcademico.hire("jon",2,"IDK","3","SEG 16:00");


        System.out.println("Disciplinas mistradas por Sabrina: " +  controleAcademico.showTeacherSubject(1));


        //2
        System.out.println("Horários do professor Sabrina: " + controleAcademico.sheduleTrabalhador(1));


        //3 TODO

        


        //4
        controleAcademico.enrollStudent("Matheus",2);
        controleAcademico.putSubject(2,"2");
        controleAcademico.putSubject(2,"1");
        System.out.println("Disciplinas cursadas por Matheus: "+controleAcademico.getRdm(2).showSubjects());

        //5
        System.out.println("Horários de Matheus: "  + controleAcademico.getRdm(2).showschedule());

        //6 TODO


        
        
    }

}