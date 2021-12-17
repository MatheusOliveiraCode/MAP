import java.nio.file.FileSystemAlreadyExistsException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Instanciando os nossos obejtos de classes
        ControleAcademico ca = new ControleAcademico();


         Professor teacher1 = new Professor("Carlos",1);
         Professor teacher2 = new Professor("Jose",2);

         Aluno aluno1= new Aluno("Maria",1);
         Aluno aluno2 = new Aluno("Joao",2);

         Disciplina geografia = new Disciplina("Geografia","3","SEG 16:00");
         Disciplina historia = new Disciplina("História","1","QUA 15:00");
         Disciplina geologia = new Disciplina("Geologia","2","QUI 14:00");
         Disciplina etica = new Disciplina("etica","4","TER 13:00");


         //Cadastrando alunos e professores no sistema
         ca.enroll(aluno1,geografia);
         ca.enroll(aluno2,geologia);
         ca.enroll(aluno1,geologia);

         ca.hireTeatcher(teacher1,geografia);
         ca.hireTeatcher(teacher1,geologia);
         ca.hireTeatcher(teacher2,etica);
         ca.hireTeatcher(teacher2,historia);


         
         //Respondendo as questões da atividade
         
         //Questão a
        System.out.println("\nA) Quais disciplinas um professor está ministrando");
        System.out.println("disciplinas que o professor 1 esta ministrando: " + teacher1.ShowSubjects());
        System.out.println("disciplinas que o professor 2 esta ministrando: " + teacher2.ShowSubjects());
        
         //Questão b

        System.out.println("\nB) Qual o horário de um professor");
        System.out.print("horarios que o professor 1 um possui: " + teacher1.ShowSchedulle());
        System.out.print("\n horarios que o professor 2 um possui: " + teacher2.ShowSchedulle());
        System.out.println();

         //questao c

        System.out.println("\nC) Quais os alunos de uma dada disciplina");
        System.out.print("alunos matriculados na disciplina de geologia: " + geologia.listStudents());
        System.out.println();
        

        
      //questao d

        System.out.println("\nD) Quais as disciplinas de um aluno");
        System.out.print("disciplinas em que o aluno 1 esta matriculado: " + aluno1.showSubjects());
        System.out.println();
        
        //questao e

        System.out.println("\nE) Qual o horário de um aluno");
        System.out.print("horarios em que o aluno 1 esta matriculado: " + aluno1.showschedule());
        System.out.println();
        
        //questao f
        
        System.out.println("\nF) Qual o número de alunos de uma disciplina.");
        System.out.println("quantidade de alunos na disciplina de geologia: " + geologia.countStudents());
        
        
        
    }

}