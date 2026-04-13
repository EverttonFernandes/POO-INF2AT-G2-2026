package AulaPratica06Dia1304AssociacaoAgregacaoEComposicao.Agregacao;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProdutoAoCarrinho(Produto produto) {
        produtos.add(produto);
    }

    public void mostrarDetalhesDosProdutosNoCarrinho() {
        System.out.println("############ PRODUTOS NO CARRINHO DE COMPRAS ############");
        if (produtos.isEmpty()) {
            System.out.println("O carrinho de compras não possui produtos!");
        } else {
            for (Produto produto : this.produtos) {
                System.out.println("Nome do produto: " + produto.getNomeDoProduto());
                System.out.println("Preço do produto: " + produto.getPrecoDoProduto());
                System.out.println("Descrição do produto: " + produto.getDescricaoDoProduto());
                System.out.println("--------------------------------------------------");
            }
        }
    }
}
