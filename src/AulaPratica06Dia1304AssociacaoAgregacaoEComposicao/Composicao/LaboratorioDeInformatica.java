package AulaPratica06Dia1304AssociacaoAgregacaoEComposicao.Composicao;

import java.util.ArrayList;

public class LaboratorioDeInformatica {
    private ArrayList<Computador> computadores = new ArrayList<>();
    private String nomeDoLaboratorio;

    // Na composição MANDATORIAMENTE TU TEM QUE TER O OUTRO OBJETO DENTRO DO OBJETO A SER CRIADO!
    public LaboratorioDeInformatica(ArrayList<Computador> computadores, String nomeDoLaboratorio) {
        this.computadores = computadores;
        this.nomeDoLaboratorio = nomeDoLaboratorio;
    }

    public void adicionarComputadorAoLaboratorio(Computador computador) {
        computadores.add(computador);
    }

    public void mostrarInformacoesDoLaboratorio() {
        System.out.println("############ INFORMAÇÕES DO LABORATÓRIO DE INFORMÁTICA ############");
        System.out.println("Nome do laboratório de informática: " + nomeDoLaboratorio);
        for (Computador computador : this.computadores) {
            System.out.println("Marca do computador: " + computador.getMarcaDoComputador());
            System.out.println("--------------------------------------------------");
        }
    }
}
