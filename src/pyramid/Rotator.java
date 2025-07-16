package pyramid;

public class Rotator {

    public static String[][] rotateClockwise(String[][] matrix) {
        int matrixLen = matrix.length;

        String[][] newMatrix = new String[matrixLen][matrixLen];

        for (int i = 0; i < matrixLen; i++) {
            for (int j = 0; j < matrixLen; j++) {
                newMatrix[i][j] = matrix[j][i];
            }

        }
        return newMatrix;
    }

    public static String[][] rotateCounterClockwise(String[][] matrix) {
        int matrixLen = matrix.length;

        String[][] newMatrix = new String[matrixLen][matrixLen];

        for (int i = 0; i < matrixLen; i++) {
            for (int j = 0; j < matrixLen; j++) {
                newMatrix[matrixLen - i - 1][matrixLen - j - 1] = matrix[j][i];
            }

        }
        return newMatrix;
    }

    public static String[][] rotate180(String[][] matrix) {
        int matrixLen = matrix.length;

        String[][] newMatrix = new String[matrixLen][matrixLen];

        for (int i = 0; i < matrixLen; i++) {
            for (int j = 0; j < matrixLen; j++) {
                newMatrix[matrixLen - j - 1][matrixLen - i - 1] = matrix[j][i];
            }

        }
        return newMatrix;
    }
}