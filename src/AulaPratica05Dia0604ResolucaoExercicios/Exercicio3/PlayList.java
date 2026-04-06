package AulaPratica05Dia0604ResolucaoExercicios.Exercicio3;

import java.util.ArrayList;

public class PlayList {
    private String nomeDaPlayList;
    private ArrayList<String> listaDeMusicas = new ArrayList<>();

    public void removerMusicaDaPlaylist(String nomeDaMusicaASerRemovida) {
        // MANEIRA MAIS BRAÇAL DE REMOVER A MÚSICA DA PLAYLIST
        for (int indice = 0; indice < this.listaDeMusicas.size(); indice++) {
            // quando o indice for 1,nós comparamos a musica informada com a musica do indice 1
            if (nomeDaMusicaASerRemovida.equals(this.listaDeMusicas.get(indice))) {
                this.listaDeMusicas.remove(indice);
            }
        }

        // MANEIRA MAIS DIRETA E FÁCIL DE REMOVER A MÚSICA DA PLAYLIST
        this.listaDeMusicas.remove(nomeDaMusicaASerRemovida);
    }
}
