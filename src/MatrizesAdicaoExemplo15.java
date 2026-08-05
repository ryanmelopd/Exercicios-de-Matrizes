package Matrizes;
import java.util.Scanner;

public class MatrizesAdicaoExemplo15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrizUm = new int[2][2];
        int[][] matrizDois = new int[2][2];
        int[][] matrizTres = new int [2][2];

        // Entrada de dados da primeira matriz
        System.out.println("Insira os valores da primeira matriz.");
        for(int i = 0; i < matrizUm.length; i++) {
            for(int j = 0; j < matrizUm.length; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matrizUm[i][j] = input.nextInt();
            }
        }
        // Entrada de dados da segunda matriz
        System.out.println("Insira os valores da segunda matriz.");
        for(int i = 0; i < matrizDois.length; i++) {
            for(int j = 0; j < matrizDois.length; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matrizDois[i][j] = input.nextInt();
            }
        }
        // Soma de matrizes
        for(int i = 0; i < matrizUm.length; i++) {
            for(int j = 0; j < matrizUm.length; j++) {
                matrizTres[i][j] = matrizUm[i][j] + matrizDois[i][j];
            }
        }
        // Imprime o resultado da soma das matrizes
        System.out.println("Resultado da soma das matrizes:");
        for (int i = 0; i < matrizTres.length; i++) {
            for (int j = 0; j < matrizTres[i].length; j++) {
                System.out.print(matrizTres[i][j] + " ");
            }
            System.out.println();
        }
    }
}
