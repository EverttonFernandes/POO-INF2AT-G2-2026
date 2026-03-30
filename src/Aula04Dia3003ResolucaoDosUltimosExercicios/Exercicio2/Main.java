package Aula04Dia3003ResolucaoDosUltimosExercicios.Exercicio2;

public class Main {
    public static void main(String[] args) {
        Produto playstation5 = new Produto("PlayStation 5", 5000.00, "Eletrônicos");
        Produto iphone = new Produto("Iphone", 6000.00, "Eletrônicos");

        playstation5.exibirInformacoes();
        iphone.exibirInformacoes();

        iphone.setPreco(5000.00);
        System.out.println("MOSTRANDO PREÇO DO VALOR DO IPHONE APÓS ALTERAÇÃO");
        iphone.exibirInformacoes();
    }
}
