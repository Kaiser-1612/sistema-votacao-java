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





