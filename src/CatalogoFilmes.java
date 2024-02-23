import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatalogoFilmes {
    private Map<String, Filme> filmes;

    // Construtor
    public CatalogoFilmes() {
        this.filmes = new HashMap<>();
    }

    // Método para adicionar filme
    public void adicionarFilme(Filme filme) {
        filmes.put(filme.getNome().toLowerCase(), filme);
    }

    // Método para pesquisar filme por nome
    public List<Filme> pesquisarFilmePorNome(String nome) {
        List<Filme> resultados = new ArrayList<>();
        for (Filme filme : filmes.values()) {
            if (filme.getNome().toLowerCase().contains(nome.toLowerCase())) {
                resultados.add(filme);
            }
        }
        return resultados;
    }
}
