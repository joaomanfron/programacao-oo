/**
 * Classe base para personagens de RPG.
 */
public abstract class Personagem {
    /** Nome do personagem */
    protected String nome;
    /** Pontos de vida */
    protected int hp;
    /** Pontos de ataque base */
    protected int ataqueBase;

    /**
     * Construtor do personagem.
     * @param nome Nome do personagem
     * @param hp Pontos de vida
     * @param ataqueBase Pontos de ataque base
     */
    public Personagem(String nome, int hp, int ataqueBase) {
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
    }

    /**
     * Ataca um inimigo.
     * @param inimigo Personagem inimigo
     */
    public abstract void atacar(Personagem inimigo);

    /**
     * Defende-se de um ataque.
     * @param dano Dano recebido
     */
    public abstract void defender(int dano);

    /**
     * Usa a habilidade especial do personagem.
     */
    public abstract void usarHabilidadeEspecial();

    /**
     * Exibe o status do personagem.
     */
    public void status() {
        System.out.println("Personagem: " + nome + " | HP: " + hp + " | Ataque Base: " + ataqueBase);
    }

    /**
     * Verifica se o personagem está vivo.
     * @return true se hp > 0
     */
    public boolean estaVivo() {
        return hp > 0;
    }
} 