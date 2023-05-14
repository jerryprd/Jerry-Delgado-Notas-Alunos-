import java.util.*;

// Classe Disciplina
public class Disciplina {
    String titulo;
    String docente;
    List<Aluno> alunos;
    
    public Disciplina(String titulo, String docente, List<Aluno> alunos) {
        this.titulo = titulo;
        this.docente = docente;
        this.alunos = alunos;
    }
    
    // Método que mostra o aluno com a melhor nota (média dos módulos)
    public Aluno getAlunoComMelhorNota() {
        Aluno melhorAluno = null;
        double melhorMedia = 0;
        for (Aluno aluno : alunos) {
            double media = aluno.calcularMedia();
            if (media > melhorMedia) {
                melhorAluno = aluno;
                melhorMedia = media;
            }
        }
        return melhorAluno;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDocente() {
        return docente;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
