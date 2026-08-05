public class MatrizesExemplo2 {
    static void main(String[] args) {
        int[][] matriz = new int[2][3];
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                matriz[i][j] = (i + 1) * (i + 1) - (j + 1) * (j + 1);
            }
        }
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}
