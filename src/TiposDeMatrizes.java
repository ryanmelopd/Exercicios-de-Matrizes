import java.util.Scanner;
public class TiposDeMatrizes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada de dados para valor de linhas e colunas na matriz
        System.out.println("Digite os números de uma matriz. ");
        System.out.print("Número- de linhas: ");
        int linhas = input.nextInt();
        System.out.print("Número de colunas: ");
        int colunas = input.nextInt();

        // Entrada de dados para valores na matriz
        int[][] matriz = new int[linhas][colunas];
        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                System.out.print("Valor da posição [" + i + "][" + j + "]:");
                matriz[i][j] = input.nextInt();
            }
        }
        System.out.println();

        //Saida de dados
        int[][] matrizNula = gerarMatrizNula();
        int[][] matrizIdentidade = gerarMatrizIdentidade();

        System.out.println("Matriz nula:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizNula[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz quadrada? " + verificarMatrizQuadrada(linhas, colunas));
        System.out.println("Matriz simétrica? " + verificarMatrizSimetrica(matriz, linhas, colunas));
        System.out.println("Matriz antissimétrica? " + verificarMatrizAntiSsimetrica(matriz,linhas,colunas));
        System.out.println("Matriz identidade:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizIdentidade[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }

    // Gerando matriz nula 3x3
    public static int[][] gerarMatrizNula() {
        return new int[3][3];
    }

    // Verificando se a matriz é quadrada
    public static boolean verificarMatrizQuadrada(int l,int c) {
        return l == c;
    }

    // Verificando se a matriz é simétrica
    public static boolean verificarMatrizSimetrica(int[][] matriz,int linhas, int colunas) {
        if (!verificarMatrizQuadrada(linhas,colunas)) {
            return false;
        }
        for(int i = 0; i < linhas; i++) {
            for(int j = i + 1; j < colunas; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                    }
                }
            }
        return true;
    }

    // Verificando se a matriz é antissimétrica
    public static boolean verificarMatrizAntiSsimetrica(int[][] matriz,int linhas, int colunas) {
        if (!verificarMatrizQuadrada(linhas,colunas)) {
            return false;
        }
        for(int i = 0; i < linhas; i++) {
            if(matriz[i][i] != 0) {
                return false;
            }
            for(int j = i + 1; j < colunas; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Gerando matriz identidade 3x3
    public static int[][] gerarMatrizIdentidade() {
        int[][] matrizIdentidade = new int [3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if (i == j) {
                    matrizIdentidade[i][j] = 1;
                } else {
                    matrizIdentidade[i][j] = 0;
                }
            }
        }
        return matrizIdentidade;
    }
}


