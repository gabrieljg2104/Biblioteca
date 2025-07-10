import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (int i = 0; i < livros.size(); i++) {
                System.out.println("ID " + i + ":");
                livros.get(i).exibirInformacoes();
            }
        }
    }

    public void emprestarLivro(int id) {
        if (id >= 0 && id < livros.size()) {
            livros.get(id).emprestarLivro();
        } else {
            System.out.println("ID inválido.");
        }
    }

    public void devolverLivro(int id) {
        if (id >= 0 && id < livros.size()) {
            livros.get(id).devolverLivro();
        } else {
            System.out.println("ID inválido.");
        }
    }
}