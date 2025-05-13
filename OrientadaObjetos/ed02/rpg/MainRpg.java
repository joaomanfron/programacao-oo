/**
 * Classe MainRpg para testar o sistema de RPG de forma interativa.
 */
import java.util.Scanner;

public class MainRpg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Guerreiro g = new Guerreiro("Conan");
        Mago m = new Mago("Merlin");
        Arqueiro a = new Arqueiro("Legolas");
        Personagem[] personagens = {g, m, a};
        String[] tipos = {"Guerreiro", "Mago", "Arqueiro"};
        boolean sair = false;
        while (!sair) {
            System.out.println("\nEscolha o personagem para agir:");
            for (int i = 0; i < personagens.length; i++) {
                System.out.println((i+1) + " - " + tipos[i] + " (" + personagens[i].nome + ")");
            }
            System.out.println("4 - Sair");
            int psel = sc.nextInt();
            if (psel == 4) break;
            if (psel < 1 || psel > 3) continue;
            Personagem p = personagens[psel-1];
            boolean voltar = false;
            while (!voltar) {
                System.out.println("\nAções para " + tipos[psel-1] + ":");
                System.out.println("1 - Atacar outro personagem");
                System.out.println("2 - Usar Habilidade Especial");
                System.out.println("3 - Ver Status de todos");
                System.out.println("4 - Voltar");
                int op = sc.nextInt();
                switch(op) {
                    case 1:
                        System.out.println("Escolha o alvo:");
                        for (int i = 0; i < personagens.length; i++) {
                            if (i != psel-1) System.out.println((i+1) + " - " + tipos[i] + " (" + personagens[i].nome + ")");
                        }
                        int alvo = sc.nextInt();
                        if (alvo < 1 || alvo > 3 || alvo == psel) break;
                        p.atacar(personagens[alvo-1]);
                        break;
                    case 2:
                        p.usarHabilidadeEspecial();
                        break;
                    case 3:
                        for (int i = 0; i < personagens.length; i++) {
                            personagens[i].status();
                        }
                        break;
                    case 4:
                        voltar = true;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        }
        sc.close();
        System.out.println("Jogo de RPG encerrado.");
    }
} 