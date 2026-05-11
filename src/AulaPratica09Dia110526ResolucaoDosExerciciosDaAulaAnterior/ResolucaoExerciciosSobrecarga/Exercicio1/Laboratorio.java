package AulaPratica09Dia110526ResolucaoDosExerciciosDaAulaAnterior.ResolucaoExerciciosSobrecarga.Exercicio1;

public class Laboratorio {
    private String nome;
    private int numeroDeComputadores;
    private boolean temAcessoAInternet;

    public Laboratorio(String nome) {
        this.nome = nome;
    }

    public Laboratorio(String nome, int numeroDeComputadores) {
        this.nome = nome;
        this.numeroDeComputadores = numeroDeComputadores;
    }

    public Laboratorio(String nome, int numeroDeComputadores, boolean temAcessoAInternet) {
        this.nome = nome;
        this.numeroDeComputadores = numeroDeComputadores;
        this.temAcessoAInternet = temAcessoAInternet;
    }

    public void exibirInformacoesDoLaboratorio() {
        System.out.println("########################################");
        System.out.println("Nome do laboratorio: " + this.nome);
        System.out.println("Quantidade de computadores " + this.numeroDeComputadores);

        if (this.temAcessoAInternet) {
            System.out.println("O laboratorio tem acesso a internet!");
        } else {
            System.out.println("O laboratorio NÃO tem acesso a internet!");
        }

    }

}
