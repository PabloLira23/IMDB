import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private int anoLancamento;
    private double orcamento;
    private String descricao;
    private Diretor diretor;
    private List<Ator> atores;

    // Construtor
    public Filme(String nome, int anoLancamento, double orcamento, String descricao, Diretor diretor) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.diretor = diretor;
        this.atores = new ArrayList<>();
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    // Método para adicionar atores ao filme
    public void adicionarAtor(Ator ator) {
        atores.add(ator);
    }
}
