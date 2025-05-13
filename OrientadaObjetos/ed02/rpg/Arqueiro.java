/**
 * Arqueiro: ataque médio com chance de ataque crítico, habilidade especial: Chuva de Flechas (3 ataques).
 */
public class Arqueiro extends Personagem {
    /**
     * Construtor do Arqueiro.
     * @param nome Nome do arqueiro
     */
    public Arqueiro(String nome) {
        super(nome, 120, 25);
    }

    /**
     * Ataca um inimigo com chance de crítico.
     * @param inimigo Personagem inimigo
     */
    @Override
    public void atacar(Personagem inimigo) {
        boolean critico = Math.random() < 0.2; // 20% de chance de crítico
        int dano = critico ? ataqueBase * 2 : ataqueBase;
        System.out.println(nome + (critico ? " acerta um CRÍTICO em " : " ataca ") + inimigo.nome + "! Dano: " + dano);
        inimigo.defender(dano);
    }

    /**
     * Defesa padrão: recebe todo o dano.
     * @param dano Dano recebido
     */
    @Override
    public void defender(int dano) {
        hp -= dano;
        System.out.println(nome + " recebe dano: " + dano + ". HP restante: " + hp);
    }

    /**
     * Chuva de Flechas: realiza 3 ataques (para fins de exemplo, ataca a si mesmo).
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Chuva de Flechas!");
        for (int i = 0; i < 3; i++) {
            this.atacar(this);
        }
    }

    /**
     * Exibe o status do arqueiro.
     */
    @Override
    public void status() {
        System.out.println("[Arqueiro] " + nome + " | HP: " + hp + " | Ataque Base: " + ataqueBase);
    }
} 