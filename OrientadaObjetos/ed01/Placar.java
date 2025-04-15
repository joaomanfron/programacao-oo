import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Classe responsável por gerenciar o ranking de jogadores.
 * Armazena e exibe as pontuações dos jogadores em ordem decrescente.
 */
public class Placar {
    /** Lista de jogadores ordenada por pontuação */
    private ArrayList<Jogador> ranking;

    /**
     * Construtor da classe Placar.
     * Inicializa a lista de ranking.
     */
    public Placar() {
        this.ranking = new ArrayList<>();
    }

    /**
     * Adiciona um jogador ao ranking e ordena a lista por pontuação.
     * @param j Jogador a ser adicionado
     */
    public void adicionarJogador(Jogador j) {
        ranking.add(j);
        Collections.sort(ranking, new Comparator<Jogador>() {
            @Override
            public int compare(Jogador j1, Jogador j2) {
                return Integer.compare(j2.getPontuacao(), j1.getPontuacao());
            }
        });
    }

    /**
     * Exibe o ranking de todos os jogadores cadastrados.
     * Mostra o nome e a pontuação de cada jogador em ordem decrescente.
     */
    public void mostrarRanking() {
        System.out.println("\n=== RANKING DE JOGADORES ===");
        for (int i = 0; i < ranking.size(); i++) {
            Jogador j = ranking.get(i);
            System.out.printf("%dº lugar: %s - %d pontos\n", 
                i + 1, j.getNome(), j.getPontuacao());
        }
        System.out.println("===========================\n");
    }
} 