package Matrizes;
import java.util.Scanner;

public class AdicaoMatrizesExemplo16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada de dados para linhas e colunas das matrizes
        System.out.print("Insira a quantidade de linhas das matrizes: ");
        int linhas = input.nextInt();
        System.out.print("Insira a quantidade de colunas das matrizes: ");
        int colunas = input.nextInt();

        int[][] matriz1 = new int[linhas][colunas];
        int[][] matriz2 = new int[linhas][colunas];
        int[][] matriz3 = new int[linhas][colunas];

        // Entrada de dados da primeira matriz
        System.out.println("Insira os valores da primeira matriz.");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matriz1[i][j] = input.nextInt();
            }
        }
        // Entrada de dados da segunda matriz
        System.out.println("Insira os valores da segunda matriz.");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matriz2[i][j] = input.nextInt();
            }
        }
        // Soma de matrizes
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        // Imprime o resultado da soma das matrizes
        System.out.println("Resultado da soma das matrizes:");
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
