import java.util.ArrayList;
import java.util.List;

class Universidade {
    private List<Aluno> alunos;

    public Universidade() {
        this.alunos = new ArrayList<>();
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void atribuirCurso(int index, String curso) {
        if (index >= 0 && index < alunos.size()) {
            alunos.get(index).addCurso(curso);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void promoverNota(int index, int novaNota) {
        if (index >= 0 && index < alunos.size()) {
            alunos.get(index).setNota(novaNota);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public List<String> filter(String curso) {
        List<String> alunosDoCurso = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.getCursos().contains(curso)) {
                alunosDoCurso.add(aluno.getNome());
            }
        }
        return alunosDoCurso;
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}