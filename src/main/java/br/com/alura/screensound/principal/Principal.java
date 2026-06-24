package br.com.alura.screensound.principal;

import br.com.alura.screensound.model.Artista;
import br.com.alura.screensound.model.TipoArtista;

import java.util.Random;
import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);

    public void exibeMenu() {
        var opcao = -1;

        while (opcao!= 9){
            var menu = """
                    ***Screen Sound Músicas***
                    
                    1 - Cadastrar artista
                    2 - Cadastrar músicas
                    3 - Listar músicas
                    4 - Baixar músicas
                    5 - Pesquisar dados  sobre o artista
                    
                    9 - Sair
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao){
                case 1:
                    cadastrarArtistas();
                    break;
                case 2:
                    cadastrarMusicas();
                    break;
                case 3:
                    listarMusicas();
                    break;
                case 4:
                    baixarMusicas();
                    break;
                case 5:
                    pesquisarDadosDoArtista();
                    break;
                case 9:
                    System.out.println("Encerrando a aplicação");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }


        
    }

    private void pesquisarDadosDoArtista() {

    }

    private void baixarMusicas() {
    }

    private void listarMusicas() {
    }

    private void cadastrarMusicas() {
    }

    private void cadastrarArtistas() {
        System.out.println("informe o nome desse artista: ");
        var nome = leitura.nextLine();
        System.out.println("Informe o tipo desse artista: (solo, dupla ou banda)");
        var tipo = leitura.nextLine();
        TipoArtista tipoArtista = TipoArtista.valueOf(tipo.toUpperCase());
        Artista artista = new Artista(nome, tipoArtista);
        repositorio.save(artista);

    }
}
