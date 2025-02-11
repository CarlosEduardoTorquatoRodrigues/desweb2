import java.util.List;

public class Disciplina {
    private String nomeDisciplina;
    private List<Aluno> alunos;
    private List<Professor> professores;

    public Disciplina(){
        this("", new ArrayList<Aluno>(), new ArrayList<Professor>());
    }
    public Disciplina(String nomeDisciplina){

    }

    public Disciplina(String nomeDisciplina, List<Aluno> alunos, List<Professor> professores){

    }
}