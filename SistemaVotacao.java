import java.util.Scanner;

public class SistemaVotacao {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Sistema de votação iniciado.");
        scanner.close();
    }

    static final int maxCandidatos = 5;
    static final int totalTurmas = 3;
    static final int maxPorTurma = 10;
    int[] numCandi = new int[maxCandidatos];
    String[] nomCandi = new String[maxCandidatos];
    int[] votCandi = new int[maxCandidatos];
    int[][] votPorTurma = new int[totalTurmas][maxPorTurma];
    int[] quantiVtTurma = new int[totalTurmas];
    int quantiCandi = 0;
    }
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {
        System.out.println("\n===== SISTEMA DE VOTAÇÃO =====");
        System.out.println("1 - Cadastrar candidatos");
        System.out.println("2 - Iniciar votação");
        System.out.println("3 - Exibir resultado");
        System.out.println("4 - Exibir matriz de votos");
        System.out.println("5 - Sair");

        System.out.print("Opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Cadastro selecionado.");
                break;

            case 2:
                System.out.println("Votação selecionada.");
                break;

            case 3:
                System.out.println("Resultado selecionado.");
                break;

            case 4:
                System.out.println("Matriz selecionada.");
                break;

            case 5:
                System.out.println("Sistema encerrado.");
                break;

            default:
                System.out.println("Opção inválida.");
        }

    } while (opcao != 5);
}