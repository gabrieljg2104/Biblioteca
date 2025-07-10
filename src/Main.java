

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro();
        livro1.titulo = "O Senhor dos Anéis";
        livro1.autor = "J.R.R. Tolkien";
        livro1.anoPublicacao = 1954;
        livro1.disponivel = true;

        Livro livro2 = new Livro();
        livro2.titulo = "1984";
        livro2.autor = "George Orwell";
        livro2.anoPublicacao = 1949;
        livro2.disponivel = true;

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        int opcao;
        do {
            System.out.println("\n===== MENU BIBLIOTECA =====");
            System.out.println("1. Listar todos os livros");
            System.out.println("2. Emprestar um livro");
            System.out.println("3. Devolver um livro");
            System.out.println("4. Cadastrar novo livro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    biblioteca.listarLivros();
                    break;

                case 2:
                    System.out.print("Digite o ID do livro para emprestar: ");
                    int idEmprestar = scanner.nextInt();
                    biblioteca.emprestarLivro(idEmprestar);
                    break;

                case 3:
                    System.out.print("Digite o ID do livro para devolver: ");
                    int idDevolver = scanner.nextInt();
                    biblioteca.devolverLivro(idDevolver);
                    break;

                case 4:
                    Livro novoLivro = new Livro();
                    System.out.print("Título: ");
                    novoLivro.titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    novoLivro.autor = scanner.nextLine();
                    System.out.print("Ano de publicação: ");
                    novoLivro.anoPublicacao = scanner.nextInt();
                    novoLivro.disponivel = true;
                    scanner.nextLine();
                    biblioteca.adicionarLivro(novoLivro);
                    System.out.println("Livro cadastrado com sucesso!");
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
