# Relatório técnico - Algoritmo para cálculo de notas de alunos - CAA
## Introdução
    Este algoritmo tem como objetivo calcular a média das notas dos módulos de avaliação contínua de alunos e ordenar as notas do menor para o maior. Além disso, é possível criar uma disciplina com uma lista de alunos e obter o melhor aluno da disciplina, com base na sua média.

## Implementação

    A classe Aluno representa um aluno, que é definido por um nome e um vetor de inteiros que contém as notas de cada módulo de avaliação. Nessa classe, há dois métodos importantes: o método media(), que calcula a média das notas dos módulos da disciplina, e o método ordenar(), que permite ordenar as notas dos módulos da menor para a melhor.

    A classe Disciplina representa uma disciplina, que é composta por um título, o nome do docente e uma lista duplamente ligada de alunos. Nessa classe, há o método melhorAluno(), que retorna o aluno com a melhor nota (média dos módulos) da disciplina.

    A classe Main contém o método principal main(), que é responsável por criar os objetos de aluno, criar a disciplina e testar os métodos desenvolvidos. É nessa classe que são criados os alunos, adicionados à disciplina e são chamados os métodos media(), ordenar() e melhorAluno() para exibir seus resultados no console.


## Conclusão

    Em resumo, o código apresentado é uma implementação simples de uma solução para gerenciar notas de alunos em disciplinas, utilizando Java. As classes Aluno e Disciplina foram desenvolvidas de forma a permitir uma fácil adaptação para outras situações, além de apresentarem operações úteis de média e ordenação das notas.

    O algoritmo desenvolvido em Java permite calcular a média das notas dos módulos de avaliação contínua de alunos, ordenar as notas do menor para o maior e obter o aluno com a melhor média de uma disciplina. Ele pode ser facilmente adaptado e utilizado em diferentes contextos acadêmicos para análise e manipulação de dados de alunos.