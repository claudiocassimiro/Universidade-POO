import java.util.ArrayList;
import java.util.List;

class Aluno {
    private String nome;
    private int nota;
    private List<String> cursos;

    public Aluno(String nome, int nota, String[] cursos) {
        this.nome = nome;
        this.nota = nota;
        this.cursos = new ArrayList<>();
        for (String curso : cursos) {
            this.cursos.add(curso);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public List<String> getCursos() {
        return cursos;
    }

    public void addCurso(String curso) {
        this.cursos.add(curso);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Nota: " + nota + ", Curso: " + String.join(", ", cursos);
    }
}