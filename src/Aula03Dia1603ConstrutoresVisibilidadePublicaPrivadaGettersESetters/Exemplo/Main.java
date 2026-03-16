package Aula03Dia1603ConstrutoresVisibilidadePublicaPrivadaGettersESetters.Exemplo;

public class Main {
    public static void main(String[] args) {

        Pessoa maria = new Pessoa("Maria", 18, "454.123.456-78", "Rua das Flores, 123");

        System.out.println("Nome: " + maria.getNome());
        System.out.println("Idade: " + maria.getIdade());
        System.out.println("CPF: " + maria.getCpf());
        System.out.println("Endereço: " + maria.getEndereco());

        // COMO VAMOS TROCAR O ENDEREÇO DA MARIA?
        // SENDO QUE O ENDEREÇO DA MARIA É PRIVADO?
        // ATRAVÉS DE MÉTODOS SETTERS NÓS CONSEGUIMOS ALTERAR INFORMAÇÕES PRIVADAS DE UM DETERMINADO OBJETO

        maria.setEndereco("Rua das Acacias, 456");

        System.out.println("Novo Endereço: " + maria.getEndereco());
    }
}
