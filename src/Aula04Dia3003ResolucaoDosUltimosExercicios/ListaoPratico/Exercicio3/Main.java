package Aula04Dia3003ResolucaoDosUltimosExercicios.ListaoPratico.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Acai acaiGrande = new Acai("Grande", 25.00);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá diga quantos sabores tu deseja colocar no teu açaí");
        int quantidadeDeSaboresInformadaPeloUsuario = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após ler o número

        for (int indice = 1; indice <= quantidadeDeSaboresInformadaPeloUsuario; indice++) {
            System.out.println("Informe o sabor " + (indice) + ":");
            String saborInformadoPeloUsuario = scanner.nextLine();
            acaiGrande.adicionarSabor(saborInformadoPeloUsuario);
        }

        acaiGrande.exibirInformacoesDoAcai();
        scanner.close();

    }
}
