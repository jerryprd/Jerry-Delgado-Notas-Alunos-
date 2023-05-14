import java.util.*;

// Classe Aluno
class Aluno {
    String nome;
    List<Integer> notas;
    
    public Aluno(String nome, List<Integer> notas) {
        this.nome = nome;
        this.notas = notas;
    }
    
    // Método que retorna a média das notas dos módulos
    public double media() {
        double soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }
    
    // Método que ordena as notas dos módulos da menor para a melhor
    public void ordenar() {
        Collections.sort(notas);
    }

    public String getNome() {
        return nome;
    }

    public List<Integer> getNotas() {
        return notas;
    }

}


