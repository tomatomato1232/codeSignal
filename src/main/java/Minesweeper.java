import java.util.Objects;

public class Minesweeper {
    int[][] solution(boolean[][] matrix) {

        int[][] ansMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int cnt = 0;
                for (int k = -1; k < 2; k++) {
                    for (int l = -1; l < 2; l++) {
                        if (k == 0 && l == 0) {
                            continue;
                        }
                        if (isValidIndex(matrix, i + k, j + l)) {
                            if (matrix[i + k][j + l]) {
                                cnt++;
                            }
                        }
                    }
                }
                ansMatrix[i][j] = cnt;
            }
        }
        return ansMatrix;
    }

    public static boolean isValidIndex(boolean[][] arr, int index, int index2) {
        try {
            Objects.checkIndex(index, arr.length);
            Objects.checkIndex(index2, arr[0].length);
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
        return true;
    }
}
