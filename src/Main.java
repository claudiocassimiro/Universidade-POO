public class Main {
    public static void main(String[] args) {
        Universidade universidade = new Universidade();

        Aluno aluno1 = new Aluno("Gery", 1, new String[]{"induction"});
        Aluno aluno2 = new Aluno("Luis", 2, new String[]{"maths", "science"});
        Aluno aluno3 = new Aluno("Raul", 2, new String[]{"science", "database I"});
        Aluno aluno4 = new Aluno("Liz", 1, new String[]{"maths"});

        universidade.addAluno(aluno1);
        universidade.addAluno(aluno2);
        universidade.addAluno(aluno3);
        universidade.addAluno(aluno4);

        universidade.atribuirCurso(3, "DataBase I");
        universidade.promoverNota(0, 2);

        System.out.println("Alunos no curso 'science': " + universidade.filter("science"));
        System.out.println("Alunos no curso 'Math': " + universidade.filter("maths"));

        System.out.println("Lista de todos os alunos:");
        universidade.listarAlunos();
    }
}