package Aula04Dia3003ResolucaoDosUltimosExercicios.ListaoPratico.Exercicio3;

import Aula04Dia3003ResolucaoDosUltimosExercicios.ListaoPratico.Exercicio2.Aluno;

import java.util.ArrayList;

public class Acai {
    private String tamanho;
    private double precoDoAcai;
    private ArrayList<String> listaDeSabores = new ArrayList<>();

    public Acai(String tamanho, double precoDoAcai) {
        this.tamanho = tamanho;
        this.precoDoAcai = precoDoAcai;
    }

    public void adicionarSabor(String sabor) {
        listaDeSabores.add(sabor);
    }

    public void exibirInformacoesDoAcai() {
        System.out.println("############### EXIBINDO INFORMAÇÕES DO AÇAÍ ###############");
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Preço: R$ " + this.precoDoAcai);
        System.out.println("Sabores adicionados:");

        for (String saborAtual : this.listaDeSabores) {
            // PARA CADA SABOR DA LISTA DE SABORES
            System.out.println("- " + saborAtual);
        }
    }
}
