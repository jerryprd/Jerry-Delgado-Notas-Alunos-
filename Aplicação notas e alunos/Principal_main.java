import java.util.*;

// Classe principal com método main
    public class Main {
    public static void main(String[] args) {
        // Criação dos alunos com suas respectivas notas
        Aluno ana = new Aluno("ana", Arrays.asList(15, 14, 13, 17, 18, 20));
        Aluno joana = new Aluno("joana", Arrays.asList(17, 18, 12, 19, 15, 13));
        Aluno paulo = new Aluno("paulo", Arrays.asList(7, 14, 15, 12, 17, 18));
        
        // Teste dos métodos da classe Aluno
        System.out.println("Média de Ana: " + ana.media());
        ana.ordenar();
        System.out.println("Notas ordenadas de Ana: " + ana.notas);
        
        // Criação da disciplina e adição dos alunos
        Disciplina disciplina = new Disciplina("Concepção e Análise de Algoritmos", "Prof. Valério Santos",
                                                Arrays.asList(ana, joana, paulo));
        
        // Teste do método da classe Disciplina
        Aluno melhorAluno = disciplina.melhorAluno();
        System.out.println("O melhor aluno da disciplina é: " + melhor.nome + " com média " + melhor.media());
    }
}
