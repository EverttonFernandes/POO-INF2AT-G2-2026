package AulaPratica05Dia0604ResolucaoExercicios.Exercicio3;

import java.util.ArrayList;

public class PlayList {
    private String nomeDaPlayList;
    private ArrayList<String> listaDeMusicas = new ArrayList<>();

    public PlayList(String nomeDaPlayList) {
        this.nomeDaPlayList = nomeDaPlayList;
    }

    public void adicionarMusicaNaPlaylist(String musicaInformadaParaSerAdicionadaNaPlaylist) {
        this.listaDeMusicas.add(musicaInformadaParaSerAdicionadaNaPlaylist);
    }

    public void removerMusicaDaPlaylist(String nomeDaMusicaASerRemovida) {
        // MANEIRA MAIS COMPLEXA, PORÉM COMO VANTAGEM CONSEGUIMOS VALIDAR SE A EXCLUSÃO FOI REALIZADA OU NÃO!
        boolean encontrouAMusicaNaPlaylist = false;
        for (int indice = 0; indice < this.listaDeMusicas.size(); indice++) {
            // quando o indice for 1,nós comparamos a musica informada com a musica do indice 1
            if (nomeDaMusicaASerRemovida.equals(this.listaDeMusicas.get(indice))) {
                System.out.println("A música " + nomeDaMusicaASerRemovida + " foi encontrada na playlist e será removida!");
                this.listaDeMusicas.remove(indice);
                encontrouAMusicaNaPlaylist = true;
                break;
            }
        }

        if (encontrouAMusicaNaPlaylist == false) {
            System.out.println("A música " + nomeDaMusicaASerRemovida + " não foi encontrada na playlist!");
        }

        // MANEIRA MAIS DIRETA E FÁCIL DE REMOVER A MÚSICA DA PLAYLIST PORÉM SEM VALIDAÇÕES CONCRETAS
//        this.listaDeMusicas.remove(nomeDaMusicaASerRemovida);
    }

    public void exibirDetalhesDaPlaylist() {
        System.out.println("############### MOSTRANDO DETALHES DA PLAYLIST ###############");
        System.out.println("O nome da playlist é: " + this.nomeDaPlayList);
        System.out.println("As músicas da playlist são: ");

        for (String musica : this.listaDeMusicas) {
            System.out.println("- " + musica);
        }
    }
}
