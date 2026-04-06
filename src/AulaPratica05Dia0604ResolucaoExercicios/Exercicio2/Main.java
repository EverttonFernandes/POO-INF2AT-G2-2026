package AulaPratica05Dia0604ResolucaoExercicios.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do dono da mochila: ");
        String nomeDoDono = scanner.next();

        Mochila mochila = new Mochila(nomeDoDono);

        scanner.nextLine(); // para limpar o buffer do teclado
        for (int indice = 1; indice <= 5; indice++) {
            System.out.println("Diga o nome do item " + indice + " a ser adicionado na mochila: ");
            String itemInformadoPeloUsuario = scanner.nextLine();
            mochila.adicionarItem(itemInformadoPeloUsuario);
        }

        mochila.exibirDetalhesDaMochila();
        scanner.close();
    }
}
