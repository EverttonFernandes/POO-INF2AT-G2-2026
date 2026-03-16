package Aula03Dia1603ConstrutoresVisibilidadePublicaPrivadaGettersESetters.Exemplo;

public class Pessoa {
    // TODO OBJETO POSSUI ATRIBUTOS QUE SÃO BASICAMENTE AS CARACTERISTICAS DO MESMO

    private String nome;
    private int idade;
    private String cpf;
    private String endereco;

    // USAMOS CONSTRUTORES PARA PASSAR PARAMETROS PARA A FUNÇÃO, ISSO FUNCIONA COMO SE FOSSE UMA FABRICA, SEM O CONSTRUTOR DO OBJETOS
    // NÃO SOMOS CAPAZES DE CRIAR O OBJETO (OU SEJA DAR A VIDA A ESTE OBJETO)
    public Pessoa(String nome, int idade, String cpf, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    // ATRAVÉS DOS MÉTODOS GETTERS NÓS CONSEGUMOS OBTER INFORMAÇÕES PRIVADAS DE UM DETERMINADA OBJETO, E ATRAVÉS DOS MÉTODOS SETTERS NÓS CONSEGUIMOS ALTERAR INFORMAÇÕES PRIVADAS DE UM DETERMINADO OBJETO

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
