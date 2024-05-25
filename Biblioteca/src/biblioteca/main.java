 package biblioteca;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nSistema de Gerenciamento de Biblioteca");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Buscar Livro por Título");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consome a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    Livro livro = new Livro(titulo, autor, isbn);
                    biblioteca.adicionarLivro(livro);
                    break;
                case 2:
                    System.out.println("Lista de Livros:");
                    for (Livro l : biblioteca.listarLivros()) {
                        System.out.println(l);
                    }
                    break;
                case 3:
                    System.out.print("Título do livro a buscar: ");
                    String tituloBusca = scanner.nextLine();
                    Livro livroEncontrado = biblioteca.buscarLivroPorTitulo(tituloBusca);
                    if (livroEncontrado != null) {
                        System.out.println("Livro encontrado: " + livroEncontrado);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

