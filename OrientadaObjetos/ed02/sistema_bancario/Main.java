/**
 * Classe Main para testar o sistema bancário de forma interativa.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaCorrente cc = new ContaCorrente("Alice", 1000);
        ContaPoupanca cp = new ContaPoupanca("Bob", 1500);
        ContaSalario cs = new ContaSalario("Carlos", 1200);
        Conta[] contas = {cc, cp, cs};
        String[] tipos = {"Conta Corrente", "Conta Poupança", "Conta Salário"};
        boolean sair = false;
        while (!sair) {
            System.out.println("\nSelecione a conta:");
            for (int i = 0; i < contas.length; i++) {
                System.out.println((i+1) + " - " + tipos[i] + " (" + contas[i].cliente + ")");
            }
            System.out.println("4 - Sair");
            int contaSel = sc.nextInt();
            if (contaSel == 4) break;
            if (contaSel < 1 || contaSel > 3) continue;
            Conta conta = contas[contaSel-1];
            boolean voltar = false;
            while (!voltar) {
                System.out.println("\nOperações para " + tipos[contaSel-1] + ":");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Transferir");
                System.out.println("4 - Aplicar Juros Diários");
                System.out.println("5 - Imprimir Extrato");
                System.out.println("6 - Voltar");
                int op = sc.nextInt();
                switch(op) {
                    case 1:
                        System.out.print("Valor para depositar: ");
                        double dep = sc.nextDouble();
                        conta.depositar(dep);
                        break;
                    case 2:
                        System.out.print("Valor para sacar: ");
                        double saq = sc.nextDouble();
                        if (!conta.sacar(saq)) System.out.println("Saldo insuficiente!");
                        break;
                    case 3:
                        System.out.println("Transferir para:");
                        for (int i = 0; i < contas.length; i++) {
                            if (i != contaSel-1) System.out.println((i+1) + " - " + tipos[i] + " (" + contas[i].cliente + ")");
                        }
                        int dest = sc.nextInt();
                        if (dest < 1 || dest > 3 || dest == contaSel) break;
                        System.out.print("Valor para transferir: ");
                        double val = sc.nextDouble();
                        if (!conta.transferir(contas[dest-1], val)) System.out.println("Saldo insuficiente!");
                        break;
                    case 4:
                        conta.aplicarJurosDiarios();
                        System.out.println("Juros aplicados.");
                        break;
                    case 5:
                        conta.imprimirExtrato();
                        break;
                    case 6:
                        voltar = true;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        }
        sc.close();
        System.out.println("Sistema bancário encerrado.");
    }
} 