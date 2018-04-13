package KNN;

public class MatrixUtil {

    public static double[][] getMat(double[] series, int T, int C, int L) {
        if (series.length != (T + C + L - 1)) {
            System.out.println("Para Error!");
            return null;
        }

        double[][] mat = new double[L][T + C];
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < T + C; j++) {
                mat[i][j] = series[i + j];
            }
        }
        return mat;
    }

    public static double[] getTestSeries(double[] series, int begin, int L) {

        double[] mat = new double[L];
        for (int i = 0; i < L; i++) {
            mat[i] = series[i + begin];
        }
        return mat;
    }



    public static double[][] getMatC(double[][] m, int T, int C, int L) {

        double[][] mat = new double[C][L];
        for (int i = 0; i < L; i++) {
            for (int j = T; j < T + C; j++) {
                mat[j - T][i] = m[i][j];
            }
        }
        return mat;
    }

    public static double[][] getMatT(double[][] m, int T, int C, int L) {

        double[][] mat = new double[T][L];
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < T; j++) {
                mat[j][i] = m[i][j];
            }
        }
        return mat;
    }

    public static void printMatrix(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
