package avaliacao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AlbumService albumService = new AlbumService();

        List<Album> albuns = new ArrayList<>();

        System.out.println("------- Bem vindo ao Avaliacaotify -------");
        int opcao;
        do {
            System.out.println("------- Escolha a opção desejada -------");
            System.out.println("1 - Criar Album\n2 - Pesquisar Album\n3 - Remover Album\n4 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Album albumCriado = albumService.criarAlbum();
                    albuns.add(albumCriado);
                    break;
                case 2:
                    String nomeAlbumPesquisado = albumService.pesquisarAlbum();
                    boolean albumEncontrado = false;
                    for(Album album : albuns){
                        if(album.getTitulo().equalsIgnoreCase(nomeAlbumPesquisado)){
                            albumEncontrado = true;
                            album.printarMusicas();
                        }
                        if (albumEncontrado = false){
                            System.out.println("Nao foi possivel encontrar o album digitado");
                        }
                    }
                    break;
                case 3:
                    String nomeAlbumExclusao = albumService.excluirAlbum();
                    boolean albumExclusaoEncontrado = false;
                    for(Album album : albuns){
                        if(album.getTitulo().equalsIgnoreCase(nomeAlbumExclusao)){
                            albumExclusaoEncontrado = true;
                            albuns.remove(album);
                        }
                        if (albumExclusaoEncontrado = false){
                            System.out.println("Nao foi possivel encontrar o album digitado");
                        }
                    }
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (opcao != 4);

        System.out.println("------- Obrigado por utilizar o Avaliacaotify -------");
        System.out.println("------- Até logo! -------");
    }
}