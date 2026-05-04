package AulaPratica07Dia2704ResolucaoDoExercicio5SobreAssociacaoAgregacaoEComposicao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Computador computador1 = new Computador("Dell 1");
        Computador computador2 = new Computador("Dell 2");

        Aluno joao = new Aluno("João", "12345");
        Aluno maria = new Aluno("Maria", "67890");
        Aluno pedro = new Aluno("Pedro", "54321");

        computador1.adicionarAlunoAoComputador(joao);
        computador1.adicionarAlunoAoComputador(maria);
//        computador2.adicionarAlunoAoComputador(pedro);

        ArrayList<Computador> listaDeComputadores = new ArrayList<>();

        listaDeComputadores.add(computador1);
        listaDeComputadores.add(computador2);

        Laboratorio laboratorio = new Laboratorio("Laboratorio 1", listaDeComputadores);
        ArCondicionado arCondicionado = new ArCondicionado("LG", "Split");

        laboratorio.setArCondicionado(arCondicionado);
        laboratorio.exibirDetalhes();
    }
}
