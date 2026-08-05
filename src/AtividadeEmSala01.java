/* Implemente a Matriz A do slide 8 - Matriz I. Faça 1 laço de repetição para
fazer a média do aluno 2 e um laço para fazer a soma dos pontos do primeiro bimestre. */

public class AtividadeEmSala01 {
    public static void main(String[] args) {
        float[][] notasDosAlunosAoLongoDoBimestre = {
                {7.5f, 8.0f, 9.0f, 6.5f},
                {6.0f, 7.5f, 8.5f, 7.0f},
                {9.0f, 8.5f, 7.0f, 8.0f}
        };

        // Média do aluno 2
        float soma = 0;
        for (int i = 0; i < notasDosAlunosAoLongoDoBimestre[1].length; i++) {
            soma += notasDosAlunosAoLongoDoBimestre[1][i];
        }
        float media = soma / notasDosAlunosAoLongoDoBimestre[1].length;

        // Soma do primeiro bimestre
        float somaPrimeiroBimestre = 0;
        for (int i = 0; i < notasDosAlunosAoLongoDoBimestre.length; i++) {
            somaPrimeiroBimestre += notasDosAlunosAoLongoDoBimestre[i][0];
        }

        // Saída de dados
        System.out.println("Média do aluno 2: " + media);
        System.out.println("Soma do primeiro bimestre: " + somaPrimeiroBimestre);
    }
}

