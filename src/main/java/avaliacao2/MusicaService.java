package avaliacao2;

import java.util.Scanner;

public class MusicaService {

    public MusicaService() {
    }

    public Musica criarMusica() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o título da musica:");
        String titulo = sc.nextLine();

        System.out.println("Digite a duração da musica(em segundos):");
        Integer duracao = sc.nextInt();
        while (duracao <= 0) {
            System.out.println("Duração invalida!");
            System.out.println("Digite a duração da musica(em segundos):");
            duracao = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Digite a qualidade da gravacao('Baixa' ou 'Alta'):");
        String qualidadeDeGravacao = sc.next();
        while (!(qualidadeDeGravacao.equals("Alta") || qualidadeDeGravacao.equals("Baixa"))) {
            System.out.println("Qualidade da gravacao invalida!");
            System.out.println("Digite a qualidade da gravacao('Baixa' ou 'Alta'):");
            qualidadeDeGravacao = sc.next();
            sc.nextLine();
        }

        System.out.println("Digite o ano de gravacaoo:");
        int anoDeGravacao = sc.nextInt();
        while (anoDeGravacao <= 0 || anoDeGravacao > 2022) {
            System.out.println("Ano de gravacao invalido!");
            System.out.println("Digite o ano de gravacao:");
            anoDeGravacao = sc.nextInt();
            sc.nextLine();
        }
        sc.nextLine();

        System.out.println("Digite o nome do(a) interprete:");
        String nomeInterprete = sc.nextLine();
        Interprete interprete = new Interprete(nomeInterprete);

        Musica musica = new Musica(titulo, duracao, qualidadeDeGravacao, anoDeGravacao, interprete);
        System.out.println("------- Musica cadastrada com sucesso! -------");
        System.out.println("");

        return musica;
    }
}
