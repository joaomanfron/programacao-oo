/**
 * Mago: ataque mágico, defesa fraca, habilidade especial: Bola de Fogo (ataque em área).
 */
public class Mago extends Personagem {
    /**
     * Construtor do Mago.
     * @param nome Nome do mago
     */
    public Mago(String nome) {
        super(nome, 100, 40);
    }

    /**
     * Ataca um inimigo com magia.
     * @param inimigo Personagem inimigo
     */
    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " lança magia em " + inimigo.nome + "!");
        inimigo.defender(ataqueBase);
    }

    /**
     * Defesa fraca: recebe todo o dano.
     * @param dano Dano recebido
     */
    @Override
    public void defender(int dano) {
        hp -= dano;
        System.out.println(nome + " não consegue se defender bem! Dano: " + dano + ". HP restante: " + hp);
    }

    /**
     * Bola de Fogo: ataque em área (para fins de exemplo, ataca a si mesmo).
     */
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Bola de Fogo! (ataque em área)");
        // Para fins de demonstração, atacar a si mesmo
        this.defender(ataqueBase * 2);
    }

    /**
     * Exibe o status do mago.
     */
    @Override
    public void status() {
        System.out.println("[Mago] " + nome + " | HP: " + hp + " | Ataque Base: " + ataqueBase);
    }
} 