package Aula04Dia3003ResolucaoDosUltimosExercicios.ListaoPratico.Exercicio1;

public class Produto {
    private double preco;
    private String nome;
    private int quantidade;

    public Produto(double preco, String nome, int quantidade) {
        this.preco = preco;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void exibirInformacoes(){
        System.out.println("############### EXIBINDO INFORMAÇÕES DO PRODUTO ###############");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$ " + this.preco);
        if (this.quantidade > 0){
            System.out.println("O produto " + this.nome + " está disponível em estoque!");
        } else {
            System.out.println("O produto " + this.nome + " não está disponível em estoque!");
        }
    }
}
