public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;
    public boolean disponivel;

    public void exibirInformacoes() {
        System.out.println();
        System.out.println("Título do livro: " +titulo);
        System.out.println("Autor: " +autor);
        System.out.println("Ano de lançamento: " +anoPublicacao);
        System.out.print("Disponibilidade: ");
        if (disponivel) {
            System.out.println("Disponível");
        } else {
            System.out.println("Indisponível");
        }
        System.out.println();
    }

    public void emprestarLivro() {
        if (disponivel) {
            System.out.println("Livro emprestado com sucesso.");
            disponivel = false;
        } else {
            System.out.println("Livro já está emprestado.");
        }
    }

    public void devolverLivro() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro devolvido com sucesso");
        } else {
            System.out.println("Esse livro já está disponivel");
        }
    }
}
