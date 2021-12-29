import java.util.ArrayList;

public class Aluno {
	
    private String name;
    private int register;



    public Aluno(String name, int register) throws AlunoException {
        this.name = name;
        this.register = register;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegister() {
        return register;
    }

    public void setRegister(int register) {
        this.register = register;
    }








}
