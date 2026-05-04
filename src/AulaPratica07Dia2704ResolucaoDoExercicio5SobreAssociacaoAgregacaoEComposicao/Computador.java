package AulaPratica07Dia2704ResolucaoDoExercicio5SobreAssociacaoAgregacaoEComposicao;

import java.util.ArrayList;

public class Computador {
    private String modelo;
    private ArrayList<Aluno> listaDeAlunos = new ArrayList<>();

    public Computador(String modelo) {
        this.modelo = modelo;
    }

    // AQUI A AGREGAÇÃO
    public void adicionarAlunoAoComputador(Aluno aluno){
        this.listaDeAlunos.add(aluno);
    }

    public String getModelo() {
        return modelo;
    }

    public ArrayList<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }
}

