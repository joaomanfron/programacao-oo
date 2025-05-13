/**
 * Guerreiro: ataque físico forte, reduz dano recebido pela metade na defesa, habilidade especial: Golpe Duplo.
 */
public class Guerreiro extends Personagem {
    /**
     * Construtor do Guerreiro.
     * @param nome Nome do guerreiro
     */
    public Guerreiro(String nome) {
        super(nome, 150, 30);
    }

    /**
     * Ataca um inimigo com ataque físico forte.
     * @param inimigo Personagem inimigo
     */
    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " ataca " + inimigo.nome + " com força!");
        inimigo.defender(ataqueBase);
    }

    /**
     * Reduz o dano recebido pela metade.
     * @param dano Dano recebido
     */
    @Override
    public void defender(int dano) {
        int danoReduzido = dano / 2;
        hp -= danoReduzido;
        System.out.println(nome + " defende! Dano reduzido para " + danoReduzido + ". HP restante: " + hp);
    }

    /**
     * Golpe Duplo: ataca duas vezes o mesmo inimigo.
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Golpe Duplo!");
        // Para fins de demonstração, atacar a si mesmo
        this.atacar(this);
        this.atacar(this);
    }

    /**
     * Exibe o status do guerreiro.
     */
    @Override
    public void status() {
        System.out.println("[Guerreiro] " + nome + " | HP: " + hp + " | Ataque Base: " + ataqueBase);
    }
} 