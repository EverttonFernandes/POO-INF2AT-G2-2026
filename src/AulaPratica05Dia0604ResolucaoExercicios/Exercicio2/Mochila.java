package AulaPratica05Dia0604ResolucaoExercicios.Exercicio2;

import java.util.ArrayList;

public class Mochila {
    private String donoDaMochila;
    private ArrayList<String> listaDeItens = new ArrayList<>();

    public Mochila(String donoDaMochila) {
        this.donoDaMochila = donoDaMochila;
    }

    public void adicionarItem(String itemInformadoPeloUsuario) {
        this.listaDeItens.add(itemInformadoPeloUsuario);
    }

    public void exibirDetalhesDaMochila() {
        System.out.println("############### MOSTRANDO DETALHES DA MOCHILA ###############");
        System.out.println("O dono da mochila é: " + this.donoDaMochila);
        System.out.println("Os itens da mochila são: ");

        for (String itemDaMochila : this.listaDeItens) {
            System.out.println("- " + itemDaMochila);
        }
    }
}
