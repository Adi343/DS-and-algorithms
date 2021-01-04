public class square {

    public static void main(String[] args) {

        int[][] matrix = { { 1, 0, 1, 0, 0 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 1, 0 } };
        int[][] dp = new int[5][5];

        // write edge cases
        int i = 0, j = 0;
        int res = 0;

        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = 0;
                } else {
                    if (i > 0 && i < matrix.length && j > 0 && matrix[0].length < 5) {
                        if (matrix[i - 1][j] == 1 && matrix[i][j - 1] == 1 && matrix[i][j] == 1
                                && matrix[i - 1][j - 1] == 1) {
                            matrix[i][j] = 1 + matrix[i - 1][j - 1];
                            System.out.println(matrix[i][j]);
                        }
                    }
                }
            }
        }

        res = dp[matrix.length - 1][matrix[0].length - 1];
        System.out.println("res is " + res);
    }

}
