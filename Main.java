import java.nio.file.FileSystemAlreadyExistsException;

public class Main {


    public static void enroll(Disciplina dc, Aluno al){
        al.addSubject(dc);
        dc.addSudent(al);
    }
    public static void main(String[] args) {
         Professor teacher1 = new Professor("Carlos",1);
         Professor teacher2 = new Professor("Jose",2);

          Aluno aluno1= new Aluno("Maria",1);
          Aluno aluno2 = new Aluno("Joao",2);

         Disciplina geografia = new Disciplina("Geografia","3","16:00");
         Disciplina historia = new Disciplina("História","1","15:00");
         Disciplina geologia = new Disciplina("Geologia","2","14:00");
         Disciplina etica = new Disciplina("etica","4","13:00");

         enroll(geografia,aluno1);
         enroll(geologia, aluno2);


         teacher1.addSubject(geografia);
         teacher2.addSubject(historia);
         teacher1.addSubject(geologia);
         teacher2.addSubject(etica);



         //Questão a
        System.out.println("------a--------");
         teacher1.ShowSubjects();
         teacher2.ShowSubjects();

         //Questão b
        System.out.println("\n------b--------");
        teacher1.ShowSchedulle();
        teacher2.ShowSchedulle();

        //questao c
        System.out.println("\n------c--------");
        geologia.listStudents();

        System.out.println("\n------d--------");
        //questao d

        aluno1.showSubjects();

        //questao e
        System.out.println("\n------e--------");
        aluno1.showschedule();

        //questao f
        System.out.println("\n------f--------");
        System.out.println(geologia.countStudents());


    }




}
