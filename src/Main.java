import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> biblioteca = new ArrayList<>();

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

        Livro livro3 = new Livro();
        livro3.titulo = "Dom Casmurro";
        livro3.autor = "Machado de Assis";
        livro3.anoPublicacao = 1899;
        livro3.disponivel = false;

        biblioteca.add(livro1);
        biblioteca.add(livro2);
        biblioteca.add(livro3);

        int opcao;
        do {
            System.out.println("===== Menu Biblioteca =====");
            System.out.println("1. Listar todos os livros disponiveis");
            System.out.println("2. Emprestar um livro");
            System.out.println("3. Devolver um livro");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n=== Lista de Livros ===");
                    for (int i = 0; i < biblioteca.size(); i++) {
                        System.out.println("ID " + i + ":");
                        biblioteca.get(i).exibirInformacoes();
                    }
                    break;

                case 2:
                    System.out.println("Digite o ID do livro para emprestar: ");
                    int idEmprestar = scanner.nextInt();
                    if (idEmprestar >= 0 && idEmprestar < biblioteca.size()) {
                        biblioteca.get(idEmprestar).emprestarLivro();
                    } else {
                        System.out.println("ID inválido");
                    }
                    break;

                case 3:
                    System.out.println("Digite o ID do livro para devolver: ");
                    int idDevolver = scanner.nextInt();
                    if (idDevolver >= 0 && idDevolver < biblioteca.size()) {
                        biblioteca.get(idDevolver).devolverLivro();
                    } else {
                        System.out.println("ID inválido");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}