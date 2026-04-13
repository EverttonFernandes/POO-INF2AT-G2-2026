package AulaPratica05Dia0604ResolucaoExercicios.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome da playlist: ");
        String nomeDaPlaylist = scanner.nextLine();

        System.out.println("Informe a quantidade de músicas da playlist: ");
        int quantidadeDeMusicasDaPlaylist = scanner.nextInt();
        scanner.nextLine(); // para limpar o buffer do teclado

        PlayList playList = new PlayList(nomeDaPlaylist);

        for (int indice = 1; indice <= quantidadeDeMusicasDaPlaylist; indice++) {
            System.out.println("Informe a musica " + indice + ": ");
            String musicaInformadaParaSerAdicionadaNaPlaylist = scanner.nextLine();
            playList.adicionarMusicaNaPlaylist(musicaInformadaParaSerAdicionadaNaPlaylist);
        }

        playList.exibirDetalhesDaPlaylist();

        System.out.println("Informe o nome da música a ser removida da playlist: ");
        String musicaASerRemovidaDaPlaylist = scanner.nextLine();
        playList.removerMusicaDaPlaylist(musicaASerRemovidaDaPlaylist);
        System.out.println("MOSTRANDO A PLAYLIST ATUALIZADA APÓS A REMOÇÃO DA MÚSICA: ");
        playList.exibirDetalhesDaPlaylist();
    }
}
