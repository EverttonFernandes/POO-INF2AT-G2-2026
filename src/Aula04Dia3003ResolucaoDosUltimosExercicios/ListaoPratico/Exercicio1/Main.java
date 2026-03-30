package Aula04Dia3003ResolucaoDosUltimosExercicios.ListaoPratico.Exercicio1;

public class Main {
    public static void main(String[] args) {
        Produto playstation5 = new Produto(5000.00, "PlayStation 5", 10);
        Produto iphone = new Produto(6000.00, "Iphone", 0);

        playstation5.exibirInformacoes();
        iphone.exibirInformacoes();
    }
}
