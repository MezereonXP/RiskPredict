package KNN;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MatrixUtilTest {

    @Test
    void getMat() {
        double[] num = {1, 2, 3, 4, 5, 6};
        double[][] mat = MatrixUtil.getMat(num, 2,2,3);
        System.out.println(mat.length);

    }
}