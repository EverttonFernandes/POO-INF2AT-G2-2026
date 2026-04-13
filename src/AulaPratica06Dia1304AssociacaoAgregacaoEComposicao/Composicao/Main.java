package AulaPratica06Dia1304AssociacaoAgregacaoEComposicao.Composicao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Computador> listaDeComputadores = new ArrayList<>();

        Computador computador1 = new Computador("Dell 1");
        Computador computador2 = new Computador("Dell 2");

        listaDeComputadores.add(computador1);
        listaDeComputadores.add(computador2);

        LaboratorioDeInformatica laboratorioDeInformatica = new LaboratorioDeInformatica(listaDeComputadores, "Laboratório de Informática 1");
        laboratorioDeInformatica.mostrarInformacoesDoLaboratorio();
    }
}
