public class Principal{

    public static void main(String args[]){

        Aluno aluno1 = new Aluno("Rafael", 34,123436466437l,1001);
        System.out.println(aluno1.toString());

        Professor professor1 = new Professor("Rafael", 34,123436466437l,10);
        System.out.println(professor1.toString());

        Disciplina  disciplina = new  Disciplina("Web 2");
        

        disciplina.addAluno(aluno1);
        disciplina.addProfessor(professor1);
        System.out.println(disciplina.toString());

        
        

    }
}