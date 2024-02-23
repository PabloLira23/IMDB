import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleUI {
    private Scanner scanner;
    private CatalogoFilmes catalogo;

    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
        this.catalogo = new CatalogoFilmes();
    }

    public void exibirMenuPrincipal() {
        boolean sair = false;
        while (!sair) {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. Adicionar Filme");
            System.out.println("2. Pesquisar Filme");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    adicionarFilme();
                    break;
                case 2:
                    pesquisarFilme();
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void adicionarFilme() {
        System.out.println("\n=== Adicionar Filme ===");
        System.out.print("Nome do Filme: ");
        String nome = scanner.nextLine();
        System.out.print("Ano de Lançamento: ");
        int anoLancamento = scanner.nextInt();
        System.out.print("Orçamento: ");
        double orcamento = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Nome do Diretor: ");
        String nomeDiretor = scanner.nextLine();
        Diretor diretor = new Diretor(nomeDiretor);
        Filme filme = new Filme(nome, anoLancamento, orcamento, descricao, diretor);
        catalogo.adicionarFilme(filme);
        System.out.println("Filme adicionado com sucesso!");
    }

    private void pesquisarFilme() {
        System.out.println("\n=== Pesquisar Filme ===");
        System.out.print("Digite o nome do filme: ");
        String nome = scanner.nextLine();
        List<Filme> resultados = catalogo.pesquisarFilmePorNome(nome);
        if (resultados.isEmpty()) {
            System.out.println("Nenhum filme encontrado com esse nome.");
        } else {
            System.out.println("Filmes encontrados:");
            for (Filme filme : resultados) {
                System.out.println(filme.getNome());
            }
        }
    }

    public void fecharScanner() {
        scanner.close();
    }
}
