package avaliacao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlbumService {

    MusicaService musicaService = new MusicaService();
    Scanner sc = new Scanner(System.in);


    public Album criarAlbum(){

        System.out.println("--------INICIANDO CRIACAO DO ALBUM--------");
        System.out.println("Digite o titulo do album:");
        String titulo = sc.nextLine();

        System.out.println("Digite o ano de lancamento do album:");
        int anoDelancamento = sc.nextInt();
        while(anoDelancamento <= 0){
            System.out.println("Ano de gravacao invalido!");
            System.out.println("Digite o ano de gravacao:");
            anoDelancamento = sc.nextInt();
            sc.nextLine();
        }

        List<Musica> musicas = new ArrayList<>();
        int quantidadeDeMusicas = 1;
        System.out.println("Iniciando o cadastro da musica " + quantidadeDeMusicas);

        Musica musica = musicaService.criarMusica();
        musicas.add(musica);
        Album album = new Album(titulo, anoDelancamento, musicas);
        quantidadeDeMusicas++;

        System.out.println("Menu:\n1 - Cadastrar nova musica \n2 - Finalizar album");
        int opcao = sc.nextInt();

        while(opcao != 2){
            while(opcao != 1){
                System.out.println("Operação invalida!");
                System.out.println("Menu:\n1 - Cadastrar nova musica \n2 - Finalizar album");
                opcao = sc.nextInt();
            }
            System.out.println("Iniciando o cadastro da musica " + quantidadeDeMusicas);

            musica = musicaService.criarMusica();
            musicas.add(musica);
            quantidadeDeMusicas++;

            System.out.println("Menu:\n1 - Cadastrar nova musica \n2 - Finalizar album");
            opcao = sc.nextInt();
        }

        System.out.println("--------ALBUM CRIADO COM SUCESSO!--------");
        sc.nextLine();

        return album;
    }

    public String pesquisarAlbum(){
        System.out.println("Digite o nome do album a ser pesquisado:");
        String nomeDoAlbum = sc.nextLine();

        return nomeDoAlbum;
    }

    public String excluirAlbum(){
        System.out.println("Digite o nome do album a ser excluido:");
        String nomeDoAlbum = sc.nextLine();

        return nomeDoAlbum;
    }

}
