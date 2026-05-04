package AulaPratica07Dia2704ResolucaoDoExercicio5SobreAssociacaoAgregacaoEComposicao;

import java.util.ArrayList;

public class Laboratorio {
    private String nomeLaboratorio;
    private ArCondicionado arCondicionado;
    private ArrayList<Computador> listaDeComputadores = new ArrayList<>();

    // AQUI UMA COMPOSIÇÃO
    public Laboratorio(String nomeLaboratorio, ArrayList<Computador> listaDeComputadores) {
        this.nomeLaboratorio = nomeLaboratorio;
        this.listaDeComputadores = listaDeComputadores;
    }

    // AQUI A ASSOCIAÇÃO
    public void setArCondicionado(ArCondicionado arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public void exibirDetalhes() {
        System.out.println("Nome do Laboratório: " + nomeLaboratorio);
        System.out.println("Computadores no Laboratório:");

        for (Computador computador : listaDeComputadores) {
            System.out.println("- " + computador.getModelo());
            System.out.println("  Alunos usando o computador:");
            for (Aluno aluno : computador.getListaDeAlunos()) {
                System.out.println("    - " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + ")");
            }
        }
        if (arCondicionado != null) {
            System.out.println("Ar Condicionado: " + arCondicionado.getMarca() + " - " + arCondicionado.getTemperatura());
        } else {
            System.out.println("Nenhum ar condicionado associado ao laboratório.");
        }
    }
}
