package AulaPratica05Dia0604ResolucaoExercicios.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do lanche: ");
        String nomeDoLanche = scanner.nextLine();

        System.out.println("Informe o preço do lanche: ");
        double precoDoLanche = scanner.nextDouble();
        scanner.nextLine(); // para limpar o buffer do teclado
        Lanche lanche = new Lanche(nomeDoLanche, precoDoLanche);

        for (int indice = 1; indice <= 4; indice++) {
            System.out.println("Diga o nome do ingrediente " + indice + " a ser adicionado ao lanche: ");
            String ingredienteInformadoPeloUsuario = scanner.nextLine();
            lanche.adicionarIngrediente(ingredienteInformadoPeloUsuario);
        }

        lanche.exibirDetalhesDoLanche();
        scanner.close();
    }
}
