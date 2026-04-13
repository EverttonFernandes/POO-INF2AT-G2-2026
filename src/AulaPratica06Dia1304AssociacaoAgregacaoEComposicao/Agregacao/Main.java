package AulaPratica06Dia1304AssociacaoAgregacaoEComposicao.Agregacao;

public class Main {
    public static void main(String[] args) {
        // O Java tem um construtor nativo, caso não for declarado ele começa vazio (sem atributos definos)
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        Produto playstation5 = new Produto("PlayStation 5", 4999.99, "Console de videogame da Sony");
        Produto notebook = new Produto("Notebook Dell", 2999.99, "Computador portátil da Dell");

        carrinhoDeCompras.adicionarProdutoAoCarrinho(playstation5);
        carrinhoDeCompras.adicionarProdutoAoCarrinho(notebook);

        carrinhoDeCompras.mostrarDetalhesDosProdutosNoCarrinho();
    }
}
